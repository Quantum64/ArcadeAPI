package co.q64.arcade.base.api.objects.player;

import java.util.concurrent.atomic.AtomicBoolean;

import co.q64.arcade.base.api.database.objects.PlayerData;

public interface PlayerGlobalData extends PlayerData {

	public AtomicBoolean needsUpdate();

	public String getTableName();

	public String getPlayer();

	public String getName();

	public String getGroups();

	public float getCoins();

	public int getCoinsEarned();

	public int getScore();

	public int getScoreEarned();

	public int getDamageTaken();

	public int getDamageDealt();

	public int getWins();

	public int getLosses();

	public int getKills();

	public int getDeaths();

	public int getGamesStarted();

	public int getGamesFinished();

	public int getArrowsShot();

	public int getArrowsHit();

	public int getMessagesChatted();

	public int getMinutesPlayed();

	public void setPlayer(String player);

	public void setName(String name);

	public void setGroups(String groups);

	public void setCoins(float coins);

	public void addCoins(float coins);

	boolean removeCoins(float coins);

	public void setCoinsEarned(int coinsEarned);

	public void setScore(int score);

	public void addScore(int score);

	public void setScoreEarned(int scoreEarned);

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

	public String toString();

}