
public class DirectInsertSort_ {
	public static void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j;
			
			for (j = i - 1; j >= 0; j--) {
				if (a[j] > temp) {
					a[j+1] = a[j];
				} else {
					break;
				}
			}
			a[j+1] = temp;
			for (int k : a) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
		sort(nums);
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}
}
