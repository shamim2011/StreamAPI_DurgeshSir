package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethod_03 {

	public static void main(String[] args) {
		// filter(Predicate)
		// boolean value function
		//e ->e>10
		
		// Each element operation
		
		List<String> names = List.of("Samim","Mohon","Durgesh","Korim","Danesh");
		List<String> newNames =  names.stream().filter(e->e.startsWith("D")).collect(Collectors.toList());
		System.out.println(newNames);
		
		//map(Function)
		List<Integer> numbers = Arrays.asList(10,3,4,2,5,4,6);
		List<Integer> newNumbers =  numbers.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(newNumbers);
		
		// Sort
		numbers.stream().sorted().forEach(System.out::println);
		
		// Min and max numbers
		int min = numbers.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("Minimum number is: "+min);
		int max = numbers.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("Miximum number is: "+max);
	}

}
