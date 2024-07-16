package com.practice;

public class ThisInNestedClass {
	public int a=10;
	public class Mclass{
		public int a = 20;
		public class Iclass{
			public int a =30;
			public void access() {
				System.out.print(ThisInNestedClass.this.a);
			}
		}
	}
}