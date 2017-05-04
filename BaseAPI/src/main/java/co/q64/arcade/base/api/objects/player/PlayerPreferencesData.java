package co.q64.arcade.base.api.objects.player;

import co.q64.arcade.base.api.database.objects.PlayerData;

public interface PlayerPreferencesData extends PlayerData {

	public String getTableName();

	public String getName();

	public void setName(String name);

	public String getPlayer();

	public void setPlayer(String player);

	public String getStaffMsg();

	public String getLooping();

	public String getArcade();

	public String getHidePlayers();

	public void setStaffMsg(String staffMsg);

	public void setLooping(String looping);

	public void setArcade(String arcade);

	public void setHidePlayers(String hidePlayers);

}