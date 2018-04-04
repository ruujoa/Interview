
public class BubbleSort {
	private static int[] sort(int[] arr) {
		int temp = 0;
		int n = arr.length;
		for (int i = 0; i < n - 2; i++) {
			for (int j = 0; j < n - i - 1; j++) {
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
