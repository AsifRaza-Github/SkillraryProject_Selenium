package genericLibrary;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	public WebDriver driver;
	public PropertyFile pdata = new PropertyFile();
	public WebDriverUtilities utilities = new WebDriverUtilities();
	@BeforeMethod
	public void openApp() throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(pdata.getPropertyData("url"));
	}

	@AfterMethod
	public void closeApp(ITestResult res) throws Throwable {// ITestResult is an interface available in testNG
		int status = res.getStatus();// Inside ItestResult, getStatus() method is available.It returns 1,2 and 3.
		String name = res.getName();// Inside ItestResult, getName() method is available.
		if (status == 2) {// Here:1 means pass,2 means failed, 3 means skipped.
			Photo p = new Photo();
			p.getPhoto(driver, name);
		}
		driver.quit();
	}
}
