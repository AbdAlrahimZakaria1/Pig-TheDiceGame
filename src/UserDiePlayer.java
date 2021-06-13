//@author Abd Alrahim Zakaria, Email: abdul.rahim.zakarya.2002@gmail.com ,This project was finished on the 4th of May
import java.util.Random;
import java.util.Scanner;
public class UserDiePlayer implements DiePlayer{		
	//This boolean method determines whether the player must keep rolling or not.
	public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
		Scanner scanner = new Scanner(System.in);
		int H_or_R= scanner.nextInt();
		if(H_or_R==1) 
			return true;
		else 
			return false;
		}
	//This method rolls the dice and does the calculaions
	public int Rolling(int myScore, int turnTotal, int maxScore, int rolls){
		Die num = new Die();
		int currNum=0;
		System.out.println("Your turn score is "+turnTotal+"\nIf you want to roll type 1 or any number if you want to hold");
		boolean WantsToRoll=isRolling(myScore, turnTotal, maxScore, rolls);
		//System.out.println(isRolling(myScore, turnTotal, maxScore, rolls));
		if(WantsToRoll==true) {				 
			currNum=num.nextRoll();
				if(currNum==1) {
					System.out.println(currNum);
					turnTotal=0;
					rolls++;
					WantsToRoll=false;
				}
				else {
					rolls++;
					System.out.println(currNum);
					turnTotal+=currNum;
				}
					if(turnTotal+myScore>=GOAL_SCORE) {
				myScore+=turnTotal;
				System.out.println("Congrats!, You've won\nYour score is "+myScore+", And you rolled "+rolls+" times");
				}
					Rolling(myScore, turnTotal, maxScore, rolls);
			}
				

			else if(WantsToRoll==false&&turnTotal!=0) {
				myScore+=turnTotal;
				turnTotal=0;
				System.out.println("Total score is "+myScore);
				Rolling(myScore, turnTotal, maxScore, rolls);
			}
			else
				Rolling(myScore, turnTotal, maxScore, rolls);
		return myScore;
		}
	}
