import java.io.FileNotFoundException;
import java.util.ArrayList;
//takes arraylist of strings as a parameter
//and removes all of the strings of even length from the list

public class removeEvenLength {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> list = new ArrayList<>();
		list.add("Beep");
		list.add("BBB");
		list.add("Boop");
		System.out.println(list.toString());
		
		for (int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			if (!(str.length() % 2 == 0)) {
				list.remove(i);
				i--;
			}
		
		}
		System.out.println(list.toString());
	}




}
