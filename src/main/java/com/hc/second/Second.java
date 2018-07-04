package com.hc.second;

import com.hc.first.First;

public class Second {
	public String sayHello(String name) {
		String ret = null;
		First first = new First();
		ret = first.sayHello(name) + " and ok";
		return ret;
	}
}
