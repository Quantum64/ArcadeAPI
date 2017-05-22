package co.q64.arcade.proxycore.api.objects.player;

import co.q64.arcade.base.api.database.objects.PlayerData;

public interface IPData extends PlayerData {
	public String getIPs();

	public void setIPs(String ips);
}
