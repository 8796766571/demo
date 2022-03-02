package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Include 
{
	WebDriver driver;
	@BeforeSuite
	public void openbrowser()
	{
		System.out.println("openbrowser");
		System.out.println("open");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhir Gaikwad\\Downloads\\Testing\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
	}
	@BeforeTest
	public void Enterurl()
	{
		System.out.println("Enter url");
		driver.get("https://www.mercurytravels.co.in/");
	}
	@BeforeClass
	public void maxbrowser()
	{
		System.out.println("maxbrowser");
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void getcookies()
	{
		System.out.println("getcookies");
	}
	@Test(groups= {"demo"})
	public void ABC() throws InterruptedException
	{
		System.out.println("ABC");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='navbar-collapse paddingleft0']/ul/li/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right margin-right-logo']/li/a/following-sibling::ul/li/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sign_user_email")).sendKeys("sudhirgaikwad2015.sg@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sign_user_password']")).sendKeys("Sudhir@7525");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right margin-right-logo']/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//nav[@class='navbar navbar-default login-nav']/div/div[2]/ul/li[2]/a/following-sibling::ul/li[3]/a")).click();
		Thread.sleep(2000);
	}
	@Test(groups= {"demo1"})
	public void BCA() throws InterruptedException
	{
		System.out.println("BCA");
		driver.findElement(By.xpath("//div[@class='navbar-collapse paddingleft0']/ul/li/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right margin-right-logo']/li/a/following-sibling::ul/li/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sign_user_email")).sendKeys("sudhirgaikwad2015.sg@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sign_user_password']")).sendKeys("Sudhir@7525");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right margin-right-logo']/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//nav[@class='navbar navbar-default login-nav']/div/div[2]/ul/li[2]/a/following-sibling::ul/li[3]/a")).click();
		Thread.sleep(2000);
	}
	@Test(groups= {"demo2"})
	public void CAB() throws InterruptedException
	{
		System.out.println("CAB");
		driver.findElement(By.xpath("//div[@class='navbar-collapse paddingleft0']/ul/li/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right margin-right-logo']/li/a/following-sibling::ul/li/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sign_user_email")).sendKeys("sudhirgaikwad2015.sg@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sign_user_password']")).sendKeys("Sudhir@7525");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right margin-right-logo']/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//nav[@class='navbar navbar-default login-nav']/div/div[2]/ul/li[2]/a/following-sibling::ul/li[3]/a")).click();
		Thread.sleep(2000);
	}
	@AfterMethod
	public void getScreenshot()
	{
		System.out.println("getScreenshot");
	}
	@AfterClass
	public void deletecookies()
	{
		System.out.println("deletecookies");
	}
	@AfterTest
	public void dbconnection()
	{
		System.out.println("dbconnection");
	}
	@AfterSuite
	public void closebrowser()
	{
		System.out.println("closebrowser");
		//driver.close();
	}
	
	
}
