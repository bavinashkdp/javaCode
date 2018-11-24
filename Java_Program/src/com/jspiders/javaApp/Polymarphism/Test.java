package com.jspiders.javaApp.Polymarphism;

import com.jspiders.javaApp.Inheritance.Phone;
import com.jspiders.javaApp.Inheritance.Redmi;

public class Test {

	public static void main(String[] args) 
	{
		/*Phone phone=new Redmi();;
		phone.makeCall();
		phone.sendSms();
		*/
		
	
		
		Driver driver=new Driver();
		driver.drive(new Pulser());
	}

}
