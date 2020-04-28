
import java.io.FileNotFoundException;
import java.util.ArrayList;


//Replace every string with two of the same string
public class doubleList {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Beep");
		list.add("BBB");
		list.add("Boop");
		System.out.println(list.size() + "\n" + list.toString());
		
		//insert duplicate word in front of each word
		//i+=2: each word added counts
		for (int i = 0; i < list.size(); i += 2) {
			list.add(i, list.get(i));
		}
		System.out.println(list.size() + "\n" + list.toString());
	}

}
