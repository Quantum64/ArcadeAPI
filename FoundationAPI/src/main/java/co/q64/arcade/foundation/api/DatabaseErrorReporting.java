package co.q64.arcade.foundation.api;

public interface DatabaseErrorReporting {
	public void submitError(String message, Exception e);
}
