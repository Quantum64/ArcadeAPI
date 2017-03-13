package co.q64.arcade.core.api.managers;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;
import co.q64.arcade.core.api.util.tab.ListnameFormatSupplier;

@Injectable
@Global
public interface ListnameManager extends Manager {
	public void registerNameProvider(ListnameFormatSupplier lfs);

}