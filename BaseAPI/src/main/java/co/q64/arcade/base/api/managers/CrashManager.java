package co.q64.arcade.base.api.managers;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.reporting.PreparedCrashReport;
import co.q64.arcade.base.api.util.message.MessageReceiver;

/**
 * A system for submitting serious errors, this shows detailed information
 * to the user in the hopes that they will report the error
 * @author Dylan
 *
 */
@Injectable
@Global
public interface CrashManager extends Manager {
	/**
	 * Submits a report, this will only be printed to the console
	 * @param report the report to submit
	 */
	public void submitReport(PreparedCrashReport report);

	/**
	 * Submits a report and sends it to the user using a paste web service
	 * @param report the report to submit
	 * @param sender the user to send the link to
	 */
	public void submitReport(PreparedCrashReport report, MessageReceiver sender);

	/**
	 * Submits a report and sends it to the user using a paste web service,
	 * the link will be provided with a custom message
	 * @param report the report to submit
	 * @param sender the user to send the link to
	 * @param message a custom message to send with the link
	 */
	public void submitReport(PreparedCrashReport report, MessageReceiver sender, String message);
}