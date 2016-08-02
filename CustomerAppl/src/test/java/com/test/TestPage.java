package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPage {
	@Test
	  public void testHomePage() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\r.a.perumalsamy\\Downloads\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://localhost:8080/CustomerAppl");
String title=driver.getTitle();
System.out.println("title of page=" + title);
Assert.assertEquals(title,"Home Page");
	//driver.findElement(By.linkText("Contact Us")).click();
	}
}
