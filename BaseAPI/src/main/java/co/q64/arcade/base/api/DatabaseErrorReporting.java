package co.q64.arcade.base.api;

public interface DatabaseErrorReporting {
	public void submitError(String message, Exception e);
}
