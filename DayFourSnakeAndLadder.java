import java.util.Random;

public class DayFourSnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int timesYouPlayed = 0;
		RollADice();
		playOrNoPlay();
		int position = snakeLadderGame.gameToBeStarted();
		while (position <= 100) {
			int DiceOne = RollADice();
			int Play = playOrNoPlay();
			int movement = DiceOne * Play;
			if (position > 100) {
				continue;
			}
			position = position + movement;
			if (position < 0) {
				position = 0;
			}
			System.out.println("Position is " + position);
		}

		System.out.println("Till Now You Have Played " + timesYouPlayed);

	}

	public static int playOrNoPlay() {
		int chance = 0;
		Random player = new Random();
		int temp = player.nextInt(3);
		if (temp == 0) {
			chance = 0;
		} else if (temp == 1) {
			chance = 1;

		} else {
			chance = -1;
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
	public static int gameToBeStarted() {
		int Pos = 0;
		return Pos;
	}
}
