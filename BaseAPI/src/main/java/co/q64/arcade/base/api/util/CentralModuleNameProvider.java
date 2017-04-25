package co.q64.arcade.base.api.util;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;

@Injectable
@Global
public interface CentralModuleNameProvider {
	public String getName();
}
