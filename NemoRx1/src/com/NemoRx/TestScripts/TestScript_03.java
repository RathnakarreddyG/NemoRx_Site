package com.NemoRx.TestScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.NemoRx.lib.General;
import com.NemoRx.lib.Global;

public class TestScript_03 {
	
	@BeforeTest
	public static void Open() throws Exception {
		Global.OpenBrowser();
	}

	@Test(dataProvider = "getdata")
	public static void VerifyingLinksFromSideMenu(String Usernamee,String password1 ) throws Exception {
		
		
		Global.LoginInto(Usernamee, password1);
		General.sideMenu();
		General.AuditItems();
		General.sideMenu();
		General.Grant_requests();
		General.sideMenu();
		General.ProfileLink();
		General.sideMenu();
		General.ViewExportSignedPriscriptions();
		General.sideMenu();
		General.WorkingHours();
		General.sideMenu();
		General.Logout();
		Thread.sleep(7000);
		
		
	}
	@DataProvider
	public Object[][] getdata(){
		Object[][] credentials = {
				{"ratnakarg@pronixinc.com","W&lcome@2019"},
				{"phani@pronixinc.com","W&lcome@2019"},
				{"webtest39@nemohealth.com","Like2Bike!"}};
		return credentials;
	}

}
