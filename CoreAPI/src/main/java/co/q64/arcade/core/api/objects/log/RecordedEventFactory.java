package co.q64.arcade.core.api.objects.log;

import co.q64.arcade.base.api.annotation.inject.Injectable;

import com.google.inject.assistedinject.Assisted;

@Injectable
public interface RecordedEventFactory {
	public RecordedEvent create(@Assisted("type") String type, @Assisted("info") String info, @Assisted("details") String details);

	public RecordedEvent create(@Assisted("type") String type, @Assisted("info") String info, @Assisted("details") String details, long time);

	public RecordedEvent create(String data);
}
