package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	//Declaration
	//Address of Course button
	@FindBy(xpath="//a[@id='course']")
	private WebElement courseBtn;
	//Address of Select drop down
	@FindBy(xpath="//select[@name='addresstype']")
	private WebElement selectDd;
	//Address of Java in Course section
	@FindBy(xpath="(//a[text()='Java'])[1]")
	private WebElement javaT;
	
	//Initialization
	//Initializer name should be same as class name
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getCourseButton() {
		return courseBtn;
	}
	public WebElement getSelectDropdown() {
		return selectDd;
	}
	public void javaTraining() {
		javaT.click();
	}
}
