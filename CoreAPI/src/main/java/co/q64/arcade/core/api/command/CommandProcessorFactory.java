package co.q64.arcade.core.api.command;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.command.VirtualCommandDefinition;

@Global
@Injectable
public interface CommandProcessorFactory {
	public CommandProcessor create(CommandDefinition parent, VirtualCommandDefinition definition);
}
