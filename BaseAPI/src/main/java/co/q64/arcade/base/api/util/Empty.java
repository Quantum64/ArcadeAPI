package co.q64.arcade.base.api.util;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.annotation.inject.Universal;

@Noinject
@Universal
public interface Empty {
	public static final String STRING = new String();
}
