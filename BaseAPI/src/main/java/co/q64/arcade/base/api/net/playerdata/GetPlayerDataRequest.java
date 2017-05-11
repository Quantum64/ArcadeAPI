package co.q64.arcade.base.api.net.playerdata;

import java.util.UUID;

import co.q64.arcade.base.api.net.Frame;
import co.q64.arcade.base.api.net.FrameFieldStack;

public interface GetPlayerDataRequest extends Frame {
	public GetPlayerDataRequest withTable(String table);
	
	public GetPlayerDataRequest withUUID(UUID id);

	public String getTable();
	
	public UUID getUUID();

	public void fill(FrameFieldStack stack);
}
