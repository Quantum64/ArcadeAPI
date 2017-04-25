package co.q64.arcade.base.api.objects.player;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import co.q64.arcade.base.api.database.objects.PlayerData;

public interface UserData extends PlayerData {

	public AtomicBoolean needsUpdate();

	public String getIsTradebanned();

	public String getTradebannedBy();

	public long getTradebanTime();

	public void setIsTradebanned(String isTradebanned);

	public void setTradebannedBy(String tradebannedBy);

	public void setTradebanTime(long tradebanTime);

	public String getTableName();

	public String getPlayer();

	public String getName();

	public int getWarnCount();

	public void setWarnCount(int warnCount);

	public int getShadowWarnCount();

	public void setShadowWarnCount(int shadowWarnCount);

	public String getIsBanned();

	public boolean isBanned();

	public void setIsBanned(String isBanned);

	public void setBanned(boolean banned);

	public long getBanTime();

	public void setBanTime(long banTime);

	public long getBanEnd();

	public void setBanEnd(long banEnd);

	public String getBanReason();

	public void setBanReason(String banReason);

	public int getBanCount();

	public void addBan();

	public void setBanCount(int banCount);

	public String getIsMuted();

	public boolean isMuted();

	public void setMuted(boolean muted);

	public void setIsMuted(String isMuted);

	public long getMuteTime();

	public void setMuteTime(long muteTime);

	public long getMuteEnd();

	public void setMuteEnd(long muteEnd);

	public String getMuteReason();

	public void setMuteReason(String muteReason);

	public int getMuteCount();

	public void setMuteCount(int muteCount);

	public void addMute();

	public String getIgnoreListL();

	public List<String> getIgnoreList();

	public void setIgnoreListL(String ignoreListL);

	public void addIgnore(String player);

	public boolean isIgnore(String player);

	public void removeIgnore(String player);

	public void setPlayer(String player);

	public void setName(String name);

	public String getBannedBy();

	public String getMutedBy();

	public String getCurrentWarnsL();

	public String getCurrentKicksL();

	public void setBannedBy(String bannedBy);

	public void setMutedBy(String mutedBy);

	public void setCurrentWarnsL(String currentWarnsL);

	public void setCurrentKicksL(String currentKicksL);

	public String getUnbannedBy();

	public String getUnmutedBy();

	public void setUnbannedBy(String unbannedBy);

	public void setUnmutedBy(String unmutedBy);

	public void setTradebanned(boolean tradebanned);

	public boolean isTradebanned();

	public void addShadowWarn();

	public void addWarn();
}