import java.util.Random;

public class DayFourSnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Dice=0;
		RollADice();
		

	}

	
	public static int RollADice()
	{
		Random dice=new Random();
		int Number=dice.nextInt(6)+1;
		System.out.println(Number);
		return Number;
	}
}

class snakeLadderGame {
	void gameToBeStarted() {
		int Pos = 0;
	}
}
