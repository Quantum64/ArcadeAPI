package co.q64.arcade.core.api.database.objects;

import co.q64.arcade.core.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.DATA)
public interface GeneralData {
	public String getPrimary();

	public void setPrimary(String primary);
}
