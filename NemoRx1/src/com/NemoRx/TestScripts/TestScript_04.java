package com.NemoRx.TestScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.NemoRx.lib.General;
import com.NemoRx.lib.Global;

public class TestScript_04 {

	@BeforeTest
	public static void Open() throws Exception {
		Global.OpenBrowser();
	}

	@Test(dataProvider = "getdata")
	public static void SearchPatientAddMedication(String Usernamee,String password1 ) throws Exception {
		
		
		Global.LoginInto(Usernamee, password1);
		General.SearchPatient("raju");//patient name
		General.AddMedication("ha");//Drug
		
	}
	@DataProvider
	public Object[][] getdata(){
		Object[][] credentials = {
				{"ratnakarg@pronixinc.com","W&lcome@2019"}};
		
		System.out.println("");
		return credentials;
		
	}
	
	
	
}
