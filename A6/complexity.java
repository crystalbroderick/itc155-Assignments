public class complexity {

	public static void main(String[] args) {
		// test list
		int[] arr = new int[] { 10, 20, 30, 40, 50 };

		// Displaying elements of original array
		System.out.println("array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		selectionSort(arr);
		System.out.println("\nSorted array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	//I think this is the same as smallest moving to the beginning,
	//it seemed to have the same complexity @ O(N^2) with 2 nested loops
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					//swap largest to i0
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

	}

	// O(N) b/c there's two statement in one for loop? not a nested loop and it goes
	// by length.
	public static int[] mystery1(int[] list) {
		int[] result = new int[2 * list.length];
		for (int i = 0; i < list.length; i++) {
			result[2 * i] = list[i] / 2 + list[i] % 2;
			result[2 * i + 1] = list[i] / 2;
		}
		return result;
	}

	// 0(n) theres no nested loop
	public static void mystery2(int[] list) {
		for (int i = 0; i < list.length / 2; i++) {
			int j = list.length - 1 - i;
			int temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}
	}

}
