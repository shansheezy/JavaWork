
public class SelectionDemo {
	
	//if or switch 

	public static void main(String[] args) 
	{
		/*
		int n = 7;
		
		if(n == 0)
			System.out.println("nothing");
		else
			if(n%2 == 0)
				System.out.println("Even");
			
			if(n%2 != 0)
				System.out.println("Odd");
			
			//Curly braces not required however if an if or else statement has more than one command, 
			//curly braces must be applied
			*/
		
		
		/*
	//TERNERARY OPERATOR
		//?: -> condition?expr1:exp2 (true:false)
		
		int i = 8;
		int j = 0;

			
		j = i>6?1:2; //if else in one line
			
		System.out.println(j);
		*/
		
		
		int n = 4;
		
		switch(n)
		{
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:	
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("");
		}
		

		
	}

}
