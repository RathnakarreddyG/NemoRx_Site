package com.NemoRx.lib;



import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class General extends Global{
	
  	public static void SearchPatient(String patient) throws Exception{
  		 wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable((SearchPath)));
		driver.findElement(SearchPath).sendKeys(patient);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/header/div/div[1]/div[2]/div/ul/div")));
		System.out.println("Name of patient=="+patient);Reporter.log("Name of patient=="+patient);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[1]/div[2]/div/ul/div")).click();
		
		
	}
	public static void sideMenu() throws Exception{
		 wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/header/div/div[3]/button[2]")));
		driver.findElement(By.xpath("//*[@id='root']/div/header/div/div[3]/button[2]")).click();
	
	}
		
		public static void ProfileLink() throws Exception{
			 wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/ul/a[1]/div[2]/span")));
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/a[1]/div[2]/span")).click();
			Thread.sleep(3000);
			String address = driver.findElement(By.xpath("//span[@class='jss112 jss123'][contains(.,'Address')]")).getText();System.out.println(address);
			String ExpectedAddress = "Address";
			if(address.equals(ExpectedAddress)){
				System.out.println("Verification Done");
			}else{
				System.out.println("Verification Filed");
			}
			driver.navigate().back();
			System.out.println("Profile Link From Side Menu Successfully opened");Reporter.log("Profile Link From Side Menu Successfully opened");
			
			Thread.sleep(3000);
			
		}
		public static void Providers_users() throws Exception{
			 wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/ul/a[3]/div[2]/span")));
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/a[3]/div[2]/span")).click();
			Thread.sleep(3000);
			System.out.println("Providers and Users link from side menu Succesfully Opened");Reporter.log("Providers and Users link from side menu Succesfully Opened");
			driver.navigate().back();
		}
		public static void ViewExportSignedPriscriptions() throws Exception{
			 wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/ul/a[4]/div[2]/span")));
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/a[4]/div[2]/span")).click();
			Thread.sleep(3000);
			System.out.println("View/Export Signed Prescriptions link from side menu opened Succesfully");Reporter.log("View/Export Signed Prescriptions link from side menu opened Succesfully");
			driver.navigate().back();
		}
		public static void Grant_requests() throws Exception{
			 wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/ul/a[5]/div[2]/span")));
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/a[5]/div[2]/span")).click();
			System.out.println("Grant request link from side succesfully opened");Reporter.log("Grant request link from side succesfully opened");
			driver.navigate().back();
			Thread.sleep(3000);
		}
		public static void AuditItems() throws Exception{
			 wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/ul/a[6]/div[2]/span")));
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/a[6]/div[2]/span")).click();
			Thread.sleep(3000);
			System.out.println("Audit items link from side menu succesfully opened");Reporter.log("Audit items link from side menu succesfully opened");
			driver.navigate().back();
			Thread.sleep(3000);
			
		}
		public static void WorkingHours() throws Exception{
			 wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Working Hours')]")));
			driver.findElement(By.xpath("//span[contains(.,'Working Hours')]")).click();
			System.out.println("Working hours link from side menu succesfully opened");Reporter.log("Working hours link from side menu succesfully opened");
			driver.navigate().back();
			Thread.sleep(3000);
		}
		public static void AddingWorkingHoursAndDeletingWorkingHours() throws Exception{
			 wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Working Hours')]")));
			driver.findElement(By.xpath("//span[contains(.,'Working Hours')]")).click();
			System.out.println("Working hours link from side menu succesfully opened");Reporter.log("Working hours link from side menu succesfully opened");
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div/div[1]/div/button[1]/span[1]")));
			driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div/div[1]/div/button[1]/span[1]")).click();
			Thread.sleep(5000);
			System.out.println("Work hour is added");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div/div[2]/button")));
			driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div/div[2]/button")).click();
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert message - "+alert.getText());Reporter.log("Alert message - "+alert.getText());
			alert.accept();
			System.out.println("Work hour is deleted");Reporter.log("Work hour is deleted");
			
		}
		public static void AddMedication(String drug) throws Exception{
			wait = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div/ul/div[4]/div/div/div/div[1]/button[1]/span[1]")));
			boolean butAddM = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div/ul/div[4]/div/div/div/div[1]/button[1]/span[1]")).isEnabled();
			System.out.println("Add medication Button = "+butAddM);Reporter.log("Add medication Button = "+butAddM);
			driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div/ul/div[4]/div/div/div/div[1]/button[1]/span[1]")).click();
			driver.findElement(By.xpath("//input[@name='drugSearchStr']")).sendKeys(drug);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);Reporter.log("Drug Selected");
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);r.keyPress(KeyEvent.VK_ENTER);r.keyRelease(KeyEvent.VK_ENTER);Thread.sleep(3000);
			String drug1 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div/div[2]/div/div[1]/div/div/input")).getText();
			System.out.println("Selected Drug--"+drug1);
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			Date date = new Date();
			String stDate = dateFormat.format(date);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div/div[2]/div/div[3]/div/div/input")).sendKeys(stDate);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[contains(@class,'jss68 jss53 jss74')])[3]")));
			driver.findElement(By.xpath("(//input[contains(@class,'jss68 jss53 jss74')])[3]")).sendKeys(stDate);
			driver.findElement(By.xpath("(//input[contains(@class,'jss68 jss53 jss74')])[4]")).sendKeys(stDate);
			driver.findElement(By.xpath("//input[contains(@name,'sig')]")).sendKeys("2");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='jss165'][contains(.,'Submit')]")));
			driver.findElement(By.xpath("//span[@class='jss165'][contains(.,'Submit')]")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/div/div[2]/p")));
			String ConfirmMessage = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/p")).getText();
			System.out.println(ConfirmMessage);Reporter.log(ConfirmMessage);
			if(ConfirmMessage.equals("Successfully added medication. Would you like to add another medication?")){
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='jss165'][contains(.,'No')]")));
				driver.findElement(By.xpath("//span[@class='jss165'][contains(.,'No')]")).click();
				Thread.sleep(3000);
			}else if(ConfirmMessage.equals("The drug has already been added for this patient")){
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/div/div[3]/button/span[1]")));
				driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]/button/span[1]")).click();
				Thread.sleep(3000);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[4]/button[1]")));
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[4]/button[1]")).click();
				Thread.sleep(3000);
			}
			
		}
		public static void AddAllerigies(String allergy) throws Exception{
			wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(.,'Add')])[2]")));
			boolean butAdd = driver.findElement(By.xpath("(//span[contains(.,'Add')])[2]")).isEnabled();
			System.out.println("Add allergy Button = "+butAdd);
			driver.findElement(By.xpath("(//span[contains(.,'Add')])[2]")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='searchStr']")));
			driver.findElement(By.xpath("//input[@name='searchStr']")).sendKeys(allergy);
			Robot r = new Robot();
			
			r.keyPress(KeyEvent.VK_ENTER);r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_TAB);r.keyRelease(KeyEvent.VK_TAB);
		
			r.keyPress(KeyEvent.VK_ENTER);r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			String AddedAllergy = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div/div[2]/div/div[1]/div/div/input")).getText();
			System.out.println("**Added allergy-"+AddedAllergy);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='reaction']")));
			driver.findElement(By.xpath("//input[@name='reaction']")).sendKeys("Head");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[4]/button[2]/span[1]")));
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[4]/button[2]/span[1]")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/div/div[2]/p")));
			String message = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/p")).getText();
			System.out.println(message);Reporter.log(message);
			if(message.equals("Successfully created allergy. Would you like to add another allergy?")){
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/div/div[3]/button[2]/span[1]")));
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]/button[2]/span[1]")).click();
			}
			else if(message.equals("The allergy already exists for the patient")){
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/div/div[3]/button")));
				driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]/button")).click();
				Thread.sleep(2500);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[4]/button[1]")));
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[4]/button[1]")).click();
				Thread.sleep(3000);
			}
		}
		public static void AlertBell() throws Exception{
			
			wait = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/header/div/div[3]/a")));
			driver.findElement(By.xpath("//*[@id='root']/div/header/div/div[3]/a")).click();
			System.out.println("Clicked on Alertbell");Reporter.log("Clicked on Alertbell");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[2]/div[2]/header/div/div[2]/div/div/button[2]/span[1]/span/span")));
			driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/header/div/div[2]/div/div/button[2]/span[1]/span/span")).click();
			System.out.println("Alertbell window Opened");Reporter.log("Alertbell window Opened");Reporter.log("Clicked on History button");
			driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/div/div/div/div")).click();
			System.out.println("--Verifying options are available in 'History For'---");Reporter.log("--Verifying options are available in 'History For'---");
			String option1 = driver.findElement(By.xpath("//*[@id='menu-historyFilter']/div[2]/ul/li[1]")).getText();
			System.out.println("**"+option1+"**");Reporter.log("**"+option1+"**");
			String option2 = driver.findElement(By.xpath("//*[@id='menu-historyFilter']/div[2]/ul/li[2]")).getText();
			System.out.println("**"+option2+"**");Reporter.log("**"+option2+"**");
			String option3 = driver.findElement(By.xpath("//*[@id='menu-historyFilter']/div[2]/ul/li[3]")).getText();
			System.out.println("**"+option3+"**");Reporter.log("**"+option3+"**");
			driver.findElement(By.xpath("//*[@id='menu-historyFilter']/div[2]/ul/li[1]")).click();
			
		}
		public static void Prescribe(){
			wait = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='jss578'][contains(.,'Prescribe')]")));
			driver.findElement(By.xpath("//span[@class='jss578'][contains(.,'Prescribe')]")).click();
			
		}
		public static void UnderSummaryMedicationsSendEditDelete(){
			wait = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div/ul/div[4]/div/div/div/div[2]/table/tbody/tr/td[6]/button[1]")));
			boolean bu1 = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div/ul/div[4]/div/div/div/div[2]/table/tbody/tr/td[6]/button[1]")).isEnabled();
			System.out.println("Send Medication Button = "+bu1);Reporter.log("Send Medication Button = "+bu1);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div/ul/div[4]/div/div/div/div[2]/table/tbody/tr/td[6]/button[2]")));
			WebElement editButton = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div/ul/div[4]/div/div/div/div[2]/table/tbody/tr/td[6]/button[2]"));
			boolean bu2 = editButton.isEnabled();
			System.out.println("Medication Edit button = "+bu2);Reporter.log("Medication Edit button = "+bu2);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div/ul/div[4]/div/div/div/div[2]/table/tbody/tr/td[6]/button[1]")));
			boolean bu3 = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div/ul/div[4]/div/div/div/div[2]/table/tbody/tr/td[6]/button[3]")).isEnabled();
			System.out.println("Delete Medication Button = "+bu3);Reporter.log("Delete Medication Button = "+bu3);
		}
		public static void UnderSummaryAllerigiesEditDelete(){
			wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div/ul/div[6]/div/div/div/div/div/table/tbody/tr/td[5]/div/button[1]")));
			boolean but1 = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div/ul/div[6]/div/div/div/div/div/table/tbody/tr/td[5]/div/button[1]")).isEnabled();
			System.out.println("Edit allergy Button = "+but1);Reporter.log("Edit allergy Button = "+but1);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div/ul/div[6]/div/div/div/div/div/table/tbody/tr/td[5]/div/button[2]")));
			boolean but2 = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div/ul/div[6]/div/div/div/div/div/table/tbody/tr/td[5]/div/button[2]")).isEnabled();
			System.out.println("Delete allergy Button = "+but2);Reporter.log("Delete allergy Button = "+but2);
		}
	
}