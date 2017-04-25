package co.q64.arcade.core.api.util.tab;

import org.bukkit.ChatColor;

import co.q64.arcade.base.api.container.BasePlayer;

public interface ListnameFormatSupplier {
	public abstract ChatColor[] getListnameColors(BasePlayer p);

	public abstract Priority getPriority();

	public abstract boolean getContinue();

	public default ChatColor getListnameFormat(BasePlayer p) {
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