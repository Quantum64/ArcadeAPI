package co.q64.arcade.core.api.item;

import java.util.List;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import co.q64.arcade.api.lang.LinkedQueue;
import co.q64.arcade.core.api.annotation.Noinject;
import co.q64.arcade.core.api.item.core.FieldStack;
import co.q64.arcade.core.api.quality.Quality;

@Noinject(reason = Noinject.DATA)
public interface ArcadeItem {
	public String encode();

	public String getFullName();

	public List<String> getFullLore();

	public void onItemUse(Player p);

	public String getLvlupMsg(Player p);

	public String getUseCounterLore();

	public String getUseCounterTitle();

	public UUID getUuid();

	public String getType();

	public String getBaseName();

	public String getCustomName();

	public int getLevel();

	public Material getItem();

	public String getItemString();

	public List<String> getLore();

	public List<String> getAttrib();

	public Quality getQuality();
	
	public String getQualityName();

	public String getQualityColor();

	public boolean getEquipped();

	public boolean getTradeable();

	public boolean getCraftable();

	public String getOrigion();

	public boolean getUseCounter();

	public int getUses();

	public int getInvSlot();

	public boolean getCollectors();

	public String getGiftedBy();

	public void setUuid(UUID uuid);

	public void setType(String type);

	public void setBaseName(String baseName);

	public void setCustomName(String customName);

	public void setLevel(int level);

	public void setItem(Material item);

	public void setLore(List<String> lore);

	public void setAttrib(List<String> attrib);

	public void setAttribString(String s);

	public void setQuality(Quality quality);
	
	public void setQualityName(String quality);

	public void setQualityColor(String qualityColor);

	public void setEquipped(boolean equipped);

	public void setEquippedString(String s);

	public void setTradable(boolean tradable);

	public void setCraftable(boolean craftable);

	public void setOrigion(String origion);

	public void setUseCounter(boolean useCounter);

	public void setUses(int uses);

	public void setInvSlot(int slot);

	public String getSalvagedColor();

	public void setSalvagedColor(String salvagedColor);

	public void setInvSlotString(String s);

	public void setCollectors(boolean c);

	public void setCollectorsString(String s);

	public void setGiftedBy(String s);

	public ItemStack getCustomDisplayItem();

	public ArcadeItem copy();

	public String getUsableIn();

	public void setUsableIn(String usableIn);

	public void setUnusualSalvagedColor(List<ChatColor> colors);

	public LinkedQueue<ChatColor> getUnusualSalvagedColor();
	
	public FieldStack getFieldStack();
}
