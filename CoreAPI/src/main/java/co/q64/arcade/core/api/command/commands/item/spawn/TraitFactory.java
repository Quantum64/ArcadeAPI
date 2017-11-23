package co.q64.arcade.core.api.command.commands.item.spawn;

import co.q64.arcade.base.api.annotation.inject.Injectable;

@Injectable
public interface TraitFactory {
	public Trait getTrait(String name, TraitType type, boolean optional);

	public Trait getTrait(String name, boolean optional);

	public Trait getTrait(String name, TraitType type);

	public Trait getTrait(String name);

}
