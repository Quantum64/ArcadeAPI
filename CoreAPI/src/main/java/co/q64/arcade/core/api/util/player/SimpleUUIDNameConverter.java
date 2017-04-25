package co.q64.arcade.core.api.util.player;

import java.util.Optional;
import java.util.UUID;

import javax.inject.Singleton;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import co.q64.arcade.base.api.util.player.UUIDNameConverter;

@Singleton
public class SimpleUUIDNameConverter implements UUIDNameConverter {

	@Override
	public Optional<String> uuidToName(UUID uuid) {
		Player p = Bukkit.getPlayer(uuid);
		if (p == null) {
			return Optional.empty();
		}
		return Optional.of(p.getName());
	}
}
