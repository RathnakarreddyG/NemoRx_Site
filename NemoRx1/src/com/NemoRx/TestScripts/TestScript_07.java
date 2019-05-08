package com.NemoRx.TestScripts;

import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.NemoRx.lib.General;
import com.NemoRx.lib.Global;

public class TestScript_07 extends General {
	
	@Test
	public static void AlertWindowVerification() throws Exception{
		Descriptions object = new Descriptions();
		Properties properties = object.getProperty();
		System.out.println(properties.getProperty("TestScript_07"));Reporter.log(properties.getProperty("TestScript_07"));
		 Global.OpenBrowser();
		 Global.LoginInto("ratnakarg@pronixinc.com", "Rathna@299299");
		 General.AlertBell();
		 Thread.sleep(3000);
		 General.sideMenu();
		 Global.Logout();
		driver.close();
	}

}
