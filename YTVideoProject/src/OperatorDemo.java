
public class OperatorDemo {
	
	/*
	 * 
	 * 	Arithmetic +, -, *, /, %
	 * 	Bitwise
	 * 	Relational
	 * 	Logical
	 * 
	 */

	public static void main(String[] args) 
	{
		int m = 6, n = 2;
		int r1 = m+n;
		int r2 = m-n;
		int r3 = m*n;
		int r4 = m/n;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		n += m; //n = n + m
		n += 3;
		n++; // n = n + 1 ; post-increment
		++n; // pre-increment 
		System.out.println(n);
	}

}
