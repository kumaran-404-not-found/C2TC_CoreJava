package com.tns.ifet.dayfive.interfaces.InstanceOfInterface;

public class PhoneFactory {
	public static Phone createPhone(String company) {
		if (company.equalsIgnoreCase("jio"))
			return new Jio();
		else if (company.equalsIgnoreCase("samsung")) 
			return new Samsung();
		return null;
		}
}
