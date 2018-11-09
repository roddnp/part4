import java.util.Scanner;

public class AgeInSeconds 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner( System.in );
	 	
	 	System.out.println("Enter age in years:");
	    String years = scan.nextLine();
	    int yearsInt = Integer.parseInt(years);
	    
	    System.out.println("Enter age months:");
	    String months = scan.nextLine();
	    int monthsInt = Integer.parseInt(months);
	    
	    System.out.println("Enter age in days:");
	    String days = scan.nextLine();
	    int daysInt = Integer.parseInt(days);
	    
	    int var = 0;
	    
	    if (monthsInt == 0)
	    {
	    	var = 0;
	    }
	    
	    if (monthsInt == 1)
	    {
	    	var = 31;
	    }
	    
	    if (monthsInt == 2)
	    {
	    	var = 31+28;
	    }
	    
	    if (monthsInt == 3)
	    {
	    	var = 31+28+31;
	    }
	    
	    if (monthsInt == 4)
	    {
	    	var = 30+31+28+31;
	    }
	    
	    if (monthsInt == 5)
	    {
	    	var = 31+30+31+28+31;
	    }
	    
	    if (monthsInt == 6)
	    {
	    	var = 30+31+30+31+28+31;
	    }
	    
	    if ( monthsInt == 7)
	    {
	    	var = 31+30+31+30+31+28+31;
	    }
	    
	    if ( monthsInt == 8)
	    {
	    	var = 31+31+30+31+30+31+28+31;
	    }
	    
	    if (monthsInt == 9)
	    {
	    	var = 30+31+31+30+31+30+31+28+31;
	    }
	    
	    if (monthsInt == 10)
	    {
	    	var = 31+30+31+31+30+31+30+31+28+31;
	    }
	    
	    if ( monthsInt == 11)
	    {
	    	var = 30+31+30+31+31+30+31+30+31+28+31;
	    }
	    
	    if (monthsInt == 12)
	    {
	    	var = 31+30+31+30+31+31+30+31+30+31+28+31;
	    }
	    
	    
	    
	    
		double calculations = (yearsInt*365*24*60*60) + (var*24*60*60) + (daysInt*24*60*60);
		double finalCalc = calculations/2500000000.0;
	    System.out.println(finalCalc);
	}

}
