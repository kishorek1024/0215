package com.qshore.Proj99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
	
	public void launchApp(String url){
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

}
