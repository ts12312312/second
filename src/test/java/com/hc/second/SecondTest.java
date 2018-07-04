package com.hc.second;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecondTest {

	@Test
	public void testSayHello() {
		Second second = new Second();
		String ret = second.sayHello("cow");
		System.out.println(ret);
		assertEquals("Hello cow and ok", ret);
	}

}
