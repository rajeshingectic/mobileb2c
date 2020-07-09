 package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;


public class LogInPage {

	private static WebElement element = null;

public static WebElement txtbx_UserName(WebDriver driver){

element = driver.findElement(By.id("username1"));

return element;

}

 public static WebElement txtbx_Password(WebDriver driver){

 element = driver.findElement(By.id("password1"));

return element;

}

 public static WebElement chkbx_remeberme(WebDriver driver){

 element = driver.findElement(By.id("rememberMe"));

 return element;

}
 
 public static WebElement btn_LogIn(WebDriver driver){

 element = driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']"));

 return element;

}

}