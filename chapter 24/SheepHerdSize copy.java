
public class SheepHerdSize 
{
	public static void main ( String[] args)
	{
		double power = .83;
		
		for (int i =0; i<=25; i++)
		{
			
			double numSheep = 220.0/ (1.0+10.0*(power*=.83));
			
			System.out.println("t = "+ i+" and n = "+numSheep);
			
			if (numSheep >=80  && numSheep<90)
			{
				System.out.print("It will take "+i+" years for the shape to be on there own ||||  ");
			}
		}
	}

}
