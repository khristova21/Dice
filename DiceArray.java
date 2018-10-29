/**
 *Dice Array
 * @author Krisi Hristova
 * Pd.6
 *
 */
public class DiceArray {

	public static void main(String[] args)
	{
		//create and roll 2 dice
		//use an array with 13 slots to have its index equal to the number 2-12
		//roll 1000 times (for loop)
		//count and display number of times each  sum 2-12 was rolled (store each in one variable array with 13 slots)
		
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		int roll1;
		int roll2;
		
		
		
		int[] sum = {0,0,2,3,4,5,6,7,8,9,10,11,12};
		
		for(int i = 0; i<=1000; i++)
				{
					roll1 = die1.roll();
					roll2 = die2.roll();
					if (roll1 + roll2 == 2)
					{
						sum[2] ++;
					}
					else if (roll1 + roll2 == 3)
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
				}
		System.out.println("2 was rolled " + sum[2] +" times" );
		System.out.println("3 was rolled " + sum[3] +" times" );
		System.out.println("4 was rolled " + sum[4] +" times" );
		System.out.println("5 was rolled " + sum[5] +" times" );
		System.out.println("6 was rolled " + sum[6] +" times" );
		System.out.println("7 was rolled " + sum[7] +" times" );
		System.out.println("8 was rolled " + sum[8] +" times" );
		System.out.println("9 was rolled " + sum[9] +" times" );
		System.out.println("10 was rolled " + sum[10] +" times" );
		System.out.println("11 was rolled " + sum[11] +" times" );
		System.out.println("12 was rolled " + sum[12] +" times" );
	}

}
