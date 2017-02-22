package co.q64.arcade.api;


public interface Logger {
	public void log(String message);

	public void log(String message, boolean usePrefix);

	public void warn(String message);

	public void warn(String message, Throwable t);

	public void warn(Throwable t);

	public void error(String message);

	public void error(String message, Throwable t);

	public void error(Throwable t);

	public void wtf(String message);

	public void wtf(String message, Throwable t);

	public void wtf(Throwable t);
}
