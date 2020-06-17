import java.util.Stack;

/*Write a method called equals that accepts two stacks of integers as parameter
 * and returns true if hte two stacks store exactly the same sequence of integer values in the same order.
 * Your method must restore the two stacks to their original state before returning.
 * use one stack as auiliary storage.
 */
public class equals {

	public static boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
		Stack<Integer> temp = new Stack<Integer>();

		if (s1.size() != s2.size()) {
			return false;
		}

		while (!s1.isEmpty()) {
			int n1 = s1.pop();
			int n2 = s2.pop();
			if (n1 == n2) {
				temp.push(n1);
				temp.push(n2);
			} else if (n1 != n2) {
				temp.push(n2);
				temp.push(n1);
				while (!temp.isEmpty()) {
					s1.push(temp.pop());
					s2.push(temp.pop());
				}
				return false;

			}

		}
		while (!temp.isEmpty()) {
			s1.push(temp.pop());
			s2.push(temp.pop());
		}
		return true;

	}

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(42);
		s1.push(20);
		s1.push(30);

		Stack<Integer> s2 = new Stack<Integer>();
		s2.push(10);
		s2.push(20);
		s2.push(30);

		System.out.println(equals(s1, s2)); //false
	}
}
