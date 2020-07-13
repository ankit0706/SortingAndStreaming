import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i=1; i<16; i++) {
			list.add(i);
			if((i%5) == 0) {
				list.add(-1 * i);
			}
		}
		
		System.out.println(list);
		
		Stream<Integer> stream1 = list.stream();
		Stream<Integer> stream2 = stream1.map(e -> e < 0 ? e + (-1 * e): e);
		List<Integer> list2 = stream2.collect(Collectors.toList());
		System.out.println(list2);
	}
}
