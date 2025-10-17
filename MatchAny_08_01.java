package StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class MatchAny_08_01 {
	public static void main(String[] args) {
		Set<String> fName = new HashSet<> (Arrays.asList("One mango","One Apple","Two banana","More graps","Two guava"));
		// anyMatch   - Matching any one of them
		boolean res = fName.stream().anyMatch(value->value.startsWith("One"));
		System.out.println(res);
		// allMatch     - Matching all one of them
		boolean res1 = fName.stream().allMatch(value->value.startsWith("One"));
		System.out.println(res1);
		// noneMatch     - note Matching any one of them
		boolean res2 = fName.stream().noneMatch(value->value.startsWith("Three"));
		System.out.println(res2);
		
		// findAny Vs findFirst
		List<String> number = Arrays.asList("one","two","three","four");
//		List<String> number = Arrays.asList();        // -> NoSuchElementException:
		Optional<String> res11 = number.stream().findAny();
		System.out.println(res11.get());
		
		Optional<String> res12 = number.stream().findFirst();
		System.out.println(res12.get());  // Return first element
		
		
	}
}
