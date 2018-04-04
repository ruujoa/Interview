
public class ShellSort {
	private static void sort(int[] a) {
		int d = a.length;
        while (true)
        {
            d = d / 2;
            for (int x = 0; x < d; x++)
            {
                for (int i = x + d; i < a.length; i = i + d)
                {
                    int temp = a[i];
                    int j;
                    for (j = i - d; j >= 0 && a[j] > temp; j = j - d)
                    {
                        a[j + d] = a[j];
                    }
                    a[j + d] = temp;
                }
            }
            if (d == 1)
            {
                break;
            }
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
