package co.q64.arcade.core.api.managers;

import java.util.List;
import java.util.UUID;

import org.bukkit.command.CommandSender;

import co.q64.arcade.core.api.annotation.Injectable;
import co.q64.arcade.core.api.perm.Group;

/**
 * The central component of AP (arcade permissions)
 * @author Dylan
 * DOCUMENTATION NEEDED!
 */
@Injectable
public interface PermissionManager {
	/**
	 * Enables the permission manager
	 * Automatically called on core init
	 */
	public void enable();

	/**
	 * Returns if a player is in the provided group or any extension of that group
	 * @param cs the requester
	 * @param g the group
	 * @return if the player is in the group
	 */
	public boolean inGroup(CommandSender cs, Group g);

	/**
	 * Returns if a player is in the provided group exactly
	 * @param cs the requester
	 * @param g the group
	 * @return if the player is in the group
	 */
	public boolean inGroupExact(CommandSender cs, Group g);

	/**
	 * Returns if a player is in the provided group or any extension of that group
	 * @param g the group
	 * @return if the player is in the group
	 */
	public boolean inGroup(UUID u, Group g);

	/**
	 * Returns if a player is in the provided group exactly
	 * @param g the group
	 * @return if the player is in the group
	 */
	public boolean inGroupExact(UUID u, Group g);

	/**
	 * Removes all groups for a player
	 * @param sender the requester
	 * @param playerName the player to remove groups from
	 */
	public void clear(CommandSender sender, String playerName);

	/**
	 * Removes a player from all groups except the provided one
	 * @param sender the requester
	 * @param playerName the player
	 * @param group the group to set the player to
	 */
	public void setGroup(CommandSender sender, String playerName, String group);

	/**
	 * Adds a group to the player's group list
	 * @param sender the requester
	 * @param playerName
	 * @param group
	 */
	public void addGroup(CommandSender sender, String playerName, String group);

	public void removeGroup(CommandSender sender, String playerName, String group);

	public void listGroups(CommandSender sender, String playerName);

	public List<Class<? extends Group>> getGroupProviders();

	public void registerGroupProvider(Class<? extends Group> clazz);

	public void enablePermissionsLink();

	public List<Group> getGroups();

}