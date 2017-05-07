package co.q64.arcade.base.api.implementable;

import java.util.Optional;

@FunctionalInterface
public interface OptionExecutor {
	public void execute(Optional<String> result);
}
