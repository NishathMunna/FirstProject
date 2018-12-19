package AutomationPageObjects;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage {

	@FindBy(xpath = ".//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement Womentab;

	@FindBy(xpath = ".//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dressestab;
	
	@FindBy(xpath = ".//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement Tshirtstab;
	
	@FindBy(xpath="//*[@class='logo img-responsive']")
	private WebElement LogoPage;
	
	@FindBy(xpath="//*[@id='newsletter-input']")
	private WebElement txtBoxNewsLetter;
	
	@FindBy(xpath="//*[@name='submitNewsletter']")
	private WebElement BtnSubmitNewsLeteter;
	
	@FindBy(xpath="//*[@class='alert alert-success']")
	private WebElement txtalertSuccess;
	
	@FindBy(xpath="//ul/li[@class='facebook']")
	private WebElement facebookLink;
	
	@FindBy(xpath="//ul/li[@class='twitter']")
	private WebElement twitterLink;
	
	@FindBy(xpath="//ul/li[@class='youtube']")
	private WebElement youtubeLink;
	
	@FindBy(xpath="//ul/li[@class='google-plus']")
	private WebElement googleplusLink;
	
	@FindBy(xpath = "//*/a[text()='Selenium Framework']")
	private WebElement SeleniumFacebookHeader;
	
	@FindBy(xpath = "//*[@id='channel-title']")
	private WebElement SeleniumYoutubeHeader;

	//@FindBy(xpath = "//*/a[text()='Selenium Framework']")
	//private WebElement SeleniumHeader;
	
	//@FindBy(xpath = "//*/a[text()='Selenium Framework']")
	//private WebElement SeleniumHeader;
	
	@FindBy(xpath="//*[@id='homefeatured']/li[1]//a[@class='product-name']")
	private WebElement FirstTshirtProduct;
	
/*
	@FindBy(xpath="//*[@class='btn btn-default btn-twitter']")
	private WebElement ProductpageTwitterbutton;
	
	@FindBy(xpath="//*[@class='btn btn-default btn-facebook']")
	private WebElement ProductpageFacebookbutton;
	
	@FindBy(xpath="//*[@class='btn btn-default btn-google-plus']")
	private WebElement ProductpageGooglePlusbutton;
	
	@FindBy(xpath="//*[@class='btn btn-default btn-pinterest']")
	private WebElement ProductpagePinterestbutton;
	
*/
	public HomePageObject() {
		PageFactory.initElements(driver,this);
	}

	public void clickWomen() {
		Womentab.click();
	}
	
	public void clickDresses() {
		Dressestab.click();
	}
	
	public void clickTshirts() {
		Tshirtstab.click();
	}
	
	public void clickLogoPage() {
		LogoPage.click();
	}
	
	public WebElement Dressestabenabled(){
		return Dressestab;
	}

	public WebElement Womentabenabled(){
		return Womentab;
	}

	public WebElement Tshirtstabenabled(){
		return Tshirtstab;
}

	public void enterEmailinNewsletter(String email){
		setText(txtBoxNewsLetter,email);
		BtnSubmitNewsLeteter.click();
	}
	
	public String getAlert(){
			return txtalertSuccess.getText();
	}
	
	public void clickFacebook() {
		facebookLink.click();
	}
	
	public void clickTwitter() {
		twitterLink.click();
	}
	
	public void clickYoutube() {
		youtubeLink.click();
	}
	
	public void clickGooglePlus() {
		googleplusLink.click();
	}
	
	public String getFacebookPageHeaderText(){
		return SeleniumFacebookHeader.getText();
	}
	
	public String getYoutubePageHeaderText(){
		return SeleniumYoutubeHeader.getText();
	}
	
	public void getFirstProductClick() {
		FirstTshirtProduct.click();	
	}
/*
	public WebElement getTwitterButton() {
		return ProductpageTwitterbutton;
	}
	
	public WebElement getFacebookButton() {
		return ProductpageFacebookbutton;
	}
	
	public WebElement getGooglePlusButton() {
		return ProductpageGooglePlusbutton;
	}
	
	public WebElement getPinterestButton() {
		return ProductpagePinterestbutton;
	}
*/

}



