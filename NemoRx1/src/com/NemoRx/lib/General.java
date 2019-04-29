package com.NemoRx.lib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class General extends Global{
	
  	public static void SearchPatient(String patient) throws Exception{
		String title2 = driver.getTitle();System.out.println("Page 2 Title=="+title2);Thread.sleep(5000);
		driver.findElement(SearchPath).sendKeys(patient);Thread.sleep(5000);System.out.println("Name of patient=="+patient);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[1]/div[2]/div/ul/div")).click();
		String title3 = driver.getTitle();
		System.out.println("Page 3 Title=="+title3);	
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
			System.out.println("Profile Link From Side Menu Successfully opened");
			Reporter.log("Profile Link From Side Menu Successfully opened");
			Thread.sleep(3000);
			
		}
		public static void Providers_users() throws Exception{
			 wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/ul/a[3]/div[2]/span")));
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/a[3]/div[2]/span")).click();
			Thread.sleep(3000);
			System.out.println("Providers and Users link from side menu Succesfully Opened");
			driver.navigate().back();
		}
		public static void ViewExportSignedPriscriptions() throws Exception{
			 wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/ul/a[4]/div[2]/span")));
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/a[4]/div[2]/span")).click();
			Thread.sleep(3000);
			System.out.println("View/Export Signed Prescriptions link from side menu opened Succesfully");
			driver.navigate().back();
		}
		public static void Grant_requests() throws Exception{
			 wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/ul/a[5]/div[2]/span")));
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/a[5]/div[2]/span")).click();
			System.out.println("Grant request link from side succesfully opened");
			driver.navigate().back();
			Thread.sleep(3000);
		}
		public static void AuditItems() throws Exception{
			 wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/ul/a[6]/div[2]/span")));
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/a[6]/div[2]/span")).click();
			Thread.sleep(3000);
			System.out.println("Audit items link from side menu succesfully opened");
			driver.navigate().back();
			Thread.sleep(3000);
			
		}
		public static void WorkingHours() throws Exception{
			 wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Working Hours')]")));
			driver.findElement(By.xpath("//span[contains(.,'Working Hours')]")).click();
			System.out.println("Working hours link from side menu succesfully opened");
			driver.navigate().back();
			Thread.sleep(3000);
		}
		public static void AddingWorkingHoursAndDeletingWorkingHours() throws Exception{
			 wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Working Hours')]")));
			driver.findElement(By.xpath("//span[contains(.,'Working Hours')]")).click();
			System.out.println("Working hours link from side menu succesfully opened");
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div/div[1]/div/button[1]/span[1]")));
			driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div/div[1]/div/button[1]/span[1]")).click();
			Thread.sleep(5000);
			System.out.println("Work hour is added");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div/div[2]/button")));
			driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div/div[2]/button")).click();
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert message - "+alert.getText());
			alert.accept();
			System.out.println("Work hour is deleted");
			
		}
		
	
}