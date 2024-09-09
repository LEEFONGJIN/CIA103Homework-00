package hw7;

import java.io.Serializable;

public class Dog extends Animal implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
