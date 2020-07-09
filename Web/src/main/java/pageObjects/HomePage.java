package pageObjects;

    import org.openqa.selenium.By;

    import org.openqa.selenium.WebDriver;

    import org.openqa.selenium.WebElement;

 public class HomePage {

    private static WebElement element = null;

 public static WebElement lnk_MyAccount(WebDriver driver){

    element = driver.findElement(By.id("account"));

    return element;

    }
 
 public static WebElement form_close(WebDriver driver) {

	 element = driver.findElement(By.xpath("//*[@id=\'form-close\']/img"));
	 
	 return element;
 }

 public static WebElement altbx_close(WebDriver driver){
	 element = driver.findElement(By.className("optanon-alert-box-corner-close"));
	 return element;
 }
 
 
 public static WebElement lnk_login(WebDriver driver){
	 element = driver.findElement(By.xpath("//*[@id=\"profilenav\"]/a"));
	 return element;
 }
 public static WebElement lnk_LogOut(WebDriver driver){

    element = driver.findElement(By.xpath("//*[@id='profileLogoutForm']/a"));

 return element;

}

}