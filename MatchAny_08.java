package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatchAny_08 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2,4,1,3,7,5,9);
		
		// Sorting Ascending order
//		List<Integer> li = list1.stream().sorted().collect(Collectors.toList());
//		System.out.println(li);
//		list1.stream().sorted().forEach(e->System.out.println(e));
		
		
		// Sorting Decending order
//		List<Integer> lis = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		System.out.println(lis);
//		list1.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.println(e));
		
		List<String> names = Arrays.asList("John","Kim","Tom","Arian","Sami","Samim");
		List<String> sortNames =names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortNames);
		
		List<String> sortNamesRev =names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortNamesRev);
	}
}
