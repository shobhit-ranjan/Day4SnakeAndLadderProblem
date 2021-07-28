import java.util.Random;

public class DayFourSnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Dice = 0;
		RollADice();
		playOrNoPlay();

	}

	public static int playOrNoPlay()
	{
		int chance = 0;
		Random player = new Random();
		int temp = player.nextInt(3);
		if(temp==0)
		{
			chance=0;
		}
		else if (temp==1) {
			chance=1;
			
		}
		else {
			chance=-1;
		}
		System.out.println(chance);
		return chance;
	}

	public static int RollADice() {
		Random dice = new Random();
		int Number = dice.nextInt(6) + 1;
		System.out.println(Number);
		return Number;
	}

}

class snakeLadderGame {
	void gameToBeStarted() {
		int Pos = 0;
	}
}
