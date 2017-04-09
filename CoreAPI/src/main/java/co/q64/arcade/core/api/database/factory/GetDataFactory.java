package co.q64.arcade.core.api.database.factory;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import co.q64.arcade.core.api.annotation.inject.Global;
import co.q64.arcade.core.api.annotation.inject.Injectable;
import co.q64.arcade.core.api.database.QueryExecutor;
import co.q64.arcade.core.api.database.objects.GeneralData;
import co.q64.arcade.core.api.database.objects.GetData;

import com.google.inject.assistedinject.Assisted;

@Injectable
@Global
public interface GetDataFactory {
	public GetData create(QueryExecutor runner, @Assisted("key") String key, @Assisted("value") String value, @Assisted("tableName") String tableName, BeanListHandler<? extends GeneralData> definedHandler, Class<? extends GeneralData> bean);
}
