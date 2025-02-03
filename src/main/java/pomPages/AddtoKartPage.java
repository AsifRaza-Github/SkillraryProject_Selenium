package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoKartPage {
	//Declaration
	//Address of Add to Kart button
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtoKart;
	//Address of + button
	@FindBy(xpath="//button[@id='add']")
	private WebElement addBtn;
	
	//Initialization
	//Initializer name should be same as class name
	public AddtoKartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getAddtoKartButton() {
		return addtoKart;
	}
	public void addButton() {
		addBtn.click();
	}
}
