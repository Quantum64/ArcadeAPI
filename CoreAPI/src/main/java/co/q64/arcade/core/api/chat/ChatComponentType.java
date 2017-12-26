package co.q64.arcade.core.api.chat;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.annotation.inject.Universal;

@Universal
@Noinject(reason = Noinject.STATIC)
public enum ChatComponentType {
	PREFIX, SUFFIX
}
