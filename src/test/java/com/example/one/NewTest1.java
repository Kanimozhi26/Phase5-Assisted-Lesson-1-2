package com.example.one;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest1 {
	
	
	String driverPath = "C:\\Users\\Kanimozhi\\Downloads\\chromedriver_win32/chromedriver.exe";
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException{
	  driver.get("http://www.ebay.com/"); //https://login.yahoo.com
	  System.out.println("The title of the page is :" + driver.getTitle()); 
	  
     
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver",
              "C:\\Users\\Kanimozhi\\Downloads\\chromedriver_win32/chromedriver.exe");

	  
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }
  
  

    

}