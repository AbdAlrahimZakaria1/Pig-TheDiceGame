//@author Abd Alrahim Zakaria, Email: abdul.rahim.zakarya.2002@gmail.com ,This project was finished on the 4th of May
public interface DiePlayer {
	//Declaring variables
	public final int GOAL_SCORE = 100;
	public DiePlayer[] players=new DiePlayer[3];
	public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls);
	int Rolling(int myScore, int turnTotal, int maxScore, int rolls);//This method calls the "isRolling" method to know whether it should keep rolling or not
	
	
}																	
