package com.adevi.testCases;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//import com.adevi.utilities.ReadConfig;
//import com.beust.jcommander.Parameter;


public class BaseClass {
	/*ReadConfig readconfig=new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();*/
	public String baseURL="https://staging.adevi.info/signin";
	public String username="Selva";
	public String password="].?h^QC<FV4SdsmF";
	public static WebDriver driver;
	//public static Logger Logger;
	
	//@Parameter("browser");
	@BeforeClass
	public void setup(String br)
	{
		//Logger=Logger.getLogger("ADEVI");
		//PropertyConfigurator.configure("Log4j.properties");
		
				
		//if(br.equals("chrome"))
		//{
			//System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\selva\\eclipse-workspace\\ADEVIProj\\Drivers\\chromedriver.exe");
			String direct= System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",direct+"\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		//}
		/*else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			driver=new ChromeDriver();
		}*/
		
	}
	
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
