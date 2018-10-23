/**
 * @author Krisi Hristova
 * Craps Game
 * Pd. 6
 *
 *FOR FIRST ROLL
 *7 and 11 rolled = win
 *2 or 12 rolled = loose
 *anything else becomes YOUR point
 *
 *if no win or loose
 *	roll until you get YOUR POINT
 *	if 7 = lose
 */
//"press enter to roll"
//in.nextLine
import java.util.Scanner;
public class Craps 
{

	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		//2 die
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		
		System.out.print("Hello! Welcome to Craps!!! Press enter to roll your two dies");
		in.nextLine();
		
		int roll1 = die1.roll();
		int roll2 = die2.roll();
		int sum = roll1 + roll2;
		
		//win on first roll
		if (sum == 7 || sum == 11)
		{
			System.out.print("You win!");
		}
		
	}
}
