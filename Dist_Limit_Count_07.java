package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dist_Limit_Count_07 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "bycle", "bus", "car", "car", "bike");
        // Only getting the Unique elements  --> Non terminal method
//        List<String> vList = vehicles.stream().distinct().collect(Collectors.toList());
//        System.out.println(vList);
        
//        vehicles.stream().distinct().forEach(e->System.out.println(e));
        
        vehicles.stream().distinct().forEach(System.out::println);
        
        // Count Operation   - >--> Non terminal method
        long count = vehicles.stream().distinct().count();
        System.out.println(count);
        
        // Limit operation   --> terminal method
        System.out.println("Printing the elements: ");
        vehicles.stream().limit(5).forEach(e->System.out.println(e));
    }
}