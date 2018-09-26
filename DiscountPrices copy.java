import java.util.Scanner;

public class DiscountPrices 
{
	public static void main ( String[] args)
	{
		

		Scanner scan = new Scanner( System.in );

	    
	    
	    System.out.println("Enter amount of purchase:");
	    String purchasePrice = scan.nextLine();
	    double purchasePriceDouble = Double.parseDouble(purchasePrice);
	    
	    if (purchasePriceDouble>10)
	    {
	    	double discPurchase = purchasePriceDouble * .10;
	    	double finalDiscPurchase = purchasePriceDouble - discPurchase;
	    	String finalYeetPurchase = String.format("%.4g%n", finalDiscPurchase);
	    	System.out.println("Discounted Price is:" + finalYeetPurchase);
	    }
	    else
	    {
	    	System.out.println("No Discount");
	    }
		
	}

}
