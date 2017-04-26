package co.q64.arcade.base.api.executor;

import java.util.UUID;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.DATA)
public interface ConnectArgumentMap extends ArgumentMap {
	public UUID getArguments();

	public void setKick(boolean kick);

	public boolean getKick();

	public String getKickMessage();

	public void setKickMessage(String message);
}
