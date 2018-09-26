import java.util.Scanner;

public class SteamEffeciency 
{
	public static void main ( String[] args)
	{

		Scanner scan = new Scanner( System.in );
	 	
	 	System.out.println("Enter steam temperature:");
	    String tAir = scan.nextLine();
	    int tAirInt = Integer.parseInt(tAir);
	    
	    System.out.println("Enter air temperature:");
	    String tSteam = scan.nextLine();
	    int tSteamInt = Integer.parseInt(tSteam);
	    
	    if ( tSteamInt < 373)
	    {
	    	System.out.println("The max effenciency is 0");
	    }
	    else
	    {
	    	float efficiency = 1 - (tAirInt / tSteamInt);
	    	System.out.println("The max effeciency is:"+efficiency);
	    	
	    }
	}

}
