package com.practice;
//Money and item example

public class TightCoupling {
	public class Money{
		Item obj = new Item();
		public void HaveMoney() {
			obj.Buy();
		}
	}
	public class Item{
		public void Buy() {
			System.out.println("Buy when have money");
		}
	}
}
