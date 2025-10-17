package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	int rollNo;
	String name;
	int marks;
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
}
public class FlatMap_06_01 {
	public static void main(String[] args) {
		List<Student> list1 = Arrays.asList(
					new Student(1,"Samim",70),
					new Student(2,"Sam",79),
					new Student(3,"karim",57)
				);
		List<Student> list2 = Arrays.asList(
				new Student(4,"Mohim",83),
				new Student(2,"Sameer",89),
				new Student(3,"Badsa",97)
			);
		
		List<List<Student>> ans = Arrays.asList(list1,list2);
		List<String> finalAns = ans.stream().flatMap(s->s.stream().map(m->m.name)).collect(Collectors.toList());
		System.out.println(finalAns);
	}
}
