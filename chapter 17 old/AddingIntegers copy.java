
import java.util.Scanner;

public class AddingIntegers 
{
	public static void main ( String[] args)
	{
		
		Scanner scan = new Scanner( System.in );
	 	
		int value = 0;
	    int sum = 0;

	    System.out.println("Enter numbers here");
	    String line = scan.nextLine();

	    scan = new Scanner(line); 
	    while (scan.hasNextInt()) {
	        value = scan.nextInt();
	        sum += value;
	    }
	    System.out.println(sum);
	}

}
