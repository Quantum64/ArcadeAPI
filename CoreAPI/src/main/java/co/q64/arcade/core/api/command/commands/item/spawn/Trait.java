package co.q64.arcade.core.api.command.commands.item.spawn;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.DATA)
public interface Trait {
	public String getName();

	public TraitType getType();
	
	public boolean isOptional();

	public Trait setup(String name, TraitType type, boolean optional);
}
