package StreamAPI;
import java.util.*;
import java.util.stream.Collectors;

public class FlatMap_06 {
	public static void main(String[] args) {
//		/// map - one to one
//		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
//		List<Integer> list2 = list1.stream().map(n->n*10).collect(Collectors.toList());
//		System.out.println(list2);
		
		/// map - one to one
//		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
//		List<Integer> list2 = list1.stream().map(n->n*10).collect(Collectors.toList());
//		System.out.println(list2);
		
		
		// flatMap - one to many
		List<Integer> list1 = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(3,4);
		List<Integer> list3 = Arrays.asList(5,6);
		
		List<List<Integer>> finalList = Arrays.asList(list1,list2,list3);
//		List<Integer> ans = finalList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
//		System.out.println(ans);
		
//		List<Integer> ans = finalList.stream().flatMap(x->x.stream().map(i->i+10)).collect(Collectors.toList());
//		System.out.println(ans);
		
//		List<Integer> ans = finalList.stream().flatMap(x->x.stream().filter(i->i%2==0)).collect(Collectors.toList());
//		System.out.println(ans);
	}
}
