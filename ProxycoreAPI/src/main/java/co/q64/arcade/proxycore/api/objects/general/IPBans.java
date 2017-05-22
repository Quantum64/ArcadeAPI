package co.q64.arcade.proxycore.api.objects.general;

import co.q64.arcade.base.api.database.objects.GeneralData;

public interface IPBans extends GeneralData {
	public String getIp();

	public void setIp(String ip);

	public long getBanTime();

	public void setBanTime(long time);

	public String getBannedBy();

	public void setBannedBy(String bannedBy);
	
	public String getBanReason();
	
	public void setBanReason(String reason);
}
