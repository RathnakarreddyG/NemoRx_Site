package com.NemoRx.lib;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import Functions.RandomBirthdate;
import Functions.RandomNames;
import Functions.RandomNumbers;

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
	public static void AddingPatient() throws Exception{
		String Acnumber = RandomNumbers.Number();Reporter.log("Account Number-"+Acnumber);
		RandomNames n = new RandomNames();
		String Fistname = n.randomIdentifier();Reporter.log("FirstName-"+Fistname);
		String DOB = RandomBirthdate.main1();Reporter.log("Date of Birth-"+DOB);
		wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/header/div/div[1]/div/div/div[2]/button")));
		driver.findElement(By.xpath("//*[@id='root']/div/header/div/div[1]/div/div/div[2]/button")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='accountNumber']")));
		driver.findElement(By.xpath("//input[@name='accountNumber']")).sendKeys(Acnumber);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='firstName']")));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(Fistname);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='lastName']")));
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(Fistname);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='address']")));
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Detroit");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='zipCode']")));
		driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("59875");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[11]/div/div/div/div")));
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[11]/div/div/div/div")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='menu-gender']/div[2]/ul/li[2]")));
		driver.findElement(By.xpath("//*[@id='menu-gender']/div[2]/ul/li[2]")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[12]/div/div/input")));
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[12]/div/div/input")).clear();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[12]/div/div/input")).sendKeys(DOB);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[3]/button[2]/span[1]")));
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/button[2]/span[1]")).click();
		Reporter.log("Patient Added Successfully-Name Of the Patient"+Fistname+ " "+Fistname );
	}

}
