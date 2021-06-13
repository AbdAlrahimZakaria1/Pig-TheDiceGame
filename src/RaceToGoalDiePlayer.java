//@author Abd Alrahim Zakaria, Email: abdul.rahim.zakarya.2002@gmail.com ,This project was finished on the 4th of May
public class RaceToGoalDiePlayer implements DiePlayer{
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
			if(myScore>=71 || maxScore>=71) {
				//System.out.println("my score is >71");
				while(myScore<100) {
					Die num = new Die();
					int currNum= num.nextRoll();
					if(currNum==1) {
						rolls++;
						//System.out.println(currNum);
						turnTotal=0;
						break;
					}
					else {
						rolls++;
						turnTotal+=currNum;
						//System.out.print(currNum+" ");
					}
					if(turnTotal+myScore>=GOAL_SCORE) {
						//System.out.println(myScore);
						myScore+=turnTotal;
						turnTotal=0;
						break;
					}
				}
			}
			else{
				
				while(turnTotal<21 + Math.round((maxScore-myScore)/8)) {
						Die num = new Die();
						int currNum= num.nextRoll();
						if(currNum==1) {
							rolls++;
							//System.out.print(currNum+"\n");
							turnTotal=0;
							break;
						}
						else {
							rolls++;
							//System.out.print(currNum+" ");
							turnTotal+=currNum;
						}
						if(turnTotal+myScore>=100) {
							myScore+=turnTotal;
							turnTotal=0;
							break;
						}
					}
				if(turnTotal>=21+Math.round((maxScore-myScore)/8)) {
					myScore+=turnTotal;
					//System.err.println("added "+turnTotal);
					turnTotal=0;
				}
			}
		}
		//System.out.println("RaceToGoal");
		//System.err.println("Rolls: "+rolls);
		//System.err.println("Score is: "+myScore);
		return myScore;
		};
}
