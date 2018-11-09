import java.util.Scanner;

public class TownDump 
{
	public static void main ( String[] args)
	{
		
		
		
		Scanner scan = new Scanner( System.in );
	 	
	 	System.out.println("Enter weight:");
	    String weight = scan.nextLine();
	    int weightInt = Integer.parseInt(weight);
	    
	    if (weightInt <= 200)
	    {
	    	System.out.println("this will cost $20");
	    }
	    else
	    {
	    	int after = (weightInt / 200) * 8 + 20;
	    	
	    	
	    	System.out.println("Final price is:"+after);
	    }
	    
		
	}

}
