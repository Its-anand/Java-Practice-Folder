// Super Keywork in java


package com.practice;
class Animal{
    public void sound(){
        System.out.println("ANIMAL MAKE SOUND");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        super.sound();
        System.out.println("DOG SOUND");
    }
}
public class SuperKeyword{
    public static void main(String[] args) {
        Dog bullDog = new Dog();
        bullDog.sound();
    }
}

