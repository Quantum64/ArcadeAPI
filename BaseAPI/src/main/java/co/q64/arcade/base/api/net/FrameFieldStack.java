package co.q64.arcade.base.api.net;

import java.util.function.Consumer;
import java.util.function.Supplier;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
public interface FrameFieldStack {
	public void push(String name, Supplier<String> getter, Consumer<String> setter);
	
	public CompiledFrameFieldStack compile();
}
