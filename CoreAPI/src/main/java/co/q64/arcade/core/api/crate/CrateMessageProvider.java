package co.q64.arcade.core.api.crate;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;

@Injectable
@Global
public interface CrateMessageProvider {
	public String getCrateFindMessage(String keyName);
}
