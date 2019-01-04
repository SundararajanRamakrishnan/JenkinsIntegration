package com.Jenkins.sample.com.Jenkins.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenDemoTest {
	public WebDriver driver;
	
	@Test
	public void launchAppTest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Desktop\\SeleniumTool\\Tools\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://elearning.hommelle.com/");
		  
		String ActTitle = driver.getTitle();
		System.out.println("The Title is " + ActTitle); 
	}

}
