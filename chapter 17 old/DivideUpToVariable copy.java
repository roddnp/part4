import java.util.Scanner;

public class DivideUpToVariable 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner( System.in );
	 	
	 	System.out.println("Enter integer");
	    String number = scan.nextLine();
	    int numberInt = Integer.parseInt(number);
	    
	    int n = 1;
	    int finalValue = 0;
	    
	    while( n <= numberInt)
	    {
	    	double equation = 1.0/n;
	    	finalValue += equation;
	    	n += 1;
	    }
	    
	    System.out.println(finalValue);
	    
	}

}
