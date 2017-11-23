package co.q64.arcade.core.api.command.commands.item.spawn;

import java.util.List;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.IMPLEMENT)
public interface ItemSpawnDefinition {
	public List<Trait> getTraits();

	public SpawnAttemptResult getItem(List<TraitValue> values);
}
