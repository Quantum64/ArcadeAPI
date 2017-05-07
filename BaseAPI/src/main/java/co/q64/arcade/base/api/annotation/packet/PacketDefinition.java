package co.q64.arcade.base.api.annotation.packet;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import co.q64.arcade.base.api.net.Frame;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface PacketDefinition {
	public String value();
	
	public Class<? extends Frame> request();
	
	public Class<? extends Frame> response();
}
