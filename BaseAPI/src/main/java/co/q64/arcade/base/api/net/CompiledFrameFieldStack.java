package co.q64.arcade.base.api.net;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.DATA)
public interface CompiledFrameFieldStack {
	public Map<String, Supplier<String>> getGetters();

	public Map<String, Consumer<String>> getSetters();
}
