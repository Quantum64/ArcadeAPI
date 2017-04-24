package co.q64.arcade.core.api.managers;

import java.text.Format;
import java.util.List;
import java.util.concurrent.ExecutorService;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.objects.log.RecordedEvent;
import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;
import co.q64.arcade.foundation.api.managers.Manager;

@Injectable
@Global
public interface RecordManager extends Manager {
	public void addRecord(Player p, RecordedEvent e);

	public List<RecordedEvent> getEvents(Player p);

	public Format getTimeFormat();

	public ExecutorService getThreadPool();
}