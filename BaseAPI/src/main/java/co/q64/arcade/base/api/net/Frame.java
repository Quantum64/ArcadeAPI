package co.q64.arcade.base.api.net;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
public interface Frame {
	public void fill(FrameFieldStack stack);
}
