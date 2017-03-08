package co.q64.arcade.core.api.managers;

import java.util.List;
import java.util.UUID;

import org.bukkit.command.CommandSender;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;
import co.q64.arcade.core.api.perm.Group;

/**
 * The central component of AP (arcade permissions)
 * @author Dylan
 */
@Injectable
@Global
public interface PermissionManager extends Manager {
	/**
	 * Returns if a player is in the provided group or any extension of that group
	 * @param sender the requester
	 * @param group the group
	 * @return if the player is in the group
	 */
	public boolean inGroup(CommandSender sender, Group group);

	/**
	 * Returns if a player is in the provided group exactly
	 * @param senser the requester
	 * @param group the group
	 * @return if the player is in the group
	 */
	public boolean inGroupExact(CommandSender sender, Group group);

	/**
	 * Returns if a player is in the provided group or any extension of that group
	 * @param uuid the player check the group of
	 * @param group the group
	 * @return if the player is in the group
	 */
	public boolean inGroup(UUID uuid, Group group);

	/**
	 * Returns if a player is in the provided group exactly
	 * @param uuid the player check the group of
	 * @param g the group
	 * @return if the player is in the group
	 */
	public boolean inGroupExact(UUID uuid, Group group);

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
	 * @param playerName the name of the player to add thr group of
	 * @param group the group to add them to
	 */
	public void addGroup(CommandSender sender, String playerName, String group);

	/**
	 * Removes a group from the player's group list
	 * Sends the result to the requester
	 * @param sender the requester
	 * @param playerName the player to remove thr group from
	 * @param group the group to remove
	 */
	public void removeGroup(CommandSender sender, String playerName, String group);

	/**
	 * Sends all the groups a player is in to the requester
	 * @param sender the requester
	 * @param playerName the name of the player to get the groups of
	 */
	public void listGroups(CommandSender sender, String playerName);

	/**
	 * Get all the classes that contain registered groups, this will almost alwyas be enums
	 * @return the list of group providers
	 */
	public List<Class<? extends Group>> getGroupProviders();

	/**
	 * Adds a new group provider
	 * @param provider the enum of groups to add
	 */
	public void registerGroupProvider(Class<? extends Group> provider);

	/**
	 * Allows arcade to change the groups of players to arcade groups
	 * for any permissions plugin installed
	 */
	public void enablePermissionsLink();

	/**
	 * Gets a list of all groups in increasing priority
	 * @return the list of groups
	 */
	public List<Group> getGroups();
}