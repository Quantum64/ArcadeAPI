package co.q64.arcade.api.staticaccesshack;

import co.q64.arcade.api.Logger;

public class Console {
	public static Logger CONSOLE;

	public static void setInstance(Logger logger) {
		CONSOLE = logger;
	}
}
