package co.q64.arcade.core.api.managers;

import co.q64.arcade.core.api.implementable.OptionExecutor;

public interface OptionManager {
	public void getOption(String option, OptionExecutor executor);

	public void setOption(String option, String value);
}
