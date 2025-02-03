package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	//Declaration
	//Address of gear web element
	@FindBy(xpath="//span[text()='GEARS']")
	private WebElement gearsBtn;
	//Address of skillrary demo app
	@FindBy(xpath="//a[text()='SkillRary Demo APP']")
	private WebElement skillraryDemoApp;
	//Address of search icon
	@FindBy(xpath="//i[@id='searchFaIcon']")
	private WebElement searchBtn;
	//Address of search text field
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchTf;
	
	//Initialization
	//Initializer name should be same as class name
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void gearsButton() {
		gearsBtn.click();
	}
	public void skillraryDemoApplication() {
		skillraryDemoApp.click();
	}
	public void searchButton() {
		searchBtn.click();
	}
	public void searchTextField(String a) {
		searchTf.sendKeys(a);
	}
}
