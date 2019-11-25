
public class IterationDemo {

	//Iteration: while, do while, for, for-each
	/*
	 * 	for - use if you know the start and end point
	 * 	while - run until condition is met, may not know when the condition will be met
	 * 	do while - run statement once then check for condition
	 */
	public static void main(String[] args) 
	{
//		int x = 1;
//		while(x<6)
//		{
//			System.out.println("Hello");
//			x++;
//		}
		
//		do
//		{
//			System.out.println("Hello");
//			x++;
//		}while(x<=5);
		
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println("Hello");
//		}
		

		//NESTED LOOP
/*		
****
****
****
****
*/
		for(int i=1; i<=4; i++)
		{
		for(int j=1; j<=4; j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
	}
	

}
