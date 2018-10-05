/**
 * 
 * 
 * @author Krisi Hristova
 *
 */

public class Dice 
{
	//roll (method in math class that will help), reset, numRoll
	//what fields do I need?

	private int numRoll;
	
	//constructor
	public Dice() 
	{
		numRoll = 0;
	}
	
	//methods
	//roll
	public int roll() 
	{
		numRoll++;
		return (int)(Math.random()*6) + 1;	
	}
	
	public int getNumRoll()
	{
		return numRoll;
	}
	public void reset() 
	{
		numRoll = 0;
		
	}
}

