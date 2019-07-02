 package testng;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class test2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.com/");
		
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter(new File("file:///C:/Users/home/Desktop/html/actitime.html.html"));
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test=extent.createTest("homepage");
		driver.get("http://www.google.com");
		String At=driver.getTitle();
		String et="";
		if(At.equals(et))
		{
			test.log(Status.PASS,"navigated to target url");
		}
		else
			test.log(Status.FAIL, "taget url not working");
		driver.findElement(By.xpath("")).click();
		driver.close();
		extent.flush();
	}
	

}
