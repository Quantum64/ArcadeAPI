package co.q64.arcade.base.api.util;

import co.q64.arcade.base.api.objects.player.UserData;

public interface InfractionUtil {
	public String checkBanLogin(UserData data);

	public String checkMute(UserData data);

	public String getBanMessage(String reason, long time, long end);

	public String getKickMessage(String reason);

	public String getMuteMessage(String reason, long time, long end);
}