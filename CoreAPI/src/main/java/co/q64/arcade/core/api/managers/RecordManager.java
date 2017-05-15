package co.q64.arcade.core.api.managers;

import java.text.Format;
import java.util.List;
import java.util.concurrent.ExecutorService;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.container.BasePlayer;
import co.q64.arcade.base.api.managers.Manager;
import co.q64.arcade.base.api.util.message.MessageReceiver;
import co.q64.arcade.core.api.objects.log.RecordedEvent;

@Injectable
@Global
public interface RecordManager extends Manager {
	public void addRecord(BasePlayer p, RecordedEvent e);

	public List<RecordedEvent> getEvents(BasePlayer p);
	
	public List<RecordedEvent> getEvents(MessageReceiver cs, String name);

	public Format getTimeFormat();

	public ExecutorService getThreadPool();
}