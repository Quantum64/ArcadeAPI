package co.q64.arcade.api.net;

import java.io.File;
import java.net.URL;

/**
 * Deals with files over the internet
 * @author Dylan
 *
 */
public interface NetUtil {
	/**
	 * Downloads a file from the internet to a local destination
	 * @param source the source url
	 * @param dest the destination file
	 */
	public void downloadFile(URL source, File dest) throws Exception;

	/**
	 * Gets the URL for internet resources
	 * @return
	 */
	public String getDataURL();
}
