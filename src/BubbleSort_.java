
public class BubbleSort_ {
	public static void sort(int[] nums) {
		int n = nums.length;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (nums[j+1] < nums[j]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
			for (int k : nums) {
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
