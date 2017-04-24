package co.q64.arcade.core.api.perm;

import java.util.List;

import co.q64.arcade.foundation.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.DATA)
public interface Group {

	public String getName();

	public String getPrefix();
	
	public String getPostfix();

	public String getNameColor();

	public List<Group> getExtends();

	public float getPriority();
}