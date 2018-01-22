package co.q64.arcade.base.api.managers;

import java.util.List;
import java.util.UUID;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.perm.Group;
import co.q64.arcade.base.api.util.message.MessageReceiver;

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
	public boolean inGroup(MessageReceiver sender, Group group);

	/**
	 * Returns if a player is in the provided group exactly
	 * @param senser the requester
	 * @param group the group
	 * @return if the player is in the group
	 */
	public boolean inGroupExact(MessageReceiver sender, Group group);

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
	public void clear(MessageReceiver sender, String playerName);

	/**
	 * Removes a player from all groups except the provided one
	 * @param sender the requester
	 * @param playerName the player
	 * @param group the group to set the player to
	 */
	public void setGroup(MessageReceiver sender, String playerName, String group);

	/**
	 * Adds a group to the player's group list
	 * @param sender the requester
	 * @param playerName the name of the player to add thr group of
	 * @param group the group to add them to
	 */
	public void addGroup(MessageReceiver sender, String playerName, String group);

	/**
	 * Removes a group from the player's group list
	 * Sends the result to the requester
	 * @param sender the requester
	 * @param playerName the player to remove thr group from
	 * @param group the group to remove
	 */
	public void removeGroup(MessageReceiver sender, String playerName, String group);

	/**
	 * Sends all the groups a player is in to the requester
	 * @param sender the requester
	 * @param playerName the name of the player to get the groups of
	 */
	public void listGroups(MessageReceiver sender, String playerName);

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
	 * Gets a list of all groups in increasing priority
	 * @return the list of groups
	 */
	public List<Group> getGroups();
	
	public Group groupFromName(String name);
	
	public Group getPrimaryGroup(UUID player);
	
	public void disableGroup(Group group);
	
	public void disableGroups(Group... groups);
}