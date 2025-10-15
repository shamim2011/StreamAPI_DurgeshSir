package StreamAPI;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain_01 {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(2,4,6,7,2,1,4);  // Immutable
		
//		Stream<Integer> stream = list1.stream();
//		List<Integer> newList = stream.filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(list1);
//		System.out.println(newList);
		
		
		List<Integer> newList = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list1);
		System.out.println(newList);
		List<Integer> newList1 = list1.stream().filter(i->i>10).collect(Collectors.toList());
		System.out.println(newList1);
		
		List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,10);
		System.out.println(li);
	}
}
