package co.q64.arcade.core.api.objects.item.types;

public enum Obtained {
	
	//formatter:off
	
	SPAWNED_COMMANDS("Spawned using commands"), 
	SPAWNED_OTHER("Spawned"), 
	PURCHASED("Purchased"), 
	TRADED("Traded"), 
	CONVERTED("Converted from Legacy Cosmetics"), 
	UNBOXED("Found in a crate"), 
	DROPPED("Found randomly"), 
	CRAFTED("Made through crafting"),
	PROMOTION("Received in a promotional offer"),
	REWARD("Recieved from the rewards crate"),
	MARKET("Received from market"),
	GIFT("Gift from a kind person");
	
	//formatter:on

	private String title;

	private Obtained(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
}
