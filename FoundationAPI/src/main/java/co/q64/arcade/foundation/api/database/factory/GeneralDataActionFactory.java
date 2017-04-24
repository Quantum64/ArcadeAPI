package co.q64.arcade.foundation.api.database.factory;

import com.google.inject.assistedinject.Assisted;

import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;
import co.q64.arcade.foundation.api.database.GeneralDataAction;
import co.q64.arcade.foundation.api.database.GeneralDataMultiScope;
import co.q64.arcade.foundation.api.database.GeneralDataSingleScope;
import co.q64.arcade.foundation.api.database.objects.GeneralData;

@Injectable
@Global
public interface GeneralDataActionFactory {
	public <T extends GeneralData> GeneralDataAction<T> create(@Assisted("key") String key, @Assisted("value") String value, GeneralDataMultiScope<T> exec, Class<T> clazz);

	public <T extends GeneralData> GeneralDataAction<T> create(String value, GeneralDataMultiScope<T> exec, Class<T> clazz);

	public <T extends GeneralData> GeneralDataAction<T> create(GeneralDataMultiScope<T> exec, Class<T> clazz);

	public <T extends GeneralData> GeneralDataAction<T> create(@Assisted("key") String key, @Assisted("value") String value, GeneralDataSingleScope<T> exec, Class<T> clazz);

	public <T extends GeneralData> GeneralDataAction<T> create(String value, GeneralDataSingleScope<T> exec, Class<T> clazz);

	public <T extends GeneralData> GeneralDataAction<T> create(GeneralDataSingleScope<T> exec, Class<T> clazz);
}
