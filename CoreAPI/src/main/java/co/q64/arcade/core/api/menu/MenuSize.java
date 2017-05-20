package co.q64.arcade.core.api.menu;

public enum MenuSize {
	ROWS_1(9), ROWS_2(18), ROWS_3(27), ROWS_4(36), ROWS_5(45), ROWS_6(54);

	private int slots;

	private MenuSize(int slots) {
		this.slots = slots;
	}

	public int getSlots() {
		return slots;
	}
}
