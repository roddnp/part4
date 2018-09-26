import java.util.Scanner;

public class OneLetterPerLine 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter word");
	    String word = scan.nextLine();
	    
	    int counter = 0;
	    
	    while (counter<word.length())
	    {
	    	Character currentChar = word.charAt(counter);
	    	System.out.println(currentChar);
	    	counter++;
	    }
		
	}

}
