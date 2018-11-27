package com.guru99automation.pageobject;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.log4testng.Logger;

public class Guru99Base {
	  public static WebDriver driver;
	  public String baseURL="https://www.facebook.com/";
	  public String userName="919762684291";
	  public String password="Shivtej@292";
	  public static Logger logger;
	  public Guru99Base()
	  {
			   
	  }
      
	  @BeforeClass
	  public void setUp()
	  {
	      		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers/chromedriver.exe");
	            driver= new ChromeDriver();
	            logger=Logger.getLogger("guru99automation");
	           
	            driver.manage().window().maximize();
	            driver.manage().deleteAllCookies();
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	  }
	  
      @AfterClass
	  public void tearDown()
	  {
	      driver.quit();		
	  }
}
