package co.q64.arcade.api;

/**
 * Represents a logger for logging stuff
 * @author Dylan
 *
 */
public interface Logger {
	/**
	 * Logs a message for debug purpose
	 * @param message the message to log
	 */
	public void log(String message);

	/**
	 * Logs a debug message with additional information concerning the package and module
	 * @param message the message to log
	 * @param usePrefix add the package information
	 */
	public void log(String message, boolean usePrefix);

	/**
	 * Warning for a potentially dangerous condition
	 * @param message the warning to log
	 */
	public void warn(String message);

	/**
	 * Warning for a potentially dangerous condition with error
	 * @param message the warning to log
	 * @param t the error to print
	 */
	public void warn(String message, Throwable t);

	/**
	 * Warning for a potentially dangerous condition with error
	 * @param t the error to log
	 */
	public void warn(Throwable t);

	/**
	 * Logs an invalid state
	 * @param message the state to log
	 */
	public void error(String message);

	/**
	 * Logs an invalid state with an error
	 * @param message the state to log
	 * @param t the error
	 */
	public void error(String message, Throwable t);

	/**
	 * Logs an invalid state with error
	 * @param t the error to log
	 */
	public void error(Throwable t);
}
