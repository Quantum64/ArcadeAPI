package co.q64.arcade.foundation.api.objects.general;

import co.q64.arcade.foundation.api.database.objects.GeneralData;

public interface OptionData extends GeneralData {
	public String getName();

	public String getValue();

	public void setName(String name);

	public void setValue(String value);
}