import java.util.Scanner;

public class PieEating 
{
	public static void main( String[] args)
	{
		
		Scanner scan = new Scanner( System.in );

	    System.out.println("Enter weight:");
	    String weight = scan.nextLine();
	    int weightInt = Integer.parseInt(weight);
	    
	    if (weightInt<=250 && weightInt>=220)
	    {
	    	System.out.println("You are allowed in the contest");
	    }
	    if (weightInt>=250 && weightInt <= 280)
	    {
	    	System.out.println("You are allowed in the contest");
	    }
	    else
	    {
	    	System.out.println("You are not allowed in the contest");
	    }
	}
	//testing for git hub testing for git hub git hub git hub git hub
}
