package co.q64.arcade.core.api.objects.item.core;

import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.DATA)
public interface FieldStack {
	public void finalizeStack();

	public void setValue(String key, String value);

	public String getValue(String key);

	public Set<Entry<String, Supplier<String>>> getValues();

	public void push(String name, Supplier<String> getter, Consumer<String> setter);
}
