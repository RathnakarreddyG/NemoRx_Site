package com.NemoRx.TestScripts;

import org.testng.annotations.Test;

import com.NemoRx.lib.General;
import com.NemoRx.lib.General1;
import com.NemoRx.lib.Global;

public class TestScript_08 extends General1{

	@Test(priority = 1,groups = "Verification")
	public static void MedicationsButtonsVerificationOnPatientChart() throws Exception{
		Global.OpenBrowser();
		Global.LoginInto("webtest39@nemohealth.com", "Like2Bike!");
		General.SearchPatient("rathnaa");
		//General.AddMedication("ka");
		General.UnderSummaryMedicationsSendEditDelete();
		General.sideMenu();
		Global.Logout();
		driver.close();
	}
	@Test(priority = 2,groups = "Verification")
	public static void AllergiesButtonsVerificationOnPatientChart() throws Exception{
		Global.OpenBrowser();
		Global.LoginInto("webtest39@nemohealth.com", "Like2Bike!");
		General.SearchPatient("rathnaa");
		General.UnderSummaryAllerigiesEditDelete();
		General.sideMenu();
		Global.Logout();
		driver.close();
	}
}
