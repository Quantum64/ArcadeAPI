package co.q64.arcade.base.api.net.test;

import co.q64.arcade.base.api.net.Frame;

public interface TestResponse extends Frame {
	public boolean isAccepted();
	
	public void withAccepted(boolean b);
}
