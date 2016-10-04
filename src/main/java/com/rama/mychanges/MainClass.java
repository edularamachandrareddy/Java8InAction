package com.rama.mychanges;

import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		Stream<String> stream=Stream.of("rama","chandra","reddy");
	List<String>	list=stream.filter(s -> s.length()>=5).collect(toList());
		
System.out.println(list);
	}

}
