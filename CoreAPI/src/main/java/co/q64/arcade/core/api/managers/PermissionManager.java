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
	public void enable();

	public boolean inGroup(CommandSender cs, Group g);

	public boolean inGroupExact(CommandSender cs, Group g);

	public boolean inGroup(UUID u, Group g);

	public boolean inGroupExact(UUID u, Group g);

	public void clear(CommandSender sender, String playerName);

	public void setGroup(CommandSender sender, String playerName, String group);

	public void addGroup(CommandSender sender, String playerName, String group);

	public void removeGroup(CommandSender sender, String playerName, String group);

	public void listGroups(CommandSender sender, String playerName);

	public List<Class<? extends Group>> getGroupProviders();

	public void registerGroupProvider(Class<? extends Group> clazz);

	public void enablePermissionsLink();

	public List<Group> getGroups();

}