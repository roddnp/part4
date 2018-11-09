import java.util.Scanner;

public class MilesPerGallon 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner( System.in );

	    
	    
	    System.out.println("Enter initial miles:");
	    String initMiles = scan.nextLine();
	    int initMilesInt = Integer.parseInt(initMiles);
	    
	    System.out.println("Enter final miles");
	    String finalMiles = scan.nextLine();
	    int finalMilesInt = Integer.parseInt(finalMiles);
	    
	    System.out.println("Enter gallons");
	    String gallons = scan.nextLine();
	    int gallonsInt = Integer.parseInt(gallons);
	    
	    int calculations = (finalMilesInt - initMilesInt)/gallonsInt;
	    System.out.println(calculations);
	   
	}

}
