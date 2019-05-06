package com.NemoRx.TestScripts;



import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.DataProvider;


import com.NemoRx.lib.General;
import com.NemoRx.lib.Global;

public class TestScript_01 extends Global{
	@BeforeClass
	public static void Open() throws Exception {
		Global.OpenBrowser();
	}
    @AfterClass
    public static void Close(){
    	driver.quit();
    }
    
	@Test(priority = 1,dataProvider = "getdata")
	public static void LoginAndLogout(String Usernamee,String password1 ) throws Exception {
		
		
		Global.LoginInto(Usernamee, password1);
		General.sideMenu();
		Global.Logout();
		Thread.sleep(7000);
		
		
	}
	@DataProvider
	public Object[][] getdata(){
		Object[][] credentials = {{"ratnakarg@pronixinc.com","Rathna@299299"},{"phani@pronixinc.com","W&lcome@2019"}};
		return credentials;
	}
}
