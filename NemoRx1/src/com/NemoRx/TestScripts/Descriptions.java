package com.NemoRx.TestScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Descriptions {
	public Properties getProperty() throws IOException{
		Properties obj = new Properties();
	    obj.load(new FileInputStream("Data.properties"));
	    return obj;

}
	
	public static void main(String args[]) throws Exception{
		 
		Descriptions obj = new Descriptions();
		Properties property = obj.getProperty();
		System.out.println(property.getProperty("TestScript_01"));
		
	}
	
}