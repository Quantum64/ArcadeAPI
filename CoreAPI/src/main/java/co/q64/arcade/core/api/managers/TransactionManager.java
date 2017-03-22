package co.q64.arcade.core.api.managers;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;
import co.q64.arcade.core.api.transact.Currency;
import co.q64.arcade.core.api.transact.Result;

@Injectable
@Global
public interface TransactionManager extends Manager {
	public <T> void transact(Player player, float amount, String reason, T argument, Currency currency, Result<T> result);
}