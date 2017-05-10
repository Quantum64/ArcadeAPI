package co.q64.arcade.base.api.net;

import co.q64.arcade.base.api.annotation.inject.Injectable;

@Injectable
public interface FrameFactory {
	public Frame decode(String frame);
}
