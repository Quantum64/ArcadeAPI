package co.q64.arcade.api;

/**
 * Represents data necessary for all of arcade's functionality
 * @author Dylan
 *
 */
public interface License {
	/**
	 * Gets the username of the license holder
	 * @return the username
	 */
	public String getUsername();
	
	/**
	 * Gets the repo of the license holder
	 * @return the repo name
	 */
	public String getRepo();
}
