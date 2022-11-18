
public class RockPaperScissorsMain {

	public static void main(String[] args) {

		Player player1 = new Player("Luca", "rock");
		Player player2 = new Player("Jano", "paper");

		String result = Match.match(player1, player2);

		System.out.println(result);
	}

}
