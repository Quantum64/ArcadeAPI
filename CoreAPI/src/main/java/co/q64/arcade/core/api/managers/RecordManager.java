package co.q64.arcade.core.api.managers;

import java.text.Format;
import java.util.List;
import java.util.concurrent.ExecutorService;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;
import co.q64.arcade.core.api.objects.log.RecordedEvent;

@Injectable
@Global
public interface RecordManager extends Manager {
	public void addRecord(Player p, RecordedEvent e);

	public List<RecordedEvent> getEvents(Player p);

	public Format getTimeFormat();

	public ExecutorService getThreadPool();
}