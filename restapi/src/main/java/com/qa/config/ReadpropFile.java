package com.qa.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadpropFile {
	
	 static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		
		Properties prop = new Properties();
		
		FileInputStream ip= new FileInputStream(".\\src\\main\\java\\com\\qa\\config\\config.properties");
	
		prop.load(ip);
		
		
		
		String url=prop.getProperty("URl");
		
		System.out.println(url);
		
		
        String browsername=prop.getProperty("browser");
		
		System.out.println(browsername);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kunal Mishra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();		
		
		
		
		
		
		
		
	}

}
