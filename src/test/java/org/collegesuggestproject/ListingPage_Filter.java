package org.collegesuggestproject;

import org.pageobjectmodel.BaseClass;
import org.pageobjectmodel.ListingPageObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ListingPage_Filter extends BaseClass {
	
	ListingPageObject listingPage;

	@BeforeClass
	public void setup() {
		playwright = Playwright.create();
		browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080));
		page = context.newPage();
		page.navigate("https://staging.collegesuggest.com/");
		page.hover("//*[@id='engineering-colleges-menu-button']");
		page.click("//*[@id=\"engineering-colleges-menu\"]/li[1]");
		
		listingPage = new ListingPageObject(page);

	}

	@Test(priority = 1)
	public void verifyFilterTextIsPresent() {

		listingPage.verifyFilterHeading();

	}

	@Test(priority = 2)
	public void verifyStateTextIsPresent() {

		listingPage.verifyStateHeading();

	}

	@Test(priority = 3)
	public void verifyCityTextIsPresent() {

		listingPage.verifyCityHeading();

	}

	@Test(priority = 4)
	public void verifyOwnershipTextIsPresent() {

		listingPage.verifyOwnershipHeading();

	}

	@Test(priority = 5)
	public void verifyCategoryTextIsPresent() {

		listingPage.verifyCategoryHeading();

	}

	@Test(priority = 6)
	public void verifyCourseTextIsPresent() {

		listingPage.verifyCourseHeading();

	}

	@Test(priority = 7)

	public void clickOnStateFilterTamilnadu() {
		Locator state = page.locator("//div[@id='statebh-header']");
		state.click();
		page.click("//input[@value='Tamil Nadu']");
		Locator tamilnadu = page
				.locator("//*[@id=\"__next\"]/div/main/div/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[1]/div");
		assertThat(tamilnadu).hasText("Tamil Nadu");
		state.click();
	}

	@Test(priority = 8)

	public void clickOnCityFilterChennai() {
		Locator city = page.locator("//div[@id='citybh-header']");
		city.click();
		page.click("//input[@value='Chennai']");
		Locator chennai = page.locator("//div[contains(text(),'Chennai')]");
		assertThat(chennai).hasText("Chennai");
		city.click();
	}

	@Test(priority = 9)

	public void clickOnOwnershipFilterGoverment() {
		Locator ownership = page.locator("//div[@id='ownershipbh-header']");
		ownership.click();
		page.click("//input[@value='Government']");
		Locator goverment = page.locator("//div[@class='MuiBox-root css-t8mseu'][normalize-space()='Government']");
		assertThat(goverment).hasText("Government");
		ownership.click();
	}

	@Test(priority = 10)

	public void clickOnCategoryFilterIIT() {
		Locator category = page.locator("//div[@id='categorybh-header']");
		category.click();
		page.click("//input[@value='IIT']");
		Locator iit = page.locator("//div[contains(text(),'IIT')]");
		assertThat(iit).hasText("IIT");
		category.click();
	}

	@Test(priority = 11)

	public void clickOnCourseFilterIIT() {
		Locator course = page.locator("//div[@id='coursebh-header']");
		course.click();
		page.click("//input[@value='MECHANICAL ENGINEERING']");
		Locator mech = page.locator("//div[contains(text(),'MECHANICAL ENGINEERING')]");
		assertThat(mech).hasText("MECHANICAL ENGINEERING");
		course.click();
	}

}
