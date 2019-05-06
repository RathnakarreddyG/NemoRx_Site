package com.NemoRx.TestScripts;

import org.testng.annotations.Test;

import com.NemoRx.lib.General;
import com.NemoRx.lib.Global;

public class TestScripts_07 extends General {
	
	@Test
	public static void AlertWindowVerification() throws Exception{
		 Global.OpenBrowser();
		 Global.LoginInto("ratnakarg@pronixinc.com", "Rathna@299299");
		 General.AlertBell();
		
	}

}
