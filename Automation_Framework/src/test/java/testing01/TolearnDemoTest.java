package testing01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TolearnDemoTest {
	@Test
	public void openBrowser() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

}
