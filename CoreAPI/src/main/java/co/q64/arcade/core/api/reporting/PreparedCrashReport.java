package co.q64.arcade.core.api.reporting;

import java.util.List;

/**
 * A packaged crash report that is ready for deployment
 * @author Dylan
 *
 */
public interface PreparedCrashReport {
	/**
	 * Gets the report lines ready to be saved to a file
	 * @return the text of the report
	 */
	public List<String> getPrintedForm();
}
