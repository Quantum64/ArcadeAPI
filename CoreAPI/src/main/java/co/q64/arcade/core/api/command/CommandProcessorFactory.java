package co.q64.arcade.core.api.command;

import com.google.inject.assistedinject.Assisted;

import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;

@Global
@Injectable
public interface CommandProcessorFactory {
	public CommandProcessor create(@Assisted("parent") CommandDefinition parent, @Assisted("definition") CommandDefinition definition);
}
