package com.practice;

public class StaticNonStaticBlock {
	//Static Class
	public class StaticClass{
		static int a;
		static { 
			// static method, block can only access static variable
			a=10;
		}
	}
	//Non Static Class
	class NonStaticClass{
		int a;
		{
			a=10;
		}
	}
}
