package co.q64.arcade.core.api.inject;

import org.bukkit.event.Listener;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.annotation.inject.Universal;
import co.q64.arcade.base.api.inject.BaseInjectUtil;
import co.q64.arcade.core.api.command.CommandDefinition;
import co.q64.arcade.core.api.command.commands.item.spawn.ItemSpawnDefinition;
import co.q64.arcade.core.api.cosmetics.CosmeticComponent;
import co.q64.arcade.core.api.craft.CraftExecutor;
import co.q64.arcade.core.api.craft.CraftTemplate;
import co.q64.arcade.core.api.objects.item.ItemRegistrar;
import co.q64.arcade.core.api.quality.Quality;
import co.q64.arcade.core.api.task.ArcadeTask;

import com.google.inject.Binder;
import com.google.inject.multibindings.Multibinder;

/**
 * Utilities for binding common core classes
 * @author Dylan
 *
 */
@Noinject
@Universal
public abstract class InjectUtil extends BaseInjectUtil {
	public static Multibinder<CommandDefinition> getCommandBinder(Binder binder) {
		return Multibinder.newSetBinder(binder, CommandDefinition.class);
	}

	public static Multibinder<Listener> getListenerBinder(Binder binder) {
		return Multibinder.newSetBinder(binder, Listener.class);
	}

	public static Multibinder<ArcadeTask> getTaskBinder(Binder binder) {
		return Multibinder.newSetBinder(binder, ArcadeTask.class);
	}

	public static Multibinder<CosmeticComponent> getCosmeticsBinder(Binder binder) {
		return Multibinder.newSetBinder(binder, CosmeticComponent.class);
	}

	public static Multibinder<CraftExecutor> getCraftExecutorBinder(Binder binder) {
		return Multibinder.newSetBinder(binder, CraftExecutor.class);
	}

	public static Multibinder<CraftTemplate> getCraftTemplateBinder(Binder binder) {
		return Multibinder.newSetBinder(binder, CraftTemplate.class);
	}

	public static Multibinder<Quality> getQualityBinder(Binder binder) {
		return Multibinder.newSetBinder(binder, Quality.class);
	}

	public static Multibinder<ItemRegistrar> getItemBinder(Binder binder) {
		return Multibinder.newSetBinder(binder, ItemRegistrar.class);
	}

	public static Multibinder<ItemSpawnDefinition> getItemSpawnDefinitionBinder(Binder binder) {
		return Multibinder.newSetBinder(binder, ItemSpawnDefinition.class);
	}
}
