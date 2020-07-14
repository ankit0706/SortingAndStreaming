package com.sample.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		ArrayList<Employee> employeeList = getEmployeeList();
		System.out.println("list = " + employeeList);

//		Stream<Employee> employeeStream = employeeList.stream();
//		Stream<Employee> filteredStream = employeeStream.filter(x -> x != null);
//		ArrayList<Employee> filteredList = (ArrayList<Employee>) filteredStream.collect(Collectors.toList());
//		System.out.println("filteredList = " + filteredList);

		List<Employee> filteredList = employeeList.stream().filter(x -> x != null).collect(Collectors.toList());
		System.out.println("filteredList = " + filteredList);
		
		List<String> filteredAndMappedList = employeeList.stream().filter(Objects::nonNull).map(e -> e.getName())
				.collect(Collectors.toList());
		System.out.println("filteredAndMappedList = " + filteredAndMappedList);
	}

	private static ArrayList<Employee> getEmployeeList() {
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

		Employee e5 = new Employee();
		e5.setId(21);
		e5.setName("Sehwag");

		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(null);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(null);
		employeeList.add(e5);

		return employeeList;
	}
}
