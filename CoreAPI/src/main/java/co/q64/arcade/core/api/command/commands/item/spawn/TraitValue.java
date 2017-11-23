package co.q64.arcade.core.api.command.commands.item.spawn;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.DATA)
public interface TraitValue {
	public Trait getTrait();
	
	public String getString();
	
	public int getInt();
	
	public float getFloat();
	
	public boolean getBoolean();
	
	public TraitValue setup(Trait trait, Object value);
}
