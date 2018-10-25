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
import java.util.Scanner;
public class Craps 
{

	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		boolean play = true;
		while(play) 
		{
			
			//2 die
			Dice die1 = new Dice();
			Dice die2 = new Dice();
			
			System.out.print("Hello! Welcome to Craps!!! Press enter to roll your two dies");
			in.nextLine();
			
			int roll1 = die1.roll();
			int roll2 = die2.roll();
			int sum = roll1 + roll2;
			int myPoint;

			System.out.print("Die  1: " + roll1 +  "\tDie 2: " + roll2 + "\tSum: " + sum);

	
			//win on first roll
			if (sum == 7 || sum == 11)
			{
				System.out.print("\nYou win!");
				
			}
			else if (sum == 2 || sum == 12)
			{
				System.out.print("\nI'm sorry but you lose!");
				
			}
			else
			{	//sets point
				myPoint = sum;
				System.out.print("\nYour point is: "  + myPoint);
				
				System.out.print("\nPress enter to roll again");
				in.nextLine();
				sum = (die1.roll()  + die2.roll());
				System.out.print("Die  1: " + roll1 +  "\tDie 2: " + roll2 + "\tSum: " + sum);	

				//roll until you get your point or 7(lose)
				while(sum != 7 && sum != myPoint)
				{
					System.out.print("\nPress enter to roll again");
					in.nextLine();
					roll1 = die1.roll();
					roll2 = die2.roll();
					sum = roll1 + roll2;
					System.out.print("Die  1: " + roll1 +  "\tDie 2: " + roll2 + "\tSum: " + sum);	
				}
				//if 7 lose
				if (sum == 7)
				{
					System.out.println("\nYou loose!");
				}
				else if (sum == myPoint) //win
				{
					System.out.println("\nYou win!");
				}
		}
		//playing again
		String again = "";
		System.out.print("\nWould you like to play again? (y/n)");
		again = in.nextLine();
		
		//double checks if its a correct value
			while(again.equals("y") == false && again.equals("n") == false)
			{
				System.out.print("That is not an option. Would you like to play again? (y/n)");
				again = in.nextLine();
			}
		if (again.equals("y"))
		{
			play = true;
		}
		else
		{
			play = false;
			System.out.println("Thank you for playing!");
		}
		
		}
	}
}
