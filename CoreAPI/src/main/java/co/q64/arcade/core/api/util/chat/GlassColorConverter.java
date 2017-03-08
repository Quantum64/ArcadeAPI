package co.q64.arcade.core.api.util.chat;

import org.bukkit.ChatColor;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;


/**
 * Converts glass colors to chat colors
 * @author Dylan
 *
 */
@Injectable
@Global
public interface GlassColorConverter {
	/**
	 * Converts a chat color to a glass color data value
	 * @param color the chat color
	 * @return the glass color data value
	 */
	public short getGlassColor(ChatColor color);
	
	/**
	 * Converts a string representation of a chat color to a glass color data value
	 * @param color the string chat color
	 * @return the glass color data value
	 */
	public short getGlassColor(String color);
}
