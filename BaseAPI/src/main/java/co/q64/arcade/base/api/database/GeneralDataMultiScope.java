package co.q64.arcade.base.api.database;

import java.util.List;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.database.objects.GeneralData;

@Noinject(reason = Noinject.IMPLEMENT)
@FunctionalInterface
public interface GeneralDataMultiScope<T extends GeneralData> {
	public void dataAction(List<T> t, GeneralDataController controller);
}
