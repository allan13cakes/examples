package com.allan.teamcity;

public class TeamCityCheck {
	private String message;

	public TeamCityCheck(String message) {
		this.message = message;
	}

	public String sayHello() {
		return message;
	}
}
