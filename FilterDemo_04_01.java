package StreamAPI;

import java.util.ArrayList;
import java.util.List;

class Product{
	int id;
	String name;
	double price;
	
	public Product(int id,String name,double price) {
		this.id = id;
		this.name= name;
		this.price = price;
	}
	@Override
	public String toString() {
		return id+" "+name+" "+price;
	}
}

public class FilterDemo_04_01 {
	public static void main(String[] args) {
		List<Product> pList = new ArrayList<>();
		pList.add(new Product(1,"Dell",25000.43));
		pList.add(new Product(2,"ASUS",29000.43));
		pList.add(new Product(3,"HP",23000.43));
		pList.add(new Product(4,"MAC",54000.43));
		
//		pList.stream().forEach(e->System.out.println(e));
//		pList.stream().forEach(System.out::println);
		
		pList.stream().filter(p->p.price>25000).forEach(e->System.out.println(e.price));
	}
}
