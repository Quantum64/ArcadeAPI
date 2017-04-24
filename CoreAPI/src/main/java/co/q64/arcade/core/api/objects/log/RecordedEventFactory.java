package co.q64.arcade.core.api.objects.log;

import com.google.inject.assistedinject.Assisted;

import co.q64.arcade.foundation.api.annotation.inject.Injectable;

@Injectable
public interface RecordedEventFactory {
	public RecordedEvent create(@Assisted("type") String type, @Assisted("info") String info, @Assisted("details") String details);

	public RecordedEvent create(@Assisted("type") String type, @Assisted("info") String info, @Assisted("details") String details, long time);

	public RecordedEvent create(String data);
}
