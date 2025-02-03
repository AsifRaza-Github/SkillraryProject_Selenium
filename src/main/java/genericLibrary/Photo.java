package genericLibrary;
import java.io.File;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class Photo {
	public void getPhoto(WebDriver driver,String name) throws Throwable {
	Date d=new Date();//Available in Java
	String currentDate=d.toString().replaceAll(":", "-");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(IPathConstant.photoPath+currentDate+name+".png");
	FileUtils.copyFile(src,dest);
}
}
