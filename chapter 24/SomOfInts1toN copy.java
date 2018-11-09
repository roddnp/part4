import java.util.Scanner;

public class SomOfInts1toN 
{
	public static void main ( String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number N");
	    int number = scan.nextInt();
	    
	    int sum =0;
	    
	    for ( int i=1; i<number;i+=2)
	    {
	    	sum+=i;
	    }
	    
	    double power = Math.pow(number, 2);
	    
	    System.out.println("The sum is: "+sum);
	    System.out.println("The power is "+power);
	    
	    
	}

}
