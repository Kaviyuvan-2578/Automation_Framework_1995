package demo009;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PollSCM {
	@Test
	public void pollscm() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://plugins.jenkins.io/pollscm/");
	}

}
