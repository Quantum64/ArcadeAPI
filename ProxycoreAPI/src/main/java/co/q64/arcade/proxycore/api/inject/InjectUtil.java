package co.q64.arcade.proxycore.api.inject;

import net.md_5.bungee.api.plugin.Listener;
import co.q64.arcade.base.api.inject.BaseInjectUtil;
import co.q64.arcade.proxycore.api.command.CommandDefinition;

import com.google.inject.Binder;
import com.google.inject.multibindings.Multibinder;

public abstract class InjectUtil extends BaseInjectUtil {
	public static Multibinder<CommandDefinition> getCommandBinder(Binder binder) {
		return Multibinder.newSetBinder(binder, CommandDefinition.class);
	}

	public static Multibinder<Listener> getListenerBinder(Binder binder) {
		return Multibinder.newSetBinder(binder, Listener.class);
	}
}
