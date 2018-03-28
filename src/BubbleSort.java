
public class BubbleSort {
	private static int[] sort(int[] arr) {
		int temp = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j+1] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
			for (int k : arr) {
				System.out.print(k + ", ");
			}
			System.out.println();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {7, 11, 4, 28, 13, 5};
		sort(arr);
	}
}
