package pomPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TestingPage {
	//Declaration
	//Address of Testing in Select category drop down
	@FindBy(xpath="//select[text()='Testing']")
	private WebElement testingOpt;
	//Address of Facebook
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fb;
	
	//Initialization
	//Initializer name should be same as class name
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void testingOption() {
		testingOpt.click();
	}
	public void facebookLink() {
		fb.click();
	}
}
