package co.q64.arcade.base.api.database.factory;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.database.QueryExecutor;
import co.q64.arcade.base.api.database.objects.GeneralData;
import co.q64.arcade.base.api.database.objects.GetData;

import com.google.inject.assistedinject.Assisted;

@Injectable
@Global
public interface GetDataFactory {
	public GetData create(QueryExecutor runner, @Assisted("key") String key, @Assisted("value") String value, @Assisted("tableName") String tableName, Class<? extends GeneralData> bean);
}
