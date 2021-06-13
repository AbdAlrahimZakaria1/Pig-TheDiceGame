//@author Abd Alrahim Zakaria, Email: abdul.rahim.zakarya.2002@gmail.com ,This project was finished on the 4th of May
import java.util.Random;
//This method represents the Die.
public class Die {
	public int nextRoll() {
		Random r= new Random();
		int number = r.nextInt(6)+1;
		return number;
	}
}
