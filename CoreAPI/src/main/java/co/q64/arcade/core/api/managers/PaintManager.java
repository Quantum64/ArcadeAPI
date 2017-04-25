package co.q64.arcade.core.api.managers;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.managers.Manager;
import co.q64.arcade.core.api.paint.PaintType;
import co.q64.arcade.core.api.paint.UnusualPaint;

@Injectable
@Global
public interface PaintManager extends Manager {
	public void registerDefault();

	public UnusualPaint paintFromName(String name, PaintType type);

	public UnusualPaint paintFromName(String name);

	public void clearPaints(PaintType type);

	public void addPaint(PaintType type, UnusualPaint paint);
}