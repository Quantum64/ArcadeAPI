package co.q64.arcade.base.api.net.playerdata;

import co.q64.arcade.base.api.net.Frame;

public interface GetPlayerDataResponse extends Frame {
	public boolean isAccepted();

	public String getData();

	public GetPlayerDataResponse withAccepted(boolean b);

	public GetPlayerDataResponse withData(String data);
}
