package facebookLogin;

import org.testng.annotations.Test  ;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FacebookLogintest {
	public ChromeDriver driver;
  @Test(priority = 1)
  public void testLogin() {
	  driver.findElement(By.id("email")).sendKeys("Add here the user name");
	  driver.findElement(By.id("pass")).sendKeys("add here the password");
	  driver.findElement(By.xpath("//*[@value='Iniciar sesión']")).click();
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  if(driver.findElement(By.name("q")).isDisplayed()) {
		  System.out.println("Prueba superada");
	  }else {
		  System.out.println("Prueba no suerada");
	  }}
		  

@Test(priority = 2)
public void testFailLogin() {
	  driver.findElement(By.id("email")).sendKeys("Add here the user name");
	  driver.findElement(By.id("pass")).sendKeys("add here the password");
	  driver.findElement(By.xpath("//*[@value='Iniciar sesión']")).click();
	  
	  if(driver.findElement(By.name("q")).isDisplayed()) {
		  System.out.println("Prueba  superada");
	  }else {
		  System.out.println("Prueba  No suerada");
	  }
		  
}
  
  @BeforeTest
  public void beforeTest() {
		  driver = new ChromeDriver();
	      driver.get("http://facebook.com");
  }

  @AfterTest
  
  public void afterTest() {
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.close();
  }

}
