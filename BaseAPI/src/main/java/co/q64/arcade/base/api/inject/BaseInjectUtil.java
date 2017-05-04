package co.q64.arcade.base.api.inject;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.annotation.inject.Universal;
import co.q64.arcade.base.api.command.BaseCommandDefinition;
import co.q64.arcade.base.api.database.objects.GeneralData;
import co.q64.arcade.base.api.database.objects.PlayerData;
import co.q64.arcade.base.api.executor.Executor;
import co.q64.arcade.base.api.perm.Group;
import co.q64.arcade.base.api.perm.PermissionLink;

import com.google.inject.Binder;
import com.google.inject.TypeLiteral;
import com.google.inject.multibindings.Multibinder;

@Noinject
@Universal
public abstract class BaseInjectUtil {
	public static Multibinder<Class<? extends Executor<?>>> getExecutorBinder(Binder binder) {
		return Multibinder.newSetBinder(binder, new TypeLiteral<Class<? extends Executor<?>>>() {});
	}

	public static Multibinder<Class<? extends PlayerData>> getPlayerDataBinder(Binder binder) {
		return Multibinder.newSetBinder(binder, new TypeLiteral<Class<? extends PlayerData>>() {});
	}

	public static Multibinder<Class<? extends GeneralData>> getGeneralDataBinder(Binder binder) {
		return Multibinder.newSetBinder(binder, new TypeLiteral<Class<? extends GeneralData>>() {});
	}

	public static Multibinder<PermissionLink> getPermissionLinkBinder(Binder binder) {
		return Multibinder.newSetBinder(binder, PermissionLink.class);
	}
	
	public static Multibinder<BaseCommandDefinition> getBaseCommandBinder(Binder binder) {
		return Multibinder.newSetBinder(binder, BaseCommandDefinition.class);
	}
	
	public static Multibinder<Class<? extends Group>> getGroupBinder(Binder binder) {
		return Multibinder.newSetBinder(binder, new TypeLiteral<Class<? extends Group>>() {});
	}
}
