package com.project.projectName;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/r3mb00/ALL/Desktop/chromedriver");
WebDriver driver = new ChromeDriver();
driver.get("http://google.com");

	}

}
