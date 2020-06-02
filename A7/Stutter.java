import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stutter {
	public static void Stutter(Stack<Integer> s) {
		Queue<Integer> q = new LinkedList<>();

		// reference ch 14 : slide 17 and 23

		// S to Q
		while (!s.isEmpty()) {
			// s pop : reverse of data list
			int n = s.pop(); // 3 , 2 , 1
			q.add(n);
			q.add(n);
			// add duplicates of the s pop to q list
			// q : [3, 3] > [3, 3, 2, 2,] > [3, 3, 2, 2, 1, 1]
		}
		System.out.println();

		// Q to S
		while (!q.isEmpty()) {
			s.push(q.remove()); // q [3, 2, 2, 1, 1] [2, 2, 1, 1][2, 1, 1] [1, 1] [1] []
			// s : [3][3,3][3, 3, 2][3, 3, 2, 2, 1, 1]
		}
		System.out.println();

		// S to Q
		while (!s.isEmpty()) {
			q.add(s.pop()); // s [3, 3, 2, 2, 1][3, 3, 2, 2][3, 3, 2][33][3][]

			// q [1, 1, 2, 2, 3, 3]
		}
		// Q to S
		while (!q.isEmpty()) {
			s.push(q.remove()); // q [1, 2, 2, 3, 3][2, 2, 3, 3][2, 3, 3][3, 3][3][]
			// s [1, 1, 2, 2, 3, 3]
		}
		System.out.print(s);// s [1, 1, 2, 2, 3, 3]
	}

	public static void main(String[] args) {
		Integer[] data = { 1, 2, 3 };
		Stack<Integer> s = new Stack<Integer>();
		for (Integer i : data) {
			s.push(i);
			System.out.print(i + " "); // 1, 2, 3
		}
		System.out.println();
		Stutter(s);
	}
}