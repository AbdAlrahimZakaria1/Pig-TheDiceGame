//@author Abd Alrahim Zakaria, Email: abdul.rahim.zakarya.2002@gmail.com ,This project was finished on the 4th of May
public class PlayDie {
	//Nothing is quite important here, just calling methods for testing.
	public static void main(String[] args) {
	    DiePlayer[] players=new DiePlayer[4];
		//DieGame ob = new DieGame(players);
		//ob.play();
		//System.out.println(ob.playTurn(players,2));
	    UserDiePlayer ob= new UserDiePlayer();
	    ob.Rolling(0, 0, 0, 0);
		
		/*
		 * Testing which strategy is the best
		int result0=0,result1=0,result2=0,result3=0;
		for(int i=0;i<1000;i++) {
			if (ob.play()==0)
				result0++;
			if (ob.play()==1)
				result1++;
			if (ob.play()==2)
				result2++;
			if (ob.play()==3)
				result3++;
		}
		* Some testing
		System.out.println(result0);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		ob.WinPercCalc(result0,result1,result2,result3);
*/
		
	}
}
