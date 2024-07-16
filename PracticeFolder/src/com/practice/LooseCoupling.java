package com.practice;
interface Animal{
	public void voice();
}
public class LooseCoupling {
	 public class Dog implements Animal{
		public void voice(){
			 System.out.println("Bhu..");
		}
	 }
	 public class Cat implements Animal{
		 public void voice() {
			 System.out.println("Meuw");
		 }
	 }
}
