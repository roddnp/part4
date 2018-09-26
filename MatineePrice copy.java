import java.util.Scanner;

public class MatineePrice 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner( System.in );
	 	
	 	System.out.println("Enter age:");
	    String age = scan.nextLine();
	    int ageInt = Integer.parseInt(age);
	    
	    System.out.println("Enter time:");
	    String time = scan.nextLine();
	    int timeInt = Integer.parseInt(time);
	    
	    if ( ageInt >= 13)
	    {
	    	if ( timeInt <= 1500) 
	    	{
	    		System.out.println("The matinee price is:" + "$2.00");
	    	}
	    	else
	    	{
	    		System.out.println("The regular price is:" + "$4.00");
	    	}
	    }
	    else
	    {
	    	if ( timeInt <= 1500) 
	    	{
	    		System.out.println("The matinee price is:" + "$5.00");
	    	}
	    	else
	    	{
	    		System.out.println("The regular price is:" + "$8.00");
	    	}
	    }
	    
	}

}
