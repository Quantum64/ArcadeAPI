package co.q64.arcade.core.api.perm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;

public enum DefaultGroups implements Group {

	//formatter:off
	
	DEFAULT("default", new String(), ChatColor.GRAY.toString(), null, 0f), 	
	BUILDER("builder", new String(), ChatColor.GRAY.toString(), Arrays.asList(DefaultGroups.DEFAULT), 0.3f), 
	JRBUILDER("jrbuilder", new String(), ChatColor.GRAY.toString(), Arrays.asList(DefaultGroups.DEFAULT), 0.3f), 
	VIP("vip", ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "VIP" + ChatColor.DARK_GRAY + "] ", ChatColor.GREEN.toString(), Arrays.asList(DefaultGroups.DEFAULT), 0.5f), 
	ARCADIAN("arcadian", ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "Arcadian" + ChatColor.DARK_GRAY + "] ", ChatColor.AQUA.toString(), Arrays.asList(DefaultGroups.VIP), 0.5f), 
	TMOD("tmod", ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "T.Mod" + ChatColor.DARK_GRAY + "] ", ChatColor.RED.toString(), Arrays.asList(DefaultGroups.DEFAULT), 100f), 
	MOD("mod", ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "Mod" + ChatColor.DARK_GRAY + "] ", ChatColor.RED.toString(), Arrays.asList(DefaultGroups.TMOD), 101f), 
	//SRMOD("srmod", ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "Sr.Mod" + ChatColor.DARK_GRAY + "] ", ChatColor.RED.toString(), Arrays.asList(DefaultGroups.TMOD, DefaultGroups.MOD), 102f),
	ADMIN("admin", ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "Admin" + ChatColor.DARK_GRAY + "] ", ChatColor.RED.toString(), Arrays.asList(DefaultGroups.TMOD, DefaultGroups.MOD), 103f), 
	SENIOR("senior", ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "Senior" + ChatColor.DARK_GRAY + "] ", ChatColor.RED.toString(), Arrays.asList(DefaultGroups.TMOD, DefaultGroups.MOD,DefaultGroups.ADMIN, DefaultGroups.VIP, DefaultGroups.ARCADIAN), 104f), 
	MANAGER("manager", ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "Manager" + ChatColor.DARK_GRAY + "] ", ChatColor.RED.toString(), Arrays.asList(DefaultGroups.TMOD, DefaultGroups.MOD,DefaultGroups.ADMIN, DefaultGroups.VIP, DefaultGroups.ARCADIAN, DefaultGroups.SENIOR), 105f), 
	EXEC("exec", ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "Exec" + ChatColor.DARK_GRAY + "] ", ChatColor.RED.toString(), Arrays.asList(DefaultGroups.TMOD, DefaultGroups.MOD,DefaultGroups.ADMIN, DefaultGroups.VIP, DefaultGroups.ARCADIAN, DefaultGroups.SENIOR, DefaultGroups.MANAGER), 107f), 
	OWNER("owner", ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "Owner" + ChatColor.DARK_GRAY + "] ", ChatColor.RED.toString(), Arrays.asList(DefaultGroups.TMOD, DefaultGroups.MOD,DefaultGroups.ADMIN, DefaultGroups.VIP, DefaultGroups.ARCADIAN, DefaultGroups.SENIOR, DefaultGroups.EXEC, DefaultGroups.MANAGER), 108f),
	DEV("dev", ChatColor.translateAlternateColorCodes('&', "&8[&4&lD&6&le&e&lv&2&le&a&ll&b&lo&9&lp&5&le&1&lr&8] "), ChatColor.RED.toString(), Arrays.asList(DefaultGroups.TMOD, DefaultGroups.MOD,DefaultGroups.ADMIN, DefaultGroups.VIP, DefaultGroups.ARCADIAN, DefaultGroups.SENIOR, DefaultGroups.EXEC, DefaultGroups.MANAGER, DefaultGroups.OWNER), 109f);
	
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
