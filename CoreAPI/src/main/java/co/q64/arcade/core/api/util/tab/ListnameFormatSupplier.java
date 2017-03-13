package co.q64.arcade.core.api.util.tab;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public interface ListnameFormatSupplier {
	public abstract ChatColor[] getListnameColors(Player p);

	public abstract Priority getPriority();

	public abstract boolean getContinue();

	public default ChatColor getListnameFormat(Player p) {
		return null;
	}

	public static enum Priority {
		LOWEST(0), LOW(1), NORMAL(2), HIGH(3), HIGHEST(4);

		private int value;

		private Priority(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}
}