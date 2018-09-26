import java.util.Scanner;

public class RepeatingWord 
{
	public static void main ( String [] args)
	{
		
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Enter word");
	    String word = scan.nextLine();
	    
	    int wordNum;
	    wordNum = word.length();
	    int i =0;
	    while (i<= wordNum)
	    {
	    	System.out.println("Output:"+word);
	    	i++;
	    }
		
	}

}
