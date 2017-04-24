package co.q64.arcade.core.api.database.factory;

import com.google.inject.assistedinject.Assisted;

import co.q64.arcade.core.api.database.QueryExecutor;
import co.q64.arcade.core.api.database.objects.GeneralData;
import co.q64.arcade.core.api.database.objects.UpdateData;
import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;

@Injectable
@Global
public interface UpdateDataFactory {
	public UpdateData create(QueryExecutor runner, GeneralData data, @Assisted("tableName") String tableName, @Assisted("key") String key, @Assisted("value") String value);
}
