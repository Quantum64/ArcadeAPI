package co.q64.arcade.core.api.database;

import java.util.Optional;

import co.q64.arcade.core.api.database.objects.GeneralData;
import co.q64.arcade.foundation.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.IMPLEMENT)
@FunctionalInterface
public interface GeneralDataSingleScope<T extends GeneralData> {
	public void dataAction(Optional<T> t, GeneralDataController controller);
}
