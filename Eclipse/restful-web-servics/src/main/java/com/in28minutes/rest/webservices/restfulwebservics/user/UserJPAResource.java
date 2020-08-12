package com.in28minutes.rest.webservices.restfulwebservics.user;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
public class UserJPAResource {
//	@Autowired
//	private UserDaoService service;
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PostRepository postRepository;
	
	@GetMapping("/jpa/users")
	public List<User> retrieveAllUsers() {
		return userRepository.findAll();
	}
	@GetMapping(path="/jpa/users/{id}")
	public EntityModel<Optional<User>> retrieveUser(@PathVariable int id) {
		Optional<User> user = userRepository.findById(id);
		if(!user.isPresent()) throw new UserNotFoundException("id-" + id);
		
		//HATEOAS
		//"all-users", SERVER_PATH + "/users"
		//retrieveAllUsers
		EntityModel<Optional<User>> resource = EntityModel.of(user);
		
		WebMvcLinkBuilder linkTo = 
				linkTo(methodOn(this.getClass()).retrieveAllUsers());
	
		resource.add(linkTo.withRel("all-users"));
		
//		linkTo = 
//				linkTo(methodOn(this.getClass()).retrieveUser(id));
//		resource.add(linkTo.withRel("this-user"));
		
		return resource;     //service.findOne(id);
	}
	
	// input - details of user
	// output - CREATED & return the created URI 
	@PostMapping(path="/jpa/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
		User savedUser = userRepository.save(user);
		// CREATED
		// /user/{id}		savedUser.getId()
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping(path="/jpa/users/{id}")
	public void deleteUser(@PathVariable int id) {
		Optional<User> user = userRepository.findById(id);
		if(!user.isPresent()) throw new UserNotFoundException("id-" + id);
		userRepository.deleteById(id);
	}
	
	@GetMapping(path="/jpa/users/{id}/posts")
	public List<Post> retrieveUserAllPosts(@PathVariable int id) {
		Optional<User> user = userRepository.findById(id);
		if(!user.isPresent()) throw new UserNotFoundException("id-" + id);
		
		//HATEOAS
		//"all-users", SERVER_PATH + "/users"
		//retrieveAllUsers
		
		
//		linkTo = 
//				linkTo(methodOn(this.getClass()).retrieveUser(id));
//		resource.add(linkTo.withRel("this-user"));
		
		return user.get().getPosts();
	}
	
	@PostMapping(path="/jpa/users/{id}/posts")
	public ResponseEntity<Object> createPost(@PathVariable int id, @Valid @RequestBody Post post) {
		
		Optional<User> userOptional = userRepository.findById(id);
		if(!userOptional.isPresent()) {
			throw new UserNotFoundException("id-" + id);
		}
		User user = userOptional.get();
		
		post.setUser(user);
		
		postRepository.save(post);
		// CREATED
		// /user/{id}		savedUser.getId()
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(post.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}

}
