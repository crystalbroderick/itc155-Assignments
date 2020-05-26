package itc;

import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {

	// TODO: Write method to create and output all permutations of the list of
	// names.
	public static void allPermutations(ArrayList<String> pList, ArrayList<String> nameList) {

		int i;
		int count = nameList.size();
		// Base case code here
		if (count == 0) {
			System.out.print(pList + "\n");
		} else {
			// recursive case
			for (i = 0; i < count; i++) {

				// create the arraylist for the premutations
				ArrayList<String> newP = new ArrayList<String>(pList);

				// add the items from the namelist to the perms list
				newP.add(nameList.get(i));

				// create a new names ararylist
				ArrayList<String> newNames = new ArrayList<String>(nameList);

				// remove the name at current index
				newNames.remove(i);

				// do the same with the new namelist recursively until basecase is reached
				allPermutations(newP, newNames);

			}

		}
	}

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> pList = new ArrayList<String>();

		System.out.println("Enter names, separated by a space. -1 to exit");

		String name = scnr.next();

		// Read in a list of names; stop when -1 is read.
		while (!name.equals("-1")) {
			nameList.add(name);
			name = scnr.next();
		}

		// TO DO: call recursive method.
		allPermutations(pList, nameList);
	}
}
