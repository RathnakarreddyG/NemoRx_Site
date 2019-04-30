package com.NemoRx.lib;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class General1 extends General{
	
	public static void RxPrintSetting() throws Exception{
		wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Rx Print Settings')]")));
		driver.findElement(By.xpath("//span[contains(.,'Rx Print Settings')]")).click();
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//1
		r.keyPress(KeyEvent.VK_SPACE);r.keyRelease(KeyEvent.VK_SPACE);Reporter.log("Capitalize Prescription");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//2
		r.keyPress(KeyEvent.VK_SPACE);r.keyRelease(KeyEvent.VK_SPACE);Reporter.log("Print Patient's Address");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//3
		r.keyPress(KeyEvent.VK_SPACE);r.keyRelease(KeyEvent.VK_SPACE);Reporter.log("Two Signature Lines");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//4
		r.keyPress(KeyEvent.VK_SPACE);r.keyRelease(KeyEvent.VK_SPACE);Reporter.log("Initials Signature Line");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//5
		r.keyPress(KeyEvent.VK_SPACE);r.keyRelease(KeyEvent.VK_SPACE);Reporter.log("Print Title");
		Thread.sleep(2000);			
		
			r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//6
		r.keyPress(KeyEvent.VK_SPACE);r.keyRelease(KeyEvent.VK_SPACE);Reporter.log("Print DPS");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//7
		r.keyPress(KeyEvent.VK_SPACE);r.keyRelease(KeyEvent.VK_SPACE);Reporter.log("Print NPI");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//8
		r.keyPress(KeyEvent.VK_SPACE);r.keyRelease(KeyEvent.VK_SPACE);Reporter.log("Print State License Number");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//9
		r.keyPress(KeyEvent.VK_SPACE);r.keyRelease(KeyEvent.VK_SPACE);Reporter.log("Print Comments");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//10
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//11
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//12
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//13
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
		//Second loop
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Rx Print Settings')]")));
		driver.findElement(By.xpath("//span[contains(.,'Rx Print Settings')]")).click();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//1
		r.keyPress(KeyEvent.VK_SPACE);r.keyRelease(KeyEvent.VK_SPACE);Reporter.log("Unchecked Capitalize Prescription");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//2
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//3
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//4
		r.keyPress(KeyEvent.VK_SPACE);r.keyRelease(KeyEvent.VK_SPACE);Reporter.log("Unchecked Initials Signature Line");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//5
		
		Thread.sleep(2000);			
		
			r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//6
		r.keyPress(KeyEvent.VK_SPACE);r.keyRelease(KeyEvent.VK_SPACE);Reporter.log("Unchecked Print DPS");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//7
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//8
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//9
		r.keyPress(KeyEvent.VK_SPACE);r.keyRelease(KeyEvent.VK_SPACE);Reporter.log("Unchecked Print Comments");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//10
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//11
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//12
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);//13
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
		
		
	}

}
