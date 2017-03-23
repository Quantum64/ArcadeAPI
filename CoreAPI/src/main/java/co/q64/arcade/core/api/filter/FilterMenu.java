package co.q64.arcade.core.api.filter;

import co.q64.arcade.core.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.DATA)
public enum FilterMenu {
	TYPE("Filter by Type"), QUALITY("Filter by Quality");

	private String invName;

	private FilterMenu(String invName) {
		this.invName = invName;
	}

	public String getInvName() {
		return invName;
	}
}