import java.util.Scanner;

public class StandardDeviation 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("how many numbers");
	    String numbers = scan.nextLine();
	    int numbersInt = Integer.parseInt(numbers);
	    
	    System.out.println("Enter the values here");
	    String line = scan.nextLine();

	    scan = new Scanner(line); 
	    
	    int squaredTotal = 0;
	    int regTotal = 0;
	    Double value =0.0;
	    
	    while (scan.hasNextDouble()) 
	    {
	        value = scan.nextDouble();
	        squaredTotal += value*value;
	        regTotal += value;
	    }
	    
	    int avgSquared = regTotal/numbersInt;
	    int avgSquared2 = avgSquared*avgSquared;
	    int squaredAvg = squaredTotal/numbersInt;
	    
	    double SD = Math.sqrt(squaredAvg-avgSquared2);
	    
	    System.out.println(SD);
	    
	    
	    
	   
	    
	}

}
