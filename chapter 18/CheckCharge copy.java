import java.util.Scanner;

public class CheckCharge 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner( System.in );
	 	
	 	System.out.println("Enter amount of money in checking:");
	    String check = scan.nextLine();
	    int checkInt = Integer.parseInt(check);
	    
	    System.out.println("Enter amount of money in savings:");
	    String save = scan.nextLine();
	    int saveInt = Integer.parseInt(save);
	    
	    if ( checkInt > 1000 || saveInt > 1500)
	    {
	    	System.out.println("No service charge");
	    }
	    else 
	    {
	    	System.out.println(".15 cent service charge");
	    }
	}

}
