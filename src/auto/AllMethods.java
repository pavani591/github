package auto;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AllMethods {
	
	
	public static WebElement findElement(WebDriver driver,String locatorType,String locatorValue)
	{
		By by=null;
		if(locatorType.equals("id"))
		{
			by=By.id(locatorValue);
		}
		else if(locatorType.equals("tagName"))
		{
			by=By.tagName(locatorValue);
			
		}
		else if(locatorType.equals("name"))
		{
			by=By.tagName(locatorValue);
			
		} else if(locatorType.equals("className"))
		{
			by=By.tagName(locatorValue);
			
		}else if(locatorType.equals("linkText"))
		{
			by=By.tagName(locatorValue);
			
		}else if(locatorType.equals("partialLinkText"))
		{
			by=By.tagName(locatorValue);
			
		}else if(locatorType.equals("css Selector"))
		{
			by=By.tagName(locatorValue);
			
		}else if(locatorType.equals("xpath"))
		{
			by=By.tagName(locatorValue);
			
		}
		WebElement ele = driver.findElement(by);
		return ele;
	
		
		
	}
	public static java.util.List<WebElement> findElements(WebDriver driver,String locatorType,String locatorValue)
	{
		By by=null;
		if(locatorType.equals("id"))
		{
			by=By.id(locatorValue);
		}
		else if(locatorType.equals("tagName"))
		{
			by=By.tagName(locatorValue);
			
		}
		else if(locatorType.equals("name"))
		{
			by=By.tagName(locatorValue);
			
		} else if(locatorType.equals("className"))
		{
			by=By.tagName(locatorValue);
			
		}else if(locatorType.equals("linkText"))
		{
			by=By.tagName(locatorValue);
			
		}else if(locatorType.equals("partialLinkText"))
		{
			by=By.tagName(locatorValue);
			
		}else if(locatorType.equals("css Selector"))
		{
			by=By.tagName(locatorValue);
			
		}else if(locatorType.equals("xpath"))
		{
			by=By.tagName(locatorValue);
			
		}
		   java.util.List<WebElement> eles = driver.findElements(by);
		return eles;
		
	}
	
	public static void url(WebDriver driver,String url)
	{
		driver.get(url);
		
	}
	public static void data(WebDriver driver,String locatorType,String locatorValue,String data)
	{
		findElement(driver, locatorType, locatorValue).sendKeys(data);
	}
	
	
	public static void mouse(WebDriver driver,String locatorType,String locatorValue)
	{
		Actions act=new Actions(driver);
		WebElement move = findElement(driver, locatorType, locatorValue);
		act.moveToElement(move).perform();
	}
	
	public static void dragAndDrop(WebDriver driver,String locatorType,String locatorValue)
	
	{
		Actions act=new Actions(driver);
		WebElement target=findElement(driver, locatorType, locatorValue);
		WebElement source=findElement(driver, locatorType, locatorValue);
		act.dragAndDrop(source, target).perform();
		
		
		
	}
	public static void click(WebDriver driver,String locatorType,String locatorValue)
	{
		findElement(driver, locatorType, locatorValue).click();
	}
	public static void rightClick(WebDriver driver,String locatorType,String locatorValue)
	{
		Actions act=new Actions(driver);
		WebElement rc = findElement(driver, locatorType, locatorValue);
		act.contextClick(rc).perform();
	}
	public static void brokenLink(WebDriver driver,String locatorType,String locatorValue) throws IOException
	{
	WebElement link =findElement(driver, locatorType, locatorValue);
	
	
	String link1 = link.getAttribute("href");
	 URL u = new URL(link1);
	 HttpURLConnection connection=(HttpURLConnection)u.openConnection();
	 
	 int Rcode=connection.getResponseCode();
	 if(Rcode==200)
	 {
		 System.out.println(Rcode);
		 System.out.println(connection.getResponseMessage());
		 System.out.println("link is not broken");
	 }
	 
	 else
	 {
		 System.out.println(Rcode);
		 System.out.println(connection.getResponseMessage());
		 System.out.println("link is broken"); 
	 }
	}
	public static void selectByIndex(WebDriver driver,String locatorType,String locatorValue)
	{
		WebElement ele = findElement(driver, locatorType, locatorValue);
		Select s = new Select(ele);
		int i=0;
		s.selectByIndex(i);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
