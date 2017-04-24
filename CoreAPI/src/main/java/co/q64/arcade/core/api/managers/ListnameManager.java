package co.q64.arcade.core.api.managers;

import co.q64.arcade.foundation.api.managers.Manager;
import co.q64.arcade.core.api.util.tab.ListnameFormatSupplier;
import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;

@Injectable
@Global
public interface ListnameManager extends Manager {
	public void registerNameProvider(ListnameFormatSupplier lfs);

}