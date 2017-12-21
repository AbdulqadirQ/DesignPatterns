package com.abdulqadirsprojects.factorypattern;

/*
 FACTORY PATTERN:
 
  	- consists of creating a factory class that has one or more factory methods
	- used when wanting to create lots of objects with the same inteface, or having the same parent
	- used when creating an object is complex (e.g. lots of constructor parameters)
	- used when it's possible to simplify choice of objects
 */

public class App {

	public static void main(String[] args) {
		
		Animal animal = AnimalFactory.createAnimal(AnimalFactory.CAT);
		
		animal.speak();

	}

}
