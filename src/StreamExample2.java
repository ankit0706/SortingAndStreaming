import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
	
	public static void main(String[] args) {
		ArrayList<String> list = getPlayersList();
		System.out.println("list = " + list);
		
		List<String> distinctList = list.stream().distinct().collect(Collectors.toList());
		System.out.println("distinctList = " + distinctList);
	}
	
	private static ArrayList<String> getPlayersList() {
		ArrayList<String> playerList = new ArrayList<>();
		playerList.add("Harry Kane");
		playerList.add("Leonel Messi");
		playerList.add("Alexis Sachez");
		playerList.add("Eden Hazard");
		playerList.add("Daily Blind");
		playerList.add("Mohd Salah");
		playerList.add("Mesut Ozil");
		playerList.add("Leonel Messi");

		return playerList;
	}
}
