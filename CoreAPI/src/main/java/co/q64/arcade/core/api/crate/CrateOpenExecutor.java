package co.q64.arcade.core.api.crate;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.objects.item.Item;
import co.q64.arcade.foundation.api.annotation.inject.Noinject;

/**
 * Executes when crates are opened, should be
 * registered in the crate manager
 * @author Dylan
 *
 */
@Noinject(reason = Noinject.IMPLEMENT)
public interface CrateOpenExecutor {
	/**
	 * Returns if an animation should play for this player
	 * @param player the player to test
	 * @return if the animation should play
	 */
	public boolean shouldUseExec(Player player);

	/**
	 * Plays the crate open animation
	 * @param player the player to play the animation for
	 * @param found the item that the player found
	 */
	public void openCrateAnim(Player player, Item found);
}
