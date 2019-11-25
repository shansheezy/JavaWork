
public class Assignment1 {
	//Nested Loops

	public static void main(String[] args) 
	{

		//print 1,2,3,4,5,6
		for(int j = 1; j <= 7; j++)
		{
			int i =1;
//			do 
//			{
//				System.out.print(i + " ");
//				i++;
//			} while(i<j);

			while(i < j)
			{
				System.out.print(i + " ");
				i++;
			}
			
		System.out.println();
		}
		
		//Print A B C
		
		for(int k = 1; k <= 68; k++)
		{
			int l =65;

			
			while(l < k)
			{
				System.out.print((char)l + " ");
				l++;
			}

		System.out.println();
		}

		//Print $ in a square
		System.out.println();
		System.out.println();
		for(int line = 1; line <5; line++)
		{
			switch(line)
			{
			case 1:
				System.out.print("$ $ $ $");
				break;
			case 2:
				System.out.println("$     $");
				break;
			case 3:
				System.out.println("$     $");
				break;
			case 4:
				System.out.println("$ $ $ $");
			}
			System.out.println();
		}

		

		
	}

}
