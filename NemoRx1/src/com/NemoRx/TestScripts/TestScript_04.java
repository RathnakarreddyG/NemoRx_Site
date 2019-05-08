package com.NemoRx.TestScripts;



import org.testng.annotations.Test;

import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.DataProvider;


import com.NemoRx.lib.General;
import com.NemoRx.lib.Global;

public class TestScript_04 extends General{

	@BeforeClass
	public static void Open() throws Exception {
		Descriptions object = new Descriptions();
		Properties properties = object.getProperty();
		System.out.println(properties.getProperty("TestScript_04"));Reporter.log(properties.getProperty("TestScript_04"));
		Global.OpenBrowser();
	}
	@AfterClass
	public static void Close(){
		driver.quit();
	}

	@Test(priority = 4,dataProvider = "getdata")
	public static void SearchPatientAddMedication(String Usernamee,String password1 ) throws Exception {
		
		
		Global.LoginInto(Usernamee, password1);
		General.SearchPatient("YBLKXSZI");//patient name
		General.AddMedication("va");//Drug
		General.AddAllerigies("ka");
		
	}
	@DataProvider
	public Object[][] getdata(){
		Object[][] credentials = {
				{"ratnakarg@pronixinc.com","Rathna@299299"}};
		
		System.out.println("");
		return credentials;
		
	}
	
	
	
}
