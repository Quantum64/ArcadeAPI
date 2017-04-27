package co.q64.arcade.base.api.command;

import co.q64.arcade.base.api.perm.DefaultGroups;
import co.q64.arcade.base.api.perm.Group;

public interface VirtualCommandDefinition {
	public String getName();
	
	public default Group getGroup() {
		return DefaultGroups.DEFAULT;
	}
}
