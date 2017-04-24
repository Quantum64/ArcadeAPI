package co.q64.arcade.foundation.api.database;

import java.util.Optional;

import co.q64.arcade.foundation.api.annotation.inject.Noinject;
import co.q64.arcade.foundation.api.database.objects.GeneralData;

@Noinject(reason = Noinject.IMPLEMENT)
@FunctionalInterface
public interface GeneralDataSingleScope<T extends GeneralData> {
	public void dataAction(Optional<T> t, GeneralDataController controller);
}
