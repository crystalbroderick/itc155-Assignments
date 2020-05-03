import java.util.*;
import java.util.Map;

public class isUnique {
	public static boolean isUnique(Map<String, String> map) {

		TreeSet<String> result = new TreeSet<>();

		Set<String> keySet = map.keySet();

		for (String s1 : keySet) { // String s1 grabs keys

			String value = map.get(s1); // get value from s1 keys

			if (result.contains(value)) // check for duplicate values, return false if duplicate
				return false;
			result.add(value); // "Ensure value in collection..altered"
		}
		return true; // unique:true

	}

	public static void main(String[] args) {
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("Marty", "Stepp");
		m.put("Stuart", "Reges");
		m.put("Jessica", "Miller");
		m.put("Amanda", "Camp");
		m.put("Hal", "Perkins");
		System.out.println(isUnique(m)); // true

		Map<String, String> m2 = new LinkedHashMap<String, String>();
		m2.put("Kendrick", "Perkins");
		m2.put("Stuart", "Reges");
		m2.put("Jessica", "Miller");
		m2.put("Bruce", "Reges");
		m2.put("Hal", "Perkins");
		System.out.println(isUnique(m2)); // false
	}

}
