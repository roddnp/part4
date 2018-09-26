import java.util.Scanner;

public class ImprovedIntAdding 
{
	public static void main ( String[] args)
	{
		
		Scanner scan = new Scanner( System.in );
	 	
		int value = 0;
	    int sum = 0;

	    System.out.println("Enter numbers here(Enter 0 to quit");
	    String line = scan.nextLine();

	    scan = new Scanner(line); 
	    
	    while (scan.hasNextInt()) 
	    {
	        value = scan.nextInt();
	        if (value == 0)
	        {
	        	System.out.println("Program is ended");
	        }
	        else 
	        {
	        	sum += value;
	        }
	       
	    }
	    System.out.println(sum);
	}

}
