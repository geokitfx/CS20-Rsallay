package adderEX8;

public class GameScore 
{
	private int Score;
	private int Trys;
	//Tester Calls upon these "FUNCTIONS" to produce answer.
	//Sorta Acts like an import "EXAMPLE = Scanner".
	
	public GameScore()
	{
		Score = 0;
	}
	
	public void start()
	{
		int Score;
		
		for (int i = 0; i < 3; i++)
		{
			Score = (int)(Math.random() + 0.5);
			if (Score == 1)
			{
				Trys += 1;
			}
		}
	}
	
	public double getTotal()
	{
		return Score; 
	}
	
	public void addTot(double amt)
	{
		Score = (int) (Score + amt); 
	}
	
	public void subTot(double amt)
	{
		if (amt <= Score) 
		{ Score = (int) (Score - amt); }
		else
		{System.out.println("Insufficient Balance.");}
	}
}
