//@author Abd Alrahim Zakaria, Email: abdul.rahim.zakarya.2002@gmail.com ,This project was finished on the 4th of May
public class HoldAt20DiePlayer implements DiePlayer  {
		//This boolean method determines whether the player/strategy must keep rolling or not.
	public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
		if(myScore<GOAL_SCORE)
			return true;
		else
			return false;
}
	//This method rolls the dice and does the calculaions
	public int Rolling(int myScore, int turnTotal, int maxScore, int rolls) {
		if(isRolling(myScore, turnTotal, maxScore, rolls)) {
		
		while(turnTotal<20)
		{
			Die object = new Die();
			int num=object.nextRoll();
			if(num==1) {
				//System.err.print(num+" ");
				//System.out.println();
				rolls++;
				turnTotal=0;
				break;
		}
			else {
				//System.out.print(num+" ");
				turnTotal+=num;
				rolls++;
			}
			if(turnTotal+myScore>=GOAL_SCORE) {
			myScore+=turnTotal;
			turnTotal=0;
			break;
		}
	}

		if(turnTotal>=20) {
		//System.err.print("added "+turnTotal+"\n");
		myScore +=turnTotal;
		turnTotal=0;
		}
		}
		//System.out.println("HoldAt20");
		//System.err.println("Rolls: "+rolls);
		//System.err.println("Score is: "+myScore);
		return myScore;
		
	}
}
