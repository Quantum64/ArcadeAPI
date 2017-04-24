package co.q64.arcade.foundation.api.util;

import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;

@Injectable
@Global
public interface CentralModuleNameProvider {
	public String getName();
}
