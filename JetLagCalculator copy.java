import java.util.Scanner;

public class JetLagCalculator 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("how many hours");
	    String hours = scan.nextLine();
	    int hoursInt = Integer.parseInt(hours);
	    
	    System.out.println("how many zones crossed");
	    String zones = scan.nextLine();
	    int zonesInt = Integer.parseInt(zones);
	    
	    System.out.println("departure time");
	    String departure = scan.nextLine();
	    int departureInt = Integer.parseInt(departure);
	    
	    System.out.println("landing time");
	    String landing = scan.nextLine();
	    int landingInt = Integer.parseInt(landing);
	    
	    int recoveryDays = (hoursInt/2 + (zonesInt-3) + departureInt + landingInt)/10;
	    
	    System.out.println(recoveryDays);
	}

}
