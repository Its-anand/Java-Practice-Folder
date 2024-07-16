package com.practice;

public class NewSwitch {
	private String day;
	public void setDay(String value) {
		this.day = value;
	}
	public void newSwitch() {
		switch(day) {
		case "Sunday" -> System.out.println("8pm");
		default -> System.out.println("6pm");
		}
	}

}
