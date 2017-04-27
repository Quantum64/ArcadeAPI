package co.q64.arcade.base.api.reporting;

import java.util.List;

import co.q64.arcade.base.api.annotation.inject.Noinject;

/**
 * A packaged crash report that is ready for deployment
 * @author Dylan
 *
 */
@Noinject(reason = Noinject.DATA)
public interface PreparedCrashReport {
	/**
	 * Gets the report lines ready to be saved to a file
	 * @return the text of the report
	 */
	public List<String> getPrintedForm();
}
