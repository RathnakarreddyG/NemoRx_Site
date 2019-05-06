package com.NemoRx.lib;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Global {

	public static WebDriver driver;
	public static WebDriverWait wait;
	 public static By UserPath = By.id("okta-signin-username");
	   public static By PassPath = By.id("okta-signin-password");
	   public static By LoginPath = By.id("okta-signin-submit");
	   public static By SearchPath = By.xpath("//input[@class='jss68 jss53 jss73 jss74']");
	public static void OpenBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "ChromeDriverPath1/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://app-dev.nemorx.com/");Thread.sleep(5000);
	}
	public static void LoginInto(String user, String pass) throws Exception{
		driver.findElement(UserPath).sendKeys(user);System.out.println("User Name-"+user);
		driver.findElement(PassPath).sendKeys(pass);System.out.println("User Password-"+pass);
		driver.findElement(LoginPath).click();Thread.sleep(10000);
		System.out.println("Successfully login completed");Reporter.log("Successfully login completed");
		System.out.println("Page Title-"+driver.getTitle());Reporter.log("Page Title-"+driver.getTitle());
		}
	public static void Logout(){
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Logout')]")));
		driver.findElement(By.xpath("//span[contains(.,'Logout')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Yes')]")));
		driver.findElement(By.xpath("//span[contains(.,'Yes')]")).click();
		System.out.println("Logout Successfully completed");Reporter.log("Logout Successfully completed");
	}
	
	
}
