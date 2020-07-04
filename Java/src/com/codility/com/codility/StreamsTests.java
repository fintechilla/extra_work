package com.codility;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class StreamsTests {


    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        stringCollection.stream()
                .map(String::toUpperCase)
//                .filter((s)->s.startsWith("A"))
//                .filter((s)->s.startsWith("a"))
                .sorted((a, b) -> a.compareTo(b))
                .forEachOrdered(System.out::println);

        boolean anyStartsWithA =
                stringCollection.stream()
                        .anyMatch((s) -> s.startsWith("a"));
        System.out.println(anyStartsWithA);

        boolean noneStartsWithZ =
                stringCollection
                        .stream()
                        .noneMatch((s) -> s.startsWith("z"));
        System.out.println(noneStartsWithZ);

        //Count - terminal operation => number of elements as long

        long startsWithB =
                stringCollection
                        .stream()
                        .filter(s -> s.startsWith("b"))
                        .count();
        System.out.println(startsWithB);

        //Optional - a terminal operation with a given function => Optional
        final String delim = "??";
        Optional<String> reduced =
                stringCollection
                        .stream()
                        .sorted()
                        .reduce((s1, s2) -> s1 + delim + s2);
        reduced.ifPresent(System.out::println);

        //Parallel Streams
        int max = 10000000;
        List<String> values = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }
        //Sequential Sort
        long t0 = System.nanoTime();
        long count = values.stream().sorted().count();

        long t1 = System.nanoTime();

        long micros = TimeUnit.NANOSECONDS.toMicros(t1 - t0);
        System.out.format("Sequential sort count : %d took %d musec %d nS", count, micros, (t1 - t0));

        //Parallel Sort
        long t00 = System.nanoTime();
        count = values.parallelStream().sorted().count();

        long t11 = System.nanoTime();

        micros = TimeUnit.NANOSECONDS.toMicros(t11 - t00);
        System.out.println(String.format("\nParallel sort count : %d took %d musec %d nS", count, micros, (t11 - t00)));


    }
}
