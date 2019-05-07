package com.NemoRx.TestScripts;

import org.testng.annotations.Test;

import com.NemoRx.lib.General;
import com.NemoRx.lib.General1;
import com.NemoRx.lib.Global;

public class TestScript_06 extends General1 {

	@Test
	public static void AddPatientAndMedication() throws Exception{
		Global.OpenBrowser();
		Global.LoginInto("ratnakarg@pronixinc.com", "Rathna@299299");
		General1.AddingPatient();
		General.AddMedication("ka");
		General.AddAllerigies("ka");
		Thread.sleep(3000);
		General.sideMenu();
		Global.Logout();
		driver.close();
		
	}
	
}
