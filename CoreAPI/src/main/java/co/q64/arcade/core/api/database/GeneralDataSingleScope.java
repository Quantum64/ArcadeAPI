package co.q64.arcade.core.api.database;

import java.util.Optional;

import co.q64.arcade.core.api.annotation.inject.Noinject;
import co.q64.arcade.core.api.database.objects.GeneralData;

@Noinject(reason = Noinject.IMPLEMENT)
@FunctionalInterface
public interface GeneralDataSingleScope<T extends GeneralData> {
	public boolean dataAction(Optional<T> t, GeneralDataController controller);
}