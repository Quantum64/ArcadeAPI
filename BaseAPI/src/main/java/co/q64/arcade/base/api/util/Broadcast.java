package co.q64.arcade.base.api.util;

import co.q64.arcade.base.api.annotation.inject.Injectable;

@Injectable
public interface Broadcast {
	public void broadcast(String message);
}
