package com.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.util.TestUtility;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	
	

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream FI = new FileInputStream("/Users/kanhaiyamotarwr/eclipse-workspace/HybridFramework/src/main/java/com/config/config.properties");
			prop.load(FI);
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() {
		String browsername = prop.getProperty("browser");

			System.setProperty("webdriver.gecko.driver", "/Users/kanhaiyamotarwr/Desktop/geckodriver");
			  driver = new FirefoxDriver();
		//driver.get("https://www.google.com");
		


		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtility.Page_Load_Timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtility.Page_Load_Timeout,TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	
		}


	
}