package co.q64.arcade.core.api.database;

import java.util.List;

import co.q64.arcade.core.api.database.objects.GeneralData;
import co.q64.arcade.foundation.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.IMPLEMENT)
@FunctionalInterface
public interface GeneralDataMultiScope<T extends GeneralData> {
	public void dataAction(List<T> t, GeneralDataController controller);
}
