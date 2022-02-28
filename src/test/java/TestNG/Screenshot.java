package TestNG;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.netty.channel.socket.ChannelInputShutdownReadComplete;

public class Screenshot
{
	
	
	WebDriver driver;
	@BeforeSuite
	public void openbrowser()
	{
		
		System.out.println("openbrowser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhir Gaikwad\\Downloads\\Testing\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
	}
	@BeforeTest
	public void enterURL()
	{
		System.out.println("enterurl");
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
	@Test
	public void login()
	
	{
		System.out.println("login");
		
	}
	@AfterMethod
	public void getScreenshot()
	{
		System.out.println("getScreenshot");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src,new File("C:\\Users\\Sudhir Gaikwad\\eclipse-workspace\\TestNG"));
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
