package scripts;
import org.testng.annotations.Test;
import genericLibrary.BaseClass;
import pomPages.AddtoKartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
public class TestCase1 extends BaseClass{
	@Test
	public void tc1() {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearsButton();
	s.skillraryDemoApplication();
	utilities.switchingTab(driver);
	SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
	utilities.mouseHover(driver, sd.getSelectDropdown());
	sd.javaTraining();
	AddtoKartPage d=new AddtoKartPage(driver);
	utilities.doubleClick(driver,d.getAddtoKartButton());
	d.addButton();
	utilities.alertPopup(driver);
	}
} 
 