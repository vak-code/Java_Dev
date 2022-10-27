package com.example.demo.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS)
@Component
public class WishList {

	private int wishId;
	private String wishStr;

	public int getWishId() {
		return wishId;
	}

	public void setWishId(int wishId) {
		this.wishId = wishId;
	}

	public String getWishStr() {
		return wishStr;
	}

	public void setWishStr(String wishStr) {
		this.wishStr = wishStr;
	}

}
