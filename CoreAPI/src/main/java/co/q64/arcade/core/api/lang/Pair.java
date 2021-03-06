package co.q64.arcade.core.api.lang;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
public class Pair<X, Y> {
	private final X x;
	private final Y y;

	public Pair(X x, Y y) {
		this.x = x;
		this.y = y;
	}

	public X getX() {
		return x;
	}

	public Y getY() {
		return y;
	}
}