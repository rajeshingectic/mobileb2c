package automationFramework;

		import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.*;

		import utility.Constant;

		// Import Package utility.*

		import utility.ExcelUtils;

		import appModules.SignIn_Action;

	public class Apache_POI_TC {

			private static WebDriver driver = null;
			 private static Logger Log = Logger.getLogger(Apache_POI_TC.class.getName());
			 
		
		public static void main(String[] args) throws Exception {
			 DOMConfigurator.configure("log4j.xml");
        //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method

        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Framework\\Web\\src\\main\\java\\Drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(Constant.URL);
        String url = driver.getCurrentUrl();
        Log.info("Web application launched");
        SignIn_Action.Execute(driver);

        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

        HomePage.lnk_LogOut(driver).click(); 
        
        String currenturl = driver.getCurrentUrl();
        
        if(currenturl.equals(url)) {
        	System.out.println("The current url is equal to actual url");
        }
        driver.quit();
        
        Log.info("Browser closed");
        //This is to send the PASS value to the Excel sheet in the result column.

        ExcelUtils.setCellData("Pass", 1, 3);

		}

	}