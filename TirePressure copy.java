import java.util.Scanner;

public class TirePressure 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Enter pressure in front left:");
	    String frontLeft = scan.nextLine();
	    int frontLeftInt = Integer.parseInt(frontLeft);
	    
	    System.out.println("Enter pressure in front right:");
	    String frontRight = scan.nextLine();
	    int frontRightInt = Integer.parseInt(frontRight);
	    
	    System.out.println("Enter pressure in back left:");
	    String backLeft = scan.nextLine();
	    int backLeftInt = Integer.parseInt(backLeft);
	    
	    System.out.println("Enter pressure in back right:");
	    String backRight = scan.nextLine();
	    int backRightInt = Integer.parseInt(backRight);
	    
	    if ( frontLeftInt == frontRightInt && backLeftInt == backRightInt)
	    {
	    	System.out.println("Tire pressure is good");
	    }
	    else
	    {
	    	System.out.println("Tire pressure is not good");
	    }
	    
	}

}
