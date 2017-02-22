package co.q64.arcade.api;

public interface ArcadeInit {
	public void onEnable();

	public void onDisable();
	
	public AbstractArcadeModule require();
}
