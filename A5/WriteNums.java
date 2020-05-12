//A5 : Recursion
//prints the first n integers starting with 1 in sequential order, separated by commas.

public class WriteNums {

	public static void main(String[] args) {
		WriteNums(5); // 1, 2, 3, 4, 5
		System.out.println();
		WriteNums(12); // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
		System.out.println();
	}

	public static void WriteNums(int n) {
		if (n < 1) {
			throw new IllegalArgumentException();
		} if (n == 1) {
			System.out.print("1");
		} else {
			WriteNums(n - 1);
			System.out.print(", " + n);
		}

	}
}
