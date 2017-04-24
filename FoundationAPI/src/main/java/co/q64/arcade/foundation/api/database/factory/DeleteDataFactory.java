package co.q64.arcade.foundation.api.database.factory;

import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;
import co.q64.arcade.foundation.api.database.QueryExecutor;
import co.q64.arcade.foundation.api.database.objects.DeleteData;
import co.q64.arcade.foundation.api.database.objects.GeneralData;

import com.google.inject.assistedinject.Assisted;

@Injectable
@Global
public interface DeleteDataFactory {
	public DeleteData create(QueryExecutor runner, @Assisted("key") String key, @Assisted("value") String value, @Assisted("tableName") String tableName, Class<? extends GeneralData> clazz);
}
