package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
class Employee{
	int id;
	String name;
	int salary;
	
	public Employee(int id,String name,int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return id+" "+salary+" "+name;
	}
	
}
public class MapDemo_05_01 {
	public static void main(String args[]) {
		List<Employee> emp = Arrays.asList(
								new Employee(1,"Samim",35000),
								new Employee(2,"Karim",45000),
								new Employee(3,"Abdul",55000),
								new Employee(4,"Sahil",25000),
								new Employee(5,"Zakir",75000)
							);
		emp.stream().filter(e -> e.salary>30000).forEach(System.out::println);
		
		/// Combination of Map & Filter
//		List<Integer> ans = emp.stream().filter(e -> e.salary>30000).map(m->m.salary).collect(Collectors.toList());
//		System.out.println(ans);
		
	}
}
