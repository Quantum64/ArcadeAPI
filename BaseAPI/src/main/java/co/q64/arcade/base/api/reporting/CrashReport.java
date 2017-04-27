package co.q64.arcade.base.api.reporting;

import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.annotation.inject.Providable;

/**
 * An unformed report for a serious error
 * This class is responsible for gathering error information before the
 * report is packaged, which makes it ready to use and print error info
 * Ususally this is injected as a Provider<CrashReport>
 * @author Dylan
 *
 */
@Injectable
@Providable
public interface CrashReport {

	/**
	 * Appends the error information to the report
	 * @param error the error message
	 * @return the updated crash report
	 */
	public CrashReport withError(String error);

	/**
	 * Comments for what might have caused the issue, or where it happened
	 * @param comment the comment to append
	 * @return the updated crash report
	 */
	public CrashReport withComment(String comment);

	/**
	 * A message for the first line of the crash report
	 * @param message the message to add to the report
	 * @return the updated crash report
	 */
	public CrashReport withAdditionalMessage(String message);

	/**
	 * The exception thrown before this crash, prints stack trace in report
	 * @param t the thrown exception
	 * @return the updated crash report
	 */
	public CrashReport withException(Throwable t);

	/**
	 * Prepares this crash report for deployment
	 * @return The prepared crash report
	 */
	public PreparedCrashReport build();
}
