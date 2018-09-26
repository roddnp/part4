import java.util.Scanner;

public class SpacingOutWords 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Enter first word");
	    String word = scan.nextLine();
	    
	    System.out.println("Enter second word");
	    String word2 = scan.nextLine();
	    
	    int wordNum;
	    wordNum = word.length();
	    
	    int wordNum2;
	    wordNum2 = word2.length();
	    
	    int wordTotal = wordNum + wordNum2;
	    
	    System.out.print(word);
	    
	    int i = wordTotal;
	    
	    while ( i <= 30)
	    {
	    	System.out.print(".");
	    	i++;
	    }
	    System.out.print(word2);
	    
	    
	    
	}

}
