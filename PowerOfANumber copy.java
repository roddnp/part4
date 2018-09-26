import java.util.Scanner;

public class PowerOfANumber 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter x");
	    String x = scan.nextLine();
	    int xInt = Integer.parseInt(x);
	    
	    System.out.println("enter n");
	    String n = scan.nextLine();
	    int nInt = Integer.parseInt(n);
	    
	    if ( nInt < 0)
	    {
	    	System.out.println("N must be a positive integer");
	    }
	    else
	    {
	    	double power = Math.pow(xInt,nInt);
	    	System.out.println(power);
	    }
	}

}
