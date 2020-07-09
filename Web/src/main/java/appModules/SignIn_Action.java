package appModules;

        import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.LogInPage;
import utility.ExcelUtils;

    // Now this method does not need any arguments

    public class SignIn_Action {

		public static void Execute(WebDriver driver) throws Exception{

			//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

			String sUserName = ExcelUtils.getCellData(1, 1);

			String sPassword = ExcelUtils.getCellData(1, 2);

			HomePage.form_close(driver).click();
	        Thread.sleep(3000);
	        HomePage.altbx_close(driver).click();

	        HomePage.lnk_login(driver).click();

			LogInPage.txtbx_UserName(driver).sendKeys(sUserName);

			LogInPage.txtbx_Password(driver).sendKeys(sPassword);
			
			LogInPage.chkbx_remeberme(driver).click();

			LogInPage.btn_LogIn(driver).click();

        }

}