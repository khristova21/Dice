
public class TestDice {

	public static void main(String[] args)
	{
		Dice die1 = new Dice();
		int three = 0;
		int i = 0;
		
		while(i<10)
		{
			int num = die1.roll();
			System.out.println(num);
			if (num == 3)
				three ++;
			i ++;
		}
		
			
		
			System.out.println("The DICE was rolled " + die1.getNumRoll());
			System.out.println("3 was rolled " + three +" times!");
	}
	
	
}
