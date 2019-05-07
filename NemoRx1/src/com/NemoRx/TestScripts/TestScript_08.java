package com.NemoRx.TestScripts;

import org.testng.annotations.Test;

import com.NemoRx.lib.General;
import com.NemoRx.lib.Global;

public class TestScript_08 {

	@Test
	public static void MedicationsButtonsVerificationOnPatientChart() throws Exception{
		Global.OpenBrowser();
		Global.LoginInto("webtest39@nemohealth.com", "Like2Bike!");
		General.SearchPatient("rathnaa");
		General.AddMedication("ka");
		General.UnderSummaryMedicationsSendEditDelete();	
	}
	
}
