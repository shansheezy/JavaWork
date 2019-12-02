
public class JumpDemo {
	//break, continue

	public static void main(String[] args) 
	{
		
		for(int i = 1; i<=10;i++)
		{
//			if(i==7)
//			{
//				continue; //will skip 7 in iteration
//			}
//			
			if(i>5)
			{
				break;  //will only print 1-5. Loop stops.
			}
			
			System.out.println("value is " + i);
		}

	}

}
