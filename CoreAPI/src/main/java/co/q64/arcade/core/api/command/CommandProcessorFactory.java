package co.q64.arcade.core.api.command;

import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;

import com.google.inject.assistedinject.Assisted;

@Global
@Injectable
public interface CommandProcessorFactory {
	public CommandProcessor create(@Assisted("parent") CommandDefinition parent, @Assisted("definition") CommandDefinition definition);
}
