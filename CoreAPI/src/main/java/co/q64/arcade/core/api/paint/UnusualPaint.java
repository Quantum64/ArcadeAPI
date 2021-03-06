package co.q64.arcade.core.api.paint;

import org.bukkit.ChatColor;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.IMPLEMENT)
public interface UnusualPaint {
	public String getName();

	public ChatColor getFormat();

	public ChatColor[] getSquence();

	public String getValueName();
}
