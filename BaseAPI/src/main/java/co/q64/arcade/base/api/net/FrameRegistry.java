package co.q64.arcade.base.api.net;

import co.q64.arcade.base.api.annotation.inject.Injectable;

@Injectable
public interface FrameRegistry {
	public void register(String name, Class<? extends Frame> clazz, FrameConstructor constructor);
}
