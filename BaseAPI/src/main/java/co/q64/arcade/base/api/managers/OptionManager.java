package co.q64.arcade.base.api.managers;

import co.q64.arcade.base.api.implementable.OptionExecutor;

public interface OptionManager {
	public void getOption(String option, OptionExecutor executor);

	public void setOption(String option, String value);
}
