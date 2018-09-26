import java.util.Scanner;

public class InbetweenNumbers 
{
	public static void main ( String[] args)
	{
		
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Enter starting number");
	    String startNum = scan.nextLine();
	    int startNumInt = Integer.parseInt(startNum);
	    
	    System.out.println("Enter ending number:");
	    String endNum = scan.nextLine();
	    int endNumInt = Integer.parseInt(endNum);
	    
	    while (startNumInt <= endNumInt )
	    {
	    	System.out.println(startNumInt);
	    	startNumInt++;
	    }
	    
	   
	
	}

}
