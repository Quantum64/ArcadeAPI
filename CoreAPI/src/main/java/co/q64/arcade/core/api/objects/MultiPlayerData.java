package co.q64.arcade.core.api.objects;

import java.util.List;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.DATA)
public interface MultiPlayerData {
	public String getPlayer();

	public String getLocalPlayer();

	public String getName();

	public String getLocalName();

	public String getKitsOwned();

	public boolean hasKit(int id);

	public String getGroups();

	public float getCoins();

	public int getGlobalCoinsEarned();

	public int getCoinsEarned();

	public int getGameScoreEarned();

	public int getScore();

	public int getScoreEarmed();

	public int getGameScoreEarmed();

	public int getGlobalDamageTaken();

	public int getDamageTaken();

	public int getGameDamageTaken();

	public int getGlobalDamageDealt();

	public int getDamageDealt();

	public int getGameDamageDealt();

	public int getGlobalWins();

	public int getWins();

	public int getGlobalLosses();

	public int getLosses();

	public int getGlobalKills();

	public int getKills();

	public int getGameKills();

	public int getGlobalDeaths();

	public int getDeaths();

	public int getGameDeaths();

	public int getGlobalGamesStarted();

	public int getGamesStarted();

	public int getGlobalGamesFinished();

	public int getGamesFinished();

	public int getGlobslArrowsShot();

	public int getArrowsShot();

	public int getGameArrowsShot();

	public int getGlobalHit();

	public int getArrowsHit();

	public int getGameArrowsHit();

	public int getGlobalMessagesChatted();

	public int getMessagesChatted();

	public int getGameMessagesChatted();

	public int getGlobalMinutesPlayed();

	public int getMinutesPlayed();

	public void setPlayer(String player);

	public void setName(String name);

	public void setKitsOwned(String kitsOwned);

	public boolean addOwnedKit(int id);

	public void setCoins(float coins);

	public void addCoins(float coins);

	public boolean removeCoins(float coins);

	public void setCoinsEarned(int coinsEarned);

	public void setScore(int score);

	public void addScore(int score);

	public void setDamageTaken(int damageTaken);

	public void addDamageTaken(int damage);

	public void setDamageDealt(int damageDealt);

	public void addDamageDealt(int damage);

	public void setWins(int wins);

	public void addWin();

	public void setLosses(int losses);

	public void addLoss();

	public void setKills(int kills);

	public void addKill();

	public void setDeaths(int deaths);

	public void addDeath();

	public void setGamesStarted(int gamesStarted);

	public void addGameStarted();

	public void setGamesFinished(int gamesFinished);

	public void addGameFinished();

	public void setArrowsShot(int arrowsShot);

	public void addShot();

	public void setArrowsHit(int arrowsHit);

	public void addHit();

	public void setMessagesChatted(int messagesChatted);

	public void addChatMessage();

	public void setMinutesPlayed(int minutesPlayed);

	public void addTimePlayed(int minutesPlayed);

	public List<String> getLocalList(String name);

	public List<String> getGameList(String name);

	public List<String> getGlobalList(String name);
}
