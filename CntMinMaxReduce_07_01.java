package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CntMinMaxReduce_07_01 {
    public static void main(String[] args) {
    	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    	long ans = list.stream().filter(e->e%2==0).count();
    	System.out.println(ans);
    	
    	// Min 
//    	Optional<Integer> minVal = list.stream().min((val1,val2)->{return val1.compareTo(val2); });
//    	System.out.println(minVal.get());
    	
    	// Same as above 2 lines
    	Optional<Integer> mVal = list.stream().min((val1,val2)->(val1.compareTo(val2)));
    	System.out.println(mVal.get());
    	
    	// Max
    	Optional<Integer>  mVl = list.stream().max((val1,val2)->(val1.compareTo(val2)));
    	System.out.println(mVl.get());
    	
    	// Reduce -> Combine all character and make a string
    	List<Character> list1 = Arrays.asList('M','d',' ','S','a','m','i','m');
    	Optional<String> str = list1.stream()
    	                           .map(String::valueOf)
    	                           .reduce((value, combinedValue) -> value+combinedValue);
    	System.out.println(str.get()); // 
    	
    	
    	// toArray
    	Object[] arr=list1.stream().toArray();
    	System.out.println(arr.length);
    	
    	for(Object c:arr) {
    		System.out.println(c);
    	}
    }
}