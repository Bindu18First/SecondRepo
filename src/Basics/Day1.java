package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	WebDriver dd;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day1 obj=new Day1();
		obj.startBrowser();
		
		
		}
	
	
	public void startBrowser()
	{
		try {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		dd=new ChromeDriver();
		dd.manage().deleteAllCookies();
		dd.manage().window().maximize();
		dd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dd.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		dd.get("http://edureka.co");
	}
catch(Exception e)
		{
	e.printStackTrace();

}

}}
