package co.q64.arcade.core.api.database.factory;

import co.q64.arcade.core.api.annotation.inject.Global;
import co.q64.arcade.core.api.annotation.inject.Injectable;
import co.q64.arcade.core.api.database.QueryExecutor;
import co.q64.arcade.core.api.database.objects.GeneralData;
import co.q64.arcade.core.api.database.objects.UpdateData;

import com.google.inject.assistedinject.Assisted;

@Injectable
@Global
public interface UpdateDataFactory {
	public UpdateData create(QueryExecutor runner, GeneralData data, @Assisted("tableName") String tableName, @Assisted("key") String key, @Assisted("value") String value);
}
