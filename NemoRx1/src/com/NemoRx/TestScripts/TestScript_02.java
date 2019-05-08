package com.NemoRx.TestScripts;

import org.testng.annotations.Test;

import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.DataProvider;


import com.NemoRx.lib.General;
import com.NemoRx.lib.Global;

public class TestScript_02 extends General {

	@BeforeClass
	public static void Open() throws Exception {
		Descriptions object = new Descriptions();
		Properties properties = object.getProperty();
		System.out.println(properties.getProperty("TestScript_02"));Reporter.log(properties.getProperty("TestScript_02"));
		Global.OpenBrowser();
	}
	@AfterClass
	public static void Close(){
		driver.quit();
	}

	@Test(priority = 2,dataProvider = "getdata")
	public static void AddingWorkHour_deletingWorkHour(String Usernamee,String password1 ) throws Exception {
		
		
		Global.LoginInto(Usernamee, password1);
		General.sideMenu();
		General.AddingWorkingHoursAndDeletingWorkingHours();
		General.sideMenu();
		General.Logout();
		Thread.sleep(7000);
		
	}
	@DataProvider
	public Object[][] getdata(){
		Object[][] credentials = {
				{"ratnakarg@pronixinc.com","Rathna@299299"},
				{"phani@pronixinc.com","W&lcome@2019"},
				{"webtest39@nemohealth.com","Like2Bike!"}};
		System.out.println("");
		return credentials;
		
	}
	
	
}
