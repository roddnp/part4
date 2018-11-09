import java.util.Scanner;

public class BirthdayParadox 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of people");
	    int numPeople = scan.nextInt();
	    
	    double equation = 1.0;
	    
	    for (int i=1;i<=numPeople;i++)
	    {
	    	equation*= ((365.0 - (i-1.0))/365.0);
	    }
	    
	    
	    
	    
	    System.out.println("Probability of not sharing birthday: "+equation);
	    
	}

}
