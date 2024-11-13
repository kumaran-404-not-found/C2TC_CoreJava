package com.tns.ifet.dayfive.interfaces.functionalInterfaces;

public class FunctionalInterfaceMain {
	public static void main(String[] args) {
		GreetClass g = new GreetClass();
		System.out.println(g.greet());
		
		GreetInterface g1 = ()->{return "hi this is Interface Implementation";};
		System.out.println(g1.greet());
	}
}
