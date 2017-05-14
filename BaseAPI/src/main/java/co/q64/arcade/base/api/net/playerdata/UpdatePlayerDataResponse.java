package co.q64.arcade.base.api.net.playerdata;

import co.q64.arcade.base.api.net.Frame;

public interface UpdatePlayerDataResponse extends Frame {
	public UpdatePlayerDataResponse withAccepted(boolean accepted);

	public boolean isAccepted();
}
