package com.allan.teamcity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeamCityCheckTest {
	private TeamCityCheck teamCityCheck;

	@Before
	public void before() {
		teamCityCheck = new TeamCityCheck("hello");
	}

	@Test
	public void sayHelloTest() {
		Assert.assertEquals("hello", teamCityCheck.sayHello());
	}

	@Test
	public void sayHello2Test() {
		Assert.assertEquals("hellotest", teamCityCheck.sayHello2());
	}
}
