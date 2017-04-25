package co.q64.arcade.base.api.world;

import java.util.UUID;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
public interface BasePlayer {
	public String getName();
	
	public UUID getUniqueId();
}
