package com.NemoRx.TestScripts;

import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.NemoRx.lib.General;
import com.NemoRx.lib.General1;
import com.NemoRx.lib.Global;

public class TestScript_06 extends General1 {

	@Test
	public static void AddPatientAndMedication() throws Exception{
		Descriptions object = new Descriptions();
		Properties properties = object.getProperty();
		System.out.println(properties.getProperty("TestScript_06"));Reporter.log(properties.getProperty("TestScript_06"));
		Global.OpenBrowser();
		Global.LoginInto("ratnakarg@pronixinc.com", "Rathna@299299");
		General1.AddingPatient();
		System.out.println("Search for added patient");Reporter.log("Search for added patient");
		General.AddMedication("ka");
		General.UnderSummaryMedicationsSendEditDelete();
		General.AddAllerigies("ka");
		General.UnderSummaryAllerigiesEditDelete();
		Thread.sleep(3000);
		General.sideMenu();
		Global.Logout();
		driver.close();
		
	}
	
}
