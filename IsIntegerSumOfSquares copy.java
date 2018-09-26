import java.util.Scanner;

public class IsIntegerSumOfSquares 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number N");
	    int number = scan.nextInt();
	    
	    
	    
	    
	    for (int a=0; a<number;a++)
	    {
	    	
	    	for (int b=0; b<number;b++)
	    	{
	    		
	    		int equation = (a*a)+(b*b);
	    		
	    		if (equation == number)
	    		{
	    			System.out.println("Correct vales are a ="+a+" and be ="+b);
	    			System.exit(0);
	    		}
	    		
	    		
	    	}
	    }
	    

	  System.out.println("There is no match");
	    
	
		
	}

}
