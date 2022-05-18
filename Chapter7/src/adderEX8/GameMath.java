package adderEX8;

//USE Adder.java to run program!
//USE Adder.java to run program!
//USE Adder.java to run program!

public class GameMath 
{
	private int Trys;
	private int Score;
	private int Success;
	private int Check;
	//Tester Calls upon these "FUNCTIONS" to produce answer.
	//Sorta Acts like an import "EXAMPLE = Scanner".
	
	public GameMath()
	{
		Trys = 0;
		Score = 0;
	}
	
	public int getTrys()
	{
		return Trys; 
	}
	
	public int getScore()
	{
		return Score; 
	}
	
	public int getSuccess()
	{
		return Success; 
	}
	
	public int getCheck()
	{
		return Check; 
	}
	
	public void addTry(int amt)
	{
		Trys = Trys + amt; 
	}
	
	public void addScore(int amt)
	{
		Score = Score + amt; 
	}
	
	public void addSuccess(int amt)
	{
		Success = Success + amt; 
	}
	
	public void reset()
	{
		Trys = 0; 
		Success = 0;
	}
}
