import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionSamples {
	public static void main(String[] args) {
		String[] strArr = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
		
		List<String> list = Arrays.asList(strArr);
		
		System.out.println(list);
		
		int[] intArr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		List<Integer> list2 = new ArrayList<>();// = Arrays.asList(intArr);
		list2.add(1);
	}
}
