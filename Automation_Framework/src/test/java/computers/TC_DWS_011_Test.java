package computers;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;
@Listeners(ListenerUtility.class)
public class TC_DWS_011_Test extends BaseClass{
	
	@Test
	
	public void clickOnDesktop() throws InterruptedException {
		
		
		
		HomePage hp=new HomePage(driver);
		wUtil.mouseHover(driver,hp.getComputersLink() );
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Desktops')]")).click();
		Thread.sleep(3000);
		

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Desktops", "Desktops page is not displayed");
		test.log(Status.PASS, "Desktops page is displayed");
		
		

	}

}
