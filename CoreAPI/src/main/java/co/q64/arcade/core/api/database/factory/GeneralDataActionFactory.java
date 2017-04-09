package co.q64.arcade.core.api.database.factory;

import co.q64.arcade.core.api.annotation.inject.Global;
import co.q64.arcade.core.api.annotation.inject.Injectable;
import co.q64.arcade.core.api.database.GeneralDataAction;
import co.q64.arcade.core.api.database.GeneralDataMultiScope;
import co.q64.arcade.core.api.database.GeneralDataSingleScope;
import co.q64.arcade.core.api.database.objects.GeneralData;

import com.google.inject.assistedinject.Assisted;

@Injectable
@Global
public interface GeneralDataActionFactory<T extends GeneralData> {
	public GeneralDataAction<T> create(@Assisted("key") String key, @Assisted("value") String value, GeneralDataMultiScope<T> exec, Class<T> clazz);

	public GeneralDataAction<T> create(String value, GeneralDataMultiScope<T> exec, Class<T> clazz);
	
	public GeneralDataAction<T> create(GeneralDataMultiScope<T> exec, Class<T> clazz);

	public GeneralDataAction<T> create(@Assisted("key") String key, @Assisted("value") String value, GeneralDataSingleScope<T> exec, Class<T> clazz);

	public GeneralDataAction<T> create(String value, GeneralDataSingleScope<T> exec, Class<T> clazz);
	
	public GeneralDataAction<T> create(GeneralDataSingleScope<T> exec, Class<T> clazz);
}
