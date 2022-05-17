package adderEX8;

public class GameMath 
{
	private int Trys;
	private int Score;
	//Tester Calls upon these "FUNCTIONS" to produce answer.
	//Sorta Acts like an import "EXAMPLE = Scanner".
	
	public GameMath()
	{
		Trys = 0;
		Score = 0;
	}
	
	public GameMath(int tot)
	{
		Trys = tot;
	}
	
	public int getTrys()
	{
		return Trys; 
	}
	
	public int getScore()
	{
		return Score; 
	}
	
	public void addTry(int amt)
	{
		Trys = Trys + amt; 
	}
	
	public void addScore(int amt)
	{
		Score = Score + amt; 
	}
	
	public void reset()
	{
		Trys = 0; 
	}
}
