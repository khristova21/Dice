/**
 *Dice Array
 * @author Krisi Hristova
 * Pd.6
 *
 */
public class DiceArray 
{

	public static void main(String[] args)
	{
		//create and roll 2 dice
		//use an array with 13 slots to have its index equal to the number 2-12
		//roll 1000 times (for loop)
		//count and display number of times each  sum 2-12 was rolled (store each in one variable array with 13 slots)
		
		Dice die1 = new Dice();
		Dice die2 = new Dice();		
		
		int[] count;
		count = new int[13];
		
		
		for(int i = 0; i<=1000; i++)
				{
					int sum = die1.roll() + die2.roll();
					count[sum] += 1;
				}
		for(int i =2; i<13; i++)
		{
			System.out.println("You rolled " + count[i] + " " + i + "s");
		}
		
					
					/*
					if (sum == 2)
					{
						sum[2] ++;
					}
					else if (sum == 3)
					{
						sum[3] ++;
					}
					else if (roll1 + roll2 == 4)
					{
						sum[4] ++;
					}
					else if (roll1 + roll2 == 5)
					{
						sum[5] ++;
					}
					else if (roll1 + roll2 == 6)
					{
						sum[6] ++;
					}
					else if (roll1 + roll2 == 7)
					{
						sum[7] ++;
					}
					else if (roll1 + roll2 == 8)
					{
						sum[8] ++;
					}
					else if (roll1 + roll2 == 9)
					{
						sum[9] ++;
					}
					else if (roll1 + roll2 == 10)
					{
						sum[10] ++;
					}
					else if (roll1 + roll2 == 11)
					{
						sum[11] ++;
					}
					else if (roll1 + roll2 == 12)
					{
						sum[12] ++;
					}
					*/
	}

}
