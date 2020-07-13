import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class JavaSorting {
	public static void main(String[] args) {
		LinkedList<Integer> mList = new LinkedList<>();
		mList.add(3);mList.add(5);mList.add(7);mList.add(9);
		mList.add(2);mList.add(4);mList.add(6);mList.add(8);
		mList.add(0);mList.add(1);
		
		System.out.println("Insertion order");
		System.out.println("mList = " + mList);
		
		System.out.println("Sorted list using sort method of Collections class");
		Collections.sort(mList);
		System.out.println("mList = " + mList);
		
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
		
		System.out.println("Sorted list using comparator in sort method of Collections class");
		Collections.sort(employeeList, new EmployeeComparator());
		System.out.println(employeeList.toString());
	}
	
	private static class EmployeeComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee e1, Employee e2) {
			// comparison on id
			int id1 = e1.getId();
			int id2 = e2.getId();
			if(id1 < id2) {
				return -1;
			}else if(id1 > id2) {
				return 1;
			}else {
				return 0;
			}
			//comparison on name
			//return e1.getName().compareTo(e2.getName());
		}
		
	}
}
