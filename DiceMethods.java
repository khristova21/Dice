/**
 * 
 * @author khristova21
 *
 */
import java.util.Scanner;
public class DiceMethods 
{
	public static void main(String[]  args)
	{
		//roll until you get doubles, display value of each roll and their sum, 
		//display total number of rolls it took before getting doubles
		Dice die1 = new Dice();
		Dice die2 = new Dice();
	
		int roll1 = 1;
		int roll2 = 0;
		
		while(roll1 != roll2)
		{	
			roll1 = die1.roll();
			roll2 = die2.roll();
			System.out.println("Die 1: " + roll1 + "\nDie 2: " + roll2 + "\nSum:   "+ (roll1+roll2));	
		}
		System.out.println("The die was rolled " + die1.getNumRoll() + " times.");
		
		//input target value between 2 and 12 (make sure)
		//roll until target is reached (sum)
		//display rolls and sum
		//find how many rolls before target was reached
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Pick a number from 2 to 12: ");
		int target= in.nextInt();
		while(target < 2 || target >12)
		{
			System.out.print("Sorry, thats not a number.\nPlease enter a number from 2 to 12: ");
			target = in.nextInt();
			in.nextLine();	
		}
		
		die1.reset();
		die2.reset();
		roll1 = 0;
		roll2 = 0;
		int sum = 0;
		
		while(target != sum) 
		{
			roll1 = die1.roll();
			roll2 = die2.roll();
			sum = roll1 + roll2;
			System.out.println("Die 1: "+ roll1 + " Die 2: " + roll2 + " Sum: "+ sum);
		}
		System.out.println("The die were rolled "+ die1.getNumRoll() + " times until your target value was reached.");
		
		
	}
}
