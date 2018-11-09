import java.util.Scanner;

public class InRangeAdder 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner( System.in );
	 	
		int value = 0;
	    int sum = 0;

	    
	    System.out.println("Enter highest value");
	    String highest = scan.nextLine();
	    int highestInt = Integer.parseInt(highest);
	    
	    System.out.println("Enter lowest value");
	    String lowest = scan.nextLine();
	    int lowestInt = Integer.parseInt(lowest);
	    
	    
	    System.out.println("Enter numbers here(Enter 0 when none left)");
	    String numbers = scan.nextLine();

	    scan = new Scanner(numbers); 
	    
	    while (scan.hasNextInt()) 
	    {
	        value = scan.nextInt();
	        if (value > lowestInt && value < highestInt)
	        {
	        	sum+=value;
	        }
	        
	       
	    }
	    System.out.println(sum);
	}

}
