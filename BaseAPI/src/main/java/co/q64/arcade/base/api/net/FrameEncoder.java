package co.q64.arcade.base.api.net;

import co.q64.arcade.base.api.annotation.inject.Injectable;

@Injectable
public interface FrameEncoder {
	public String encode(Frame frame);
}
