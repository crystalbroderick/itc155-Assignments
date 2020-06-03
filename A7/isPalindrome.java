import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class isPalindrome {
	public static boolean isPal(Queue<Integer> q) {
		Stack<Integer> s = new Stack<>();
		Queue<Integer> temp = new LinkedList<>();
		for(Integer i : q) {
			temp.add(i);
		}
		System.out.print("Queue: " + temp + "\n");
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
		System.out.print("Stack: " + s + "\n");
		System.out.println("Palindome?");
		if (temp.remove().equals(s.pop())) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}

	}

	public static void main(String[] args) {
		Integer[] data = { 3, 8, 17, 9, 17, 8, 31 };
		Queue<Integer> q = new LinkedList<>();

		for (Integer i : data) {
			q.add(i);
		}

		isPal(q);
		
		Integer[] data2 = {3, 8, 17, 9, 17, 8, 3};
		Queue<Integer> q2 = new LinkedList<>();

		for (Integer i : data2) {
			q2.add(i);
		}
		System.out.println();
		isPal(q2);
	}

}
