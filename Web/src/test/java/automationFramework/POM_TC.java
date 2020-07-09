package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.HomePage;
import pageObjects.LogInPage;

public class POM_TC {

 private static WebDriver driver = null;

 public static void main(String[] args) throws Throwable {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Framework\\Web\\src\\main\\java\\Drivers\\chromedriver.exe");
driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();

driver.get("http://www.autozone.com");

HomePage.form_close(driver).click();
Thread.sleep(3000);
HomePage.altbx_close(driver).click();

HomePage.lnk_login(driver).click();

LogInPage.txtbx_UserName(driver).sendKeys("rudra200519@gmail.com");

LogInPage.txtbx_Password(driver).sendKeys("test@121");

LogInPage.chkbx_remeberme(driver).click();

LogInPage.btn_LogIn(driver).click();

System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

HomePage.lnk_LogOut(driver).click(); 

driver.quit();

}

}