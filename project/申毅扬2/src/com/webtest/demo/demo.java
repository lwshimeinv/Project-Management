package com.webtest.demo;

import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class demo extends BaseTest{
	@Test
	public void demo1() {
		Assert.assertEquals(1, 2);
	}
	@Test
	public void demo2() {
		Assert.assertEquals(2, 2);
	}
	@Test
	public void demo3() {
		Assert.assertEquals(3, 2);
	}
	@Test
	public void demo4() {
		Assert.assertEquals(1, 1);
	}
	@Test
	public void demo5() {
		Assert.assertEquals(3, 3);
	}
}