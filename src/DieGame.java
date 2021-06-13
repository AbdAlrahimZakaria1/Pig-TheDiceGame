//@author Abd Alrahim Zakaria, Email: abdul.rahim.zakarya.2002@gmail.com ,This project was finished on the 4th of May
public class DieGame {
	public int myScore=0;
	public int turnTotal=0;
	public int maxScore=0;
	public int rolls=0;
	public static final int GOAL_SCORE = 100;
	public DiePlayer[] players=new DiePlayer[4];
	public int[] scores=new int[4];
	//Defining constructor and initializing the scores
	public DieGame(DiePlayer[] players) {
		scores[0]=0;
		scores[1]=0;
		scores[2]=0;
		maxScore=0;
	}
	//This method keeps rolling untill one of the strategies win
	public int play() {
	players[0]=new HoldAt25DiePlayer();
	players[1]=new HoldAt20DiePlayer();
	players[2]=new RaceToGoalDiePlayer();
	players[3]=new MyDiePlayer();
	scores[0]=0;
	scores[1]=0;
	scores[2]=0;
	scores[3]=0;
	maxScore=0;
	while(scores[0]<100 && scores[1]<100 && scores[2]<100&& scores[3]<100) {
	scores[0]=players[0].Rolling(scores[0], turnTotal, maxScore, rolls);
	scores[1]=players[1].Rolling(scores[1], turnTotal, maxScore, rolls);
	scores[2]=players[2].Rolling(scores[2], turnTotal, maxScore, rolls);
	scores[3]=players[3].Rolling(scores[3], turnTotal, maxScore, rolls);
	//These if statements gives the value of the maxScore for each turn
	if(scores[0]>=scores[1]&&scores[0]>=scores[2])
		maxScore=scores[0];
	else if(scores[1]>=scores[0]&&scores[1]>=scores[2])
		maxScore=scores[1];
	else if(scores[2]>=scores[0]&&scores[2]>=scores[1])
		maxScore=scores[2];
	else
		maxScore=scores[3];
	
	}
	//System.err.println(scores[0]);
	//System.err.println(scores[1]);
	//System.err.println(scores[2]);
	//System.err.println(scores[3]);
	//System.out.println(maxScore);
		if(scores[0]>=100)
			return 0;
		else if(scores[1]>=100)
			return 1;
		else if(scores[2]>=100)
			return 2;
		else if(scores[3]>=100)
			return 3;
		
		else 
			return -1;
	}//This method plays one turn only for the selected strategy
	int playTurn(DiePlayer[] p, int playerNum) {
		players[0]=new HoldAt25DiePlayer();
		players[1]=new HoldAt20DiePlayer();
		players[2]=new RaceToGoalDiePlayer();
		players[3]=new MyDiePlayer();
		scores[playerNum]=players[playerNum].Rolling(0, 0, 0, 0);
		return scores[playerNum];
	}//This method gets the maxScore value after the game finishes
	int getMaxScore() {
		play();
		return maxScore;
	}//This method prints the scores of all strategies after one of them wins
	void printScores(){
		play();
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);	
	}//This method calculates the percentage of the winrate for each strategy including my own
	void WinPercCalc(double result0,double result1, double result2,double result3) {
		double HoldAt20=result0;
		double HoldAt25=result1;
		double RaceToGoal=result2;
		double MyStrategy=result3;
		System.out.println(HoldAt20/10+"%");
		System.out.println(HoldAt25/10+"%");
		System.out.println((RaceToGoal/10)+"%");
		System.out.println(MyStrategy/10+"%");
	}
	
}
