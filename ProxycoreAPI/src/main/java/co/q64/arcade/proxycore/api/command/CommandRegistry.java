package co.q64.arcade.proxycore.api.command;

import co.q64.arcade.base.api.annotation.inject.Injectable;

@Injectable
public interface CommandRegistry {
	public void register(CommandDefinition command);
}
