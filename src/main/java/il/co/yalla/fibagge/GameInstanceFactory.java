package il.co.yalla.fibagge;

public class GameInstanceFactory {
	public static GameInstance request(String gameName, String gameLang) {
		GameInstance gi = new GameInstance();
		gi.generateCode();
		return gi;
	}
}
