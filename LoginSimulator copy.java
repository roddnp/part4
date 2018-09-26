import java.util.Scanner;

public class LoginSimulator 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner( System.in );
	    
	    System.out.println("Enter username:");
	    String username = scan.nextLine();
	    
	    System.out.println("Enter password:");
	    String password = scan.nextLine();
	    
	    if ( username.equals("gates") && password.equals("monopoly") )
	    {
	    	System.out.println("Coorect login");
	    }
	    else if ( username.equals("jobs") && password.equals("apple") )
	    {
	    	System.out.println("Coorect login");
	    }
	    else if ( username.equals("quit") && password.equals("exit") )
	    {
	    	System.out.println("Coorect login");
	    }
	    else
	    {
	    	System.out.println("Incorrect username or password please try again");
	    }

	    
	}

}
