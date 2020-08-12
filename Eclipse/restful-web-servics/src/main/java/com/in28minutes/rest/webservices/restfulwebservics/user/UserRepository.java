package com.in28minutes.rest.webservices.restfulwebservics.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
