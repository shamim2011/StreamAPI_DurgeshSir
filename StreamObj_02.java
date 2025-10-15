package StreamAPI;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// All Stream Objects
public class StreamObj_02 {
	public static void main(String[] args) {
		// 1-Blank
		Stream<Object> emptyStream = Stream.empty();
		
		// 2-array, Object, collection
		String[] names = {"Samim","Mohon","Durgesh","Korim","Danesh"};
		Stream<String> sm1 = Stream.of(names);
		sm1.forEach(e->{
			System.out.println(e);
		});
		
		// Annonimous int array stream
		IntStream stream = Arrays.stream(new int[] {2,3,4,5,6});
//		stream.forEach(e->{
//			System.out.println(e);
//		});
		
		stream.forEach(System.out::println);
		
	}
}
