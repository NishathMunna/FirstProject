package AutomationPageTests;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import AutomationPageObjects.BasePage;
import AutomationPageObjects.DressesPageObject;
import AutomationPageObjects.HomePageObject;
import AutomationPageObjects.TshirtsPageObject;
import AutomationPageObjects.WomenPageObject;

public class HomePageTest {

	HomePageObject hp;
	BasePage bp;
	WomenPageObject wp;
	DressesPageObject dp;
	TshirtsPageObject tp;
	
	int num = new Random().nextInt(50000);
	
	

	public HomePageTest() {
		hp = new HomePageObject();
		bp = new BasePage();
		wp = new WomenPageObject();
		dp = new DressesPageObject();
		tp = new TshirtsPageObject();
	}

	@Test
	public void verifytestnavigation() {

		hp.clickWomen();
		System.out.println(wp.getheaderText());
		Assert.assertTrue(wp.getheaderText().trim().equals("WOMEN"),"Dresses Page Not Found");
		
		hp.clickDresses();
		System.out.println(dp.getheaderText().getText());
		Assert.assertTrue(dp.getheaderText().getText().trim().equals("DRESSES"),"Dresses Page Not Found");
		
		hp.clickTshirts();
		System.out.println(tp.getheaderText().getText());
		Assert.assertTrue(tp.getheaderText().getText().trim().equals("T-SHIRTS"),"Tshirts Page Not Found");
		
		hp.clickLogoPage();
	}

	@Test
	public void verifytabs() {
		Assert.assertTrue(hp.Dressestabenabled().isDisplayed(), "The Dresses tab is not Displayed");
		Assert.assertTrue(hp.Tshirtstabenabled().isDisplayed(), "The Tshirt tab is not Displayed");
		Assert.assertTrue(hp.Womentabenabled().isDisplayed(), "The Womens tab is not Displayed");
	}
	
	@Test
	public void Verifynewsletter() {
		String email = "TestAutomationNish" + num + "@gmail.com";
		hp.enterEmailinNewsletter(email);
		String alertMessage = hp.getAlert();
		Assert.assertTrue(alertMessage.contains("Newsletter : You have successfully subscribed to this newsletter."),
				"Failed: Subcription not success");
	}
	
	@Test
	public void VerifySocialMediaLinks() {
		hp.clickFacebook();
		System.out.println(hp.getFacebookPageHeaderText());
		Assert.assertTrue(hp.getFacebookPageHeaderText().trim().contains("Selenium Framework"));
		
		//hp.clickTwitter();
		//System.out.println(hp.getGooglePageHeaderText());
		//Assert.assertTrue(hp.getGooglePageHeaderText().trim().contains("Selenium Framework"));
	
		//hp.clickYoutube();
		//System.out.println(hp.getYoutubePageHeaderText());
		//Assert.assertTrue(hp.getYoutubePageHeaderText().trim().contains("Selenium Framework"));
		
		/*
		System.out.println(hp.getSeleniumheaderText());
		Assert.assertTrue(hp.getSeleniumheaderText().trim().contains("Selenium Framework"));
		
		hp.clickGooglePlus();
		System.out.println(hp.getGooglePageHeaderText());
		Assert.assertTrue(hp.getGooglePageHeaderText().trim().contains("Selenium Framework"));
		*/
	}
	/*
	@Test
	public void VerifySocialMediaLinkisDisplayed() {
		hp.getFirstProductClick();
		
		Assert.assertTrue(hp.getTwitterButton().isDisplayed());
		Assert.assertTrue(hp.getFacebookButton().isDisplayed());
		Assert.assertTrue(hp.getGooglePlusButton().isDisplayed());
		Assert.assertTrue(hp.getPinterestButton().isDisplayed());
		
	}
*/
		}



