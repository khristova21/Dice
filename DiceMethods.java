/**
 * 
 * @author khristova21
 *
 */
public class DiceMethods 
{
	public static void main(String[]  args)
	{
		//roll until you get doubles, display value of each roll and their sum, 
		//display total number of rolls it took before getting doubles
		Dice die1 = new Dice();
		Dice die2 = new Dice();
	
		
		int roll1 = 0;
		int roll2 = 0;
		
		while(roll1 != roll2)
		{
			roll1 = die1.roll();
			roll2 = die2.roll();
			System.out.println(roll1 + " " + roll2 + " "+ (roll1+roll2));
			
		}

		
	}
}
