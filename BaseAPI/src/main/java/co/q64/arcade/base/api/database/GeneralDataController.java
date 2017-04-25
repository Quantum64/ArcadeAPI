package co.q64.arcade.base.api.database;

import co.q64.arcade.base.api.database.objects.GeneralData;

public interface GeneralDataController {
	public void update(String value);

	public void update(String key, String value);

	public void update(GeneralData data, String value);

	public void update(GeneralData data, String key, String value);

	public void delete(String value);

	public void delete(String key, String value);
}
