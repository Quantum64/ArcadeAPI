package co.q64.arcade.base.api.managers;

import java.util.List;
import java.util.UUID;

import co.q64.arcade.base.api.database.QueryExecutor;
import co.q64.arcade.base.api.database.objects.GeneralData;
import co.q64.arcade.base.api.database.objects.PlayerData;

public interface DatabaseManager extends Manager {
	public void addTable(Class<? extends PlayerData> clazz);

	public void addTable(Class<? extends PlayerData> clazz, String name);

	public void addGeneralTable(Class<? extends GeneralData> clazz);

	public QueryExecutor getQueryRunner();

	public boolean init();
	
	public boolean isSQLBoss();
	
	public String dataToString(PlayerData playerData);

	public <T> T getData(Class<T> dataType, UUID player);

	public <T> List<PlayerData> getDataList(Class<T> dataType);

	public void disconnect(UUID u);

	public boolean enableCustomTable(Class<? extends PlayerData> bean, String name);

	public boolean enableTablePost(String name, Class<? extends PlayerData> bean);

	public String getTableName(Class<? extends PlayerData> data);

	public void addPlayerData(PlayerData add);

	public void manualUpdate(Class<? extends PlayerData> clazz, UUID player);

	public void manualUpdate(PlayerData data);
	
	public void queryData(UUID uuid, boolean reload);

	public <T> Class<? extends T> swapClass(Class<T> clazz);
}