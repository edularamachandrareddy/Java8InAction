package com.rama.mychanges;

import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("rama", "chandra", "reddy");
		List<String> lis = stream.filter(s -> s.length() >= 5).collect(toList());
		System.out.println(lis);
		Stream<Person> stream1 = Stream.of(new Person(10, "reddy", "knl"),new Person(11, "rama", "bpl"));
		List<String> lis1=stream1.map(p -> p.getName()).filter(p -> p.length()==5 ).collect(toList());
		System.out.println(lis1);
	}
}
