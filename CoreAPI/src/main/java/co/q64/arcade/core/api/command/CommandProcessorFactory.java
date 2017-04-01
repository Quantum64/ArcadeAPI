package co.q64.arcade.core.api.command;

import co.q64.arcade.core.api.annotation.inject.Global;
import co.q64.arcade.core.api.annotation.inject.Injectable;

@Global
@Injectable
public interface CommandProcessorFactory {
	public CommandProcessor create(CommandDefinition parent, CommandDefinition definition);
}
