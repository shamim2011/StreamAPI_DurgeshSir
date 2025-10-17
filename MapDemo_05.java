package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo_05 {
	public static void main(String args[]) {
//		List<String> names = List.of("Samim","Mohon","Durgesh","Korim","Danesh");
//		List<String> upperName = names.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
//		System.out.println(upperName);
		
//		names.stream().map(str->str.toUpperCase()).forEach(e->System.out.print(e+" "));
		
//		names.stream().map(str->str.toUpperCase()).forEach(System.out::println);
		
		
		/// Calculate the length
//		List<Integer> len = names.stream().map(str->str.length()).collect(Collectors.toList());
//		System.out.println(len);
		
//		names.stream().map(str->str.length()).forEach(l->System.out.println(l));
		
//		names.stream().map(str->str.length()).forEach(System.out::println);
		
		
		
		List<Integer> number = Arrays.asList(1,2,3,4,5);
//		List<Integer> newNumber = number.stream().map(num->num*3).collect(Collectors.toList());
//		System.out.println(newNumber);
		
//		number.stream().map(num->num*3).forEach(n->System.out.println(n));
		number.stream().map(num->num*3).forEach(System.out::println);
		
	}
}
