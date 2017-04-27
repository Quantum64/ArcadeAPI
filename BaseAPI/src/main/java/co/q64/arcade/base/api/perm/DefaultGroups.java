package co.q64.arcade.base.api.perm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.annotation.inject.Universal;
import co.q64.arcade.base.api.util.BaseChatColor;

@Noinject
@Universal
public enum DefaultGroups implements Group {

	//formatter:off
	
	DEFAULT("default", new String(), BaseChatColor.GRAY.toString(), null, 0f), 	
	BUILDER("builder", new String(), BaseChatColor.GRAY.toString(), Arrays.asList(DefaultGroups.DEFAULT), 0.3f), 
	JRBUILDER("jrbuilder", new String(), BaseChatColor.GRAY.toString(), Arrays.asList(DefaultGroups.DEFAULT), 0.3f), 
	VIP("vip", BaseChatColor.DARK_GRAY + "[" + BaseChatColor.GREEN + "VIP" + BaseChatColor.DARK_GRAY + "] ", BaseChatColor.GREEN.toString(), Arrays.asList(DefaultGroups.DEFAULT), 0.5f), 
	ARCADIAN("arcadian", BaseChatColor.DARK_GRAY + "[" + BaseChatColor.AQUA + "Arcadian" + BaseChatColor.DARK_GRAY + "] ", BaseChatColor.AQUA.toString(), Arrays.asList(DefaultGroups.VIP), 0.5f), 
	TMOD("tmod", BaseChatColor.DARK_GRAY + "[" + BaseChatColor.AQUA + "T.Mod" + BaseChatColor.DARK_GRAY + "] ", BaseChatColor.RED.toString(), Arrays.asList(DefaultGroups.DEFAULT), 100f), 
	MOD("mod", BaseChatColor.DARK_GRAY + "[" + BaseChatColor.AQUA + "Mod" + BaseChatColor.DARK_GRAY + "] ", BaseChatColor.RED.toString(), Arrays.asList(DefaultGroups.TMOD), 101f), 
	//SRMOD("srmod", BaseChatColor.DARK_GRAY + "[" + BaseChatColor.AQUA + "Sr.Mod" + BaseChatColor.DARK_GRAY + "] ", BaseChatColor.RED.toString(), Arrays.asList(DefaultGroups.TMOD, DefaultGroups.MOD), 102f),
	ADMIN("admin", BaseChatColor.DARK_GRAY + "[" + BaseChatColor.AQUA + "Admin" + BaseChatColor.DARK_GRAY + "] ", BaseChatColor.RED.toString(), Arrays.asList(DefaultGroups.TMOD, DefaultGroups.MOD), 103f), 
	SENIOR("senior", BaseChatColor.DARK_GRAY + "[" + BaseChatColor.AQUA + "Senior" + BaseChatColor.DARK_GRAY + "] ", BaseChatColor.RED.toString(), Arrays.asList(DefaultGroups.TMOD, DefaultGroups.MOD,DefaultGroups.ADMIN, DefaultGroups.VIP, DefaultGroups.ARCADIAN), 104f), 
	MANAGER("manager", BaseChatColor.DARK_GRAY + "[" + BaseChatColor.AQUA + "Manager" + BaseChatColor.DARK_GRAY + "] ", BaseChatColor.RED.toString(), Arrays.asList(DefaultGroups.TMOD, DefaultGroups.MOD,DefaultGroups.ADMIN, DefaultGroups.VIP, DefaultGroups.ARCADIAN, DefaultGroups.SENIOR), 105f), 
	EXEC("exec", BaseChatColor.DARK_GRAY + "[" + BaseChatColor.AQUA + "Exec" + BaseChatColor.DARK_GRAY + "] ", BaseChatColor.RED.toString(), Arrays.asList(DefaultGroups.TMOD, DefaultGroups.MOD,DefaultGroups.ADMIN, DefaultGroups.VIP, DefaultGroups.ARCADIAN, DefaultGroups.SENIOR, DefaultGroups.MANAGER), 107f), 
	OWNER("owner", BaseChatColor.DARK_GRAY + "[" + BaseChatColor.AQUA + "Owner" + BaseChatColor.DARK_GRAY + "] ", BaseChatColor.RED.toString(), Arrays.asList(DefaultGroups.TMOD, DefaultGroups.MOD,DefaultGroups.ADMIN, DefaultGroups.VIP, DefaultGroups.ARCADIAN, DefaultGroups.SENIOR, DefaultGroups.EXEC, DefaultGroups.MANAGER), 108f),
	DEV("dev", BaseChatColor.translateAlternateColorCodes('&', "&8[&4&lD&6&le&e&lv&2&le&a&ll&b&lo&9&lp&5&le&1&lr&8] "), BaseChatColor.RED.toString(), Arrays.asList(DefaultGroups.TMOD, DefaultGroups.MOD,DefaultGroups.ADMIN, DefaultGroups.VIP, DefaultGroups.ARCADIAN, DefaultGroups.SENIOR, DefaultGroups.EXEC, DefaultGroups.MANAGER, DefaultGroups.OWNER), 109f);
	
	//formatter:on

	private String name;
	private String prefix;
	private String nameColor;
	private List<Group> included;
	private float priority;

	private DefaultGroups(String name, String prefix, String nameColor, List<Group> included, float priority) {
		this.name = name;
		this.prefix = prefix;
		this.nameColor = nameColor;
		this.included = included;
		this.priority = priority;
	}

	private DefaultGroups(String name, String prefix, String nameColor, List<Group> included) {
		this(name, prefix, nameColor, included, 1f);
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public String getPrefix() {
		return prefix;
	}

	public String getNameColor() {
		return nameColor;
	}

	@Override
	public List<Group> getExtends() {
		if (included == null) {
			return new ArrayList<Group>();
		}
		return included;
	}

	@Override
	public float getPriority() {
		return priority;
	}

	@Override
	public String getPostfix() {
		return null;
	}
}
