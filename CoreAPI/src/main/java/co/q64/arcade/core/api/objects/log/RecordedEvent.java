package co.q64.arcade.core.api.objects.log;

import co.q64.arcade.core.api.annotation.Noinject;

@Noinject(reason = Noinject.DATA)
public interface RecordedEvent {
	public String getType();

	public String getInfo();

	public String getDetails();

	public long getTime();
}