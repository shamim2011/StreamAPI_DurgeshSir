package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.io.*;

public class FilterDemo_04 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,5,7,22);
//		List<Integer> newList = list.stream().filter(e ->e%2==0).collect(Collectors.toList());
//		System.out.println(newList);
		
		
		
		// Instead of above two line we use bellow line
//		list.stream().filter(e->e%2==0).forEach(n->System.out.println(n));
		list.stream().filter(e->e%2==0).forEach(System.out::println);
		
		
		
		List<String> names = List.of("Samim","Mohon","Durgesh","Korim","Danesh");
//		List<String> longName = names.stream().filter(e -> e.length()>6 && e.length()<8).collect(Collectors.toList());
//		System.out.println(longName);
		
//		names.stream().filter(e -> e.length()>6 && e.length()<8).forEach(str->System.out.println(str));
		
		names.stream().filter(e -> e.length()>6 && e.length()<8).forEach(System.out::println);
		
		
		List<String> words = Arrays.asList("Samim",null,"Durgesh","Korim",null);
		List<String> res = names.stream().filter(e -> e!=null).collect(Collectors.toList());
		System.out.println(res);
	}
}
