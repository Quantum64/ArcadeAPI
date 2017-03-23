package co.q64.arcade.core.api.gcompact.objects.items;

import java.util.List;
import java.util.Map;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

import co.q64.arcade.core.api.annotation.inject.Noinject;
import co.q64.arcade.core.api.gcompact.UnusualEffects;
import co.q64.arcade.core.api.objects.item.Item;

@Noinject(reason = Noinject.DATA)
public interface ExtendedItem extends Item {
	public String permBaseName();

	public String getUseCounterTitle();

	public String getLvlupMsg(Player p);

	public int getAmount();

	public void setAmount(int amount);

	public short getData();

	public void setData(short data);

	public List<String> getLore();

	public Map<Enchantment, Integer> getEnchantments();

	public void setEnchantments(Map<Enchantment, Integer> ench);

	public int getPoints();

	public void setPoints(int points);

	public String getAmountString();

	public void setAmountString(String amount);

	public String getDataString();

	public void setDataString(String data);

	public String getEnchantmentsString();

	public void setEnchantmentsString(String enchantments);

	public String getPointsString();

	public void setPointsString(String points);

	public String getPointsId();

	public void setPointsId(String pointsId);

	public int getSlot();

	public void setSlot(int slot);

	public String getSlotString();

	public void setSlotString(String slot);

	public UnusualEffects getUnusualEffect();

	public void setUnusualEffect(UnusualEffects effect);

	public String getUnusualEffectString();

	public void setUnusualEffectString(String s);
}