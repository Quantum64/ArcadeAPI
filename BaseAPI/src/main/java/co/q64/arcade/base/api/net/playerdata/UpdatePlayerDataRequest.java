package co.q64.arcade.base.api.net.playerdata;

import co.q64.arcade.base.api.net.Frame;

public interface UpdatePlayerDataRequest extends Frame {
	public String getData();

	public UpdatePlayerDataRequest withData(String data);
	
	public UpdatePlayerDataRequest withTable(String table);
	
	public String getTable();
}
