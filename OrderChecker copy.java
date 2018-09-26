import java.util.Scanner;

public class OrderChecker 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner( System.in );

	    
	    
	    System.out.println("Enter # of bolts:");
	    String boltNum = scan.nextLine();
	    int boltNumInt = Integer.parseInt(boltNum);
	    int twiceBolt = boltNumInt*2;
	    
	    System.out.println("Enter # of nuts");
	    String nutNum = scan.nextLine();
	    int nutNumInt = Integer.parseInt(nutNum);
	    
	    System.out.println("Enter # of washers");
	    String washNum = scan.nextLine();
	    int washNumInt = Integer.parseInt(washNum);
	    
	    if (nutNumInt >= boltNumInt && washNumInt >= twiceBolt)
	    {
	    	int boltPrice = boltNumInt*5;
	    	int nutPrice = nutNumInt*3;
	    	int washPrice = washNumInt*1;
	    	int finalPrice = boltPrice+nutPrice+washPrice;
	    	System.out.println("You owe"+" "+finalPrice+" "+"cents");
	    }
	    else
	    {
	    	System.out.println("Incorrect #");
	    }
	    
	    
	    
	   
	    
	    
		
	}

}
