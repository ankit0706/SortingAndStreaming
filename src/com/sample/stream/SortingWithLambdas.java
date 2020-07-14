package com.sample.stream;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Comparator is a functional interface because it has only one method
 * called compare. The method takes 2 parameters and returns an int.
 * We can use lambda expression to directly define and use the interface
 * method in the same line.
 * @author AANU
 *
 */
public class SortingWithLambdas {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(10);
		e1.setName("Sachin");
		
		Employee e2 = new Employee();
		e2.setId(99);
		e2.setName("Ganguly");
		
		Employee e3 = new Employee();
		e3.setId(55);
		e3.setName("Dravid");
		
		Employee e4 = new Employee();
		e4.setId(46);
		e4.setName("Laxman");
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		
		System.out.println("Inserted list");
		System.out.println(employeeList.toString());
		
		System.out.println("Sorted list");
//		Collections.sort(employeeList, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		Collections.sort(employeeList, (emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));
		System.out.println(employeeList.toString());
	}
}
