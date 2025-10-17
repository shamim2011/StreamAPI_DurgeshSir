package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStream_08_02 {
	public static void main(String[] args) {
		List<String> number = Arrays.asList("one","two","three","four");
		List<String> number1 = Arrays.asList("on","tw","th","fo");
		
		Stream<String> s1=number.stream();
		Stream<String> s2=number1.stream();
		
		List<String> fList=Stream.concat(s1, s2).collect(Collectors.toList());
		for(String s:fList) {
			System.out.println(s);
		}
	}
}
