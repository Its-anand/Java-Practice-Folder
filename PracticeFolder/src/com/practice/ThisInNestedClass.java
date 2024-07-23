package com.practice;
/*
 * In order to access the a variable of ThisInNestedClass we will write ThisInNestedClass.this.a;
 * In order to access the a variable of Mclass we will write Mclass.this.a;
 * In order to access the a variable of Iclass we will write Iclass.this.a;
 */
public class ThisInNestedClass {
	public int a=10;
	public class Mclass{
		public int a = 20;
		public class Iclass{
			public int a =30;
			public void access() {
				System.out.print(Mclass.this.a);
			}
		}
	}
}