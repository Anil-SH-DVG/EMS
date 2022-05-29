package com.sdet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewAppTest {
	
	@Test
	public void testNegativeCase() {
		NewApp test=new NewApp();
		Assert.assertEquals(0, test.userLogin("abc", "abc1234"));
	}
	
	@Test
	public void testPositiveCase() {
		NewApp test=new NewApp();
		Assert.assertEquals(1, test.userLogin("abc", "abc@123"));
	}

}
