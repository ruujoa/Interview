import java.math.BigInteger;

public class FibSum {
	public static BigInteger add(int n) {
		BigInteger a = new BigInteger("4"), b = new BigInteger("5"), sum = new BigInteger("0");
		for (int i = 0; i < n - 2; i++) {
			sum = a.add(b);
			a = b;
			b = sum;
		}
		
		return sum;
	}
	
	public static BigInteger add_r(int n) {
		if (n == 1)
			return new BigInteger("4");
		else if ( n == 2 )
			return new BigInteger("5");
		else 
			return add_r( n - 2 ).add( add_r( n - 1 ) );
	}
	
	public static void main(String[] args) {
		System.out.println( "MAX of Integer: " + Integer.MAX_VALUE );
		long start = System.currentTimeMillis();
		BigInteger sum = FibSum.add( 10000 );
		long end = System.currentTimeMillis();
		
		System.out.println( "Using for loop algorithm costs about " + (end-start) + " milliseconds to get result of 10000th item: " + sum );
		
		start = System.currentTimeMillis();
		sum = FibSum.add_r( 43 );
		end = System.currentTimeMillis();
		
		System.out.println( "Using recursion algorithm costs about " + (end-start) + " milliseconds to get result of 43rd item: " + sum );
	}
}
