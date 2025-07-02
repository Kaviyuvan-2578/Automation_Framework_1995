package electronics;

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
public class TC_DWS_051_Test extends BaseClass {
	
@Test
	
	public void clickOnCellPhones() throws InterruptedException {
		
		
		HomePage hp=new HomePage(driver);
		wUtil.mouseHover(driver,hp.getElectronicsLink());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Cell phones')]")).click();
		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Cell phones", "Cell Phones page is not displayed");
		test.log(Status.PASS, "Cell Phones page is displayed");
	
	}

}
