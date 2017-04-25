package co.q64.arcade.core.api.managers;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.managers.Manager;
import co.q64.arcade.core.api.util.tab.ListnameFormatSupplier;

@Injectable
@Global
public interface ListnameManager extends Manager {
	public void registerNameProvider(ListnameFormatSupplier lfs);

}