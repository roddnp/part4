import java.util.Scanner;
import java.lang.Math;

public class WindChillIndex
{
	public static void main ( String[] args)
	{
		
			Scanner scan = new Scanner( System.in );
		 	
		 	System.out.println("Enter wind speed:");
		    String speed = scan.nextLine();
		    float speedInt = Float.parseFloat(speed);
		    
		    System.out.println("Enter temperature:");
		    String temp = scan.nextLine();
		    float tempInt = Float.parseFloat(temp);
		    
		    if (speedInt < 3)
		    {
		    	System.out.println("Wind chill:" + speedInt);
		    }
		    if (tempInt > 52)
		    {
		    	System.out.println("Wind chill:" + tempInt);
		    }
		    else
		    {
		    	float windChill = (float) (35.74 + 0.6215*tempInt - 35.75*Math.pow(speedInt, .16) + 0.4275*tempInt*Math.pow(speedInt, .16));
		    	System.out.println("Wind chill:" + windChill);
		    }
	}

}
