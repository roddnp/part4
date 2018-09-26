import java.util.Scanner;

public class Permutaion 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner( System.in );
		
	    long N, fact = 1; 
	    long R, fact2=1;
	    

	    System.out.print( "Enter N: " );
	    N = scan.nextLong();
	    
	    System.out.print("Enter R");
	    R = scan.nextLong();
	    
	    long calculation = N-R;

	    if ( R <= N && N>=0 && R>= 0 )
	    {
	      while ( N > 1 )    
	      {
	        fact = fact * N;
	        fact2 = fact2 * (calculation);
	        N    = N - 1;
	        calculation = calculation - 1;
	      }
	      System.out.println( "factorial is " + fact );
	    }
	    else
	    
	    	
	    {
	      System.out.println("N must be between 0 and 20");
	      System.out.println("Factorial for N less than 0 is not defined.");
	      System.out.println("Factorial for N greater than 20 causes overflow.");
	    }
	  }
	}


