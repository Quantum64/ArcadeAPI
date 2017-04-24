package co.q64.arcade.core.api.managers;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.transact.Currency;
import co.q64.arcade.core.api.transact.Result;
import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;
import co.q64.arcade.foundation.api.managers.Manager;

@Injectable
@Global
public interface TransactionManager extends Manager {
	public <T> void transact(Player player, float amount, String reason, T argument, Currency currency, Result<T> result);
}