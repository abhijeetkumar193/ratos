package mainUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pages.LoginPage;

public class projectSpecific  implements ratosInterfaces{

	public Properties prop;
	public static ChromeDriver driver;

	public String getPropertyValue(String key) throws FileNotFoundException, IOException {
		prop= new Properties();
		prop.load(new FileInputStream(new File("./Utilities/utilities.properties")));
		return prop.getProperty(key);
		
	}
	
	
	
	
	public void sleep(long time) throws InterruptedException
	{
		Thread.sleep(time);
	}
	@BeforeClass
	public WebDriver initialiseDriver() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("driver initialised");
		return driver;
		
	}
	
	public void dropDownselect(WebElement ele, int i)
	{
		Select select= new Select(ele);
		select.selectByIndex(i);
		
	}
	
	

	
	
}
