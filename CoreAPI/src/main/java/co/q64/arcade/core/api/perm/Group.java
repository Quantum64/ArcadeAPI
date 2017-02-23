package co.q64.arcade.core.api.perm;

import java.util.List;

public interface Group {

	public String getName();

	public String getPrefix();

	public String getNameColor();

	public List<Group> getExtends();

	public float getPriority();
}