package il.co.yalla.fibagge;

import java.util.List;
import java.util.Random;

public class GameInstance {
	protected String gameCode;
	protected List<Player> players;
	
	public void generateCode() {
		char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		gameCode = sb.toString();
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}
	
	
}
