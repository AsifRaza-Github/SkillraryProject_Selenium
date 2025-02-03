package genericLibrary;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class WebDriverUtilities {
	// Handling Drop down
	public void dropDown(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}

	// Handling Mouse hover
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}

	// Handling Double click
	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}

	// Handling Right click
	public void rightClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}

	// Handling drag and drop
	public void dragDrop(WebDriver driver, WebElement src, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, target).perform();
	}

	// Shifting control to frame
	public void switchFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}

	// Shifting control to normal web page
	public void switchBackFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	// Shifting control to pop-up
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	// Shifting control to child browser
	public void switchingTab(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for (String b : child) {
			driver.switchTo().window(b);
		}
	}

	// Handling scroll bar
	public void scrollBar(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("windows.scrollBy(" + x + "," + y + ")");
	}
}
