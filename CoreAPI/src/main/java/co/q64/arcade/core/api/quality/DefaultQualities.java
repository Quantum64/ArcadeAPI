package co.q64.arcade.core.api.quality;

import org.bukkit.ChatColor;

import co.q64.arcade.core.api.annotation.Noinject;
import co.q64.arcade.core.api.annotation.Universal;

@Noinject
@Universal
public enum DefaultQualities implements Quality {
	//formatter:off
	DEFAULT("Rare", ChatColor.YELLOW.toString()),
	UNUSUAL("Unusual", ChatColor.DARK_PURPLE.toString()),
	SALVAGED("Salvaged", ChatColor.RED.toString()),
	SELF_MADE("Self-Made", ChatColor.GREEN.toString()),
	COMMUNITY("Community", ChatColor.GREEN.toString()),
	GENUINE("Genuine", ChatColor.DARK_GREEN.toString()),
	HAUNTED("Haunted", ChatColor.DARK_BLUE.toString()),
	FESTIVE("Festive", ChatColor.AQUA.toString())
	//formatter:on
	;
	private String name;
	private String color;

	private DefaultQualities(String name, String color) {
		this.name = name;
		this.color = color;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getColor() {
		return color;
	}

	/*
	itemManager.registerQuality(Item.DEFAILT_QUALITY);
	itemManager.registerQuality("Unusual");
	itemManager.registerQuality("Salvaged");
	itemManager.registerQuality("Self-Made");
	itemManager.registerQuality("Community");
	itemManager.registerQuality("Genuine");
	itemManager.registerQuality("Haunted");
	itemManager.registerQuality("Festive");
	*/
}
