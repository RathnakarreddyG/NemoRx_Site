package com.NemoRx.TestScripts;



import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.DataProvider;


import com.NemoRx.lib.General;
import com.NemoRx.lib.Global;

public class TestScript_04 extends General{

	@BeforeClass
	public static void Open() throws Exception {
		Global.OpenBrowser();
	}
	@AfterClass
	public static void Close(){
		driver.quit();
	}

	@Test(priority = 4,dataProvider = "getdata")
	public static void SearchPatientAddMedication(String Usernamee,String password1 ) throws Exception {
		
		
		Global.LoginInto(Usernamee, password1);
		General.SearchPatient("rathnaa");//patient name
		General.AddMedication("ra");//Drug
		
	}
	@DataProvider
	public Object[][] getdata(){
		Object[][] credentials = {
				{"ratnakarg@pronixinc.com","Rathna@299299"}};
		
		System.out.println("");
		return credentials;
		
	}
	
	
	
}
