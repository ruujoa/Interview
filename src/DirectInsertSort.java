
public class DirectInsertSort {
	private static void sort(int[] a) {
		for (int i = 1; i < a.length; i++)
        {
            // 待插入元素
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0; j--)
            {
                // 将大于temp的往后移动一位
            	System.out.println(a[j] + ", " + temp);
                if (a[j] > temp)
                {
                    a[j + 1] = a[j];
                }
                else
                {
                    break;
                }
            }
            System.out.println(j);
            a[j + 1] = temp;
            for (int k : a) {
				System.out.print(k + ", ");
			}
            System.out.println();
        }
	}
	
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
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
