package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public BaseClass() 
	{
	   prop =new Properties ();
		FileInputStream file =null;
		try {
			file = new FileInputStream ("C:\\Users\\mahim\\eclipse-workspace\\PomHealthcare\\src\\main\\java\\com\\qa\\config\\configaration.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/*public static void initilazition()
	{
	String browserName = prop.getProperty("browser");
	//for opening the browser 
	
	System.out.println(browserName);
		
	if(browserName.equals("chrome"))
		{
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahim\\Dropbox\\My PC (DESKTOP-UA48023)\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
			*/
	
	public void initilazition() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahim\\Dropbox\\My PC (DESKTOP-UA48023)\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	
	
	
	
	//	if (browserName.equalsIgnoreCase("FireFox"))
		//{
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahim\\Dropbox\\My PC (DESKTOP-UA48023)\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//	driver= new ChromeDriver();
	//	}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String urlName =prop.getProperty("url");
		driver.get(urlName);
				
		}
	

}



