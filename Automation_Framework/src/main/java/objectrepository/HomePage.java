package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
	private WebElement booksLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")
	private WebElement computersLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]")
	private WebElement electronicsLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Apparel & Shoes')])[1]")
	private WebElement apparelAndShoesLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Digital downloads')])[1]")
	private WebElement digitaldownloadsLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Jewelry')])[1]")
	private WebElement JewelryLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Gift Cards')])[1]")
	private WebElement giftCardsLink;
	
	@FindBy(xpath = "//a[text()='Log out']")
	private WebElement logoutLink;
	
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}

	public WebElement getDigitaldownloadsLink() {
		return digitaldownloadsLink;
	}

	public WebElement getJewelryLink() {
		return JewelryLink;
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
	



}
