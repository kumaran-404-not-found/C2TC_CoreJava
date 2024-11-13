package com.tns.ifet.dayfive.interfaces.InstanceOfInterface;

public class Executor {
	public static void main(String[] args) {
		Phone p1=PhoneFactory.createPhone("jio");
		p1.call();
		p1.message();
		Phone p2=PhoneFactory.createPhone("samsung");
		p2.call();
		p2.message();
	}
}
