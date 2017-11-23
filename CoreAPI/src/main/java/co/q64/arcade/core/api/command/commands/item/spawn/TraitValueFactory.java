package co.q64.arcade.core.api.command.commands.item.spawn;

import co.q64.arcade.base.api.annotation.inject.Injectable;

@Injectable
public interface TraitValueFactory {
	public TraitValue getValue(Trait trait, Object value);
}
