
public class BinaryInsertSort {
	private static void sort(int[] a) {
		for (int i = 0; i < a.length; i++)
        {
			int temp = a[i];
            int left = 0;
            int right = i - 1;
            int mid = 0;
            while (left <= right)
            {
                mid = (left + right) / 2;
                if (temp < a[mid])
                {
                    right = mid - 1;
                }
                else
                {
                    left = mid + 1;
                }
            }
            for (int j = i - 1; j >= left; j--)
            {
                a[j + 1] = a[j];
            }
            System.out.println("left: " + left + ", mid: " + mid + ", right: " + 
            	right + ", i: " + i + ", temp: " + temp);
            if (left != i)
            {
                a[left] = temp;
            }
            for (int j: a) {
				System.out.print(j + ", ");
			}
            System.out.println();
        }
	}
	
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 176, 213, 227, 49, 78, 34, 12, 164, 11, 18, 1 };
		System.out.print("Before sorting: ");
		for (int i = 0; i < a.length - 1 ; i++) {
			System.out.print( a[i] + ", ");
		}
		System.out.println(a[a.length-1]);
		
		sort(a);
		
		System.out.print("After sorting: ");
		for (int i = 0; i < a.length - 1 ; i++) {
			System.out.print( a[i] + ", ");
		}
		System.out.println(a[a.length-1]);
	}
}
