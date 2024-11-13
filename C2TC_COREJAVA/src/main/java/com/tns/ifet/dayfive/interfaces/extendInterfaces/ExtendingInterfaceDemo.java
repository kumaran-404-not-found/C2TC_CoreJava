package com.tns.ifet.dayfive.interfaces.extendInterfaces;

public class ExtendingInterfaceDemo implements ChildInterface{
	public void print() {
		System.out.println("print Method");
	}
	public void show() {
		System.out.println("Show Method");
	}
	
	public static void main(String[] args) {
		ExtendingInterfaceDemo a = new ExtendingInterfaceDemo();
		a.print();
		a.show();
	}
}
