package com.abdulqadirsprojects.factorypattern;

// imagine that this class requires lots of configuration before use, e.g. via constructor parameters 
public class Cat implements Animal {

	@Override
	public void speak() {
		System.out.println("Meow");

	}

}
