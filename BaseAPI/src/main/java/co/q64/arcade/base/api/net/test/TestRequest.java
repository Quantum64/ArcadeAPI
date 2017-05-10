package co.q64.arcade.base.api.net.test;

import co.q64.arcade.base.api.net.Frame;
import co.q64.arcade.base.api.net.FrameFieldStack;

public interface TestRequest extends Frame {
	public TestRequest withMessage(String message);

	public String getMessage();

	public void fill(FrameFieldStack stack);
}
