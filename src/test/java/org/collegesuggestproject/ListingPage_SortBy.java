package org.collegesuggestproject;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.pageobjectmodel.BaseClass;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;

public class ListingPage_SortBy extends BaseClass {

	@Test(priority = 0)
	public void setup1() {
//		playwright = Playwright.create();
//		browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
//		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080));
//		page = context.newPage();
//		page.navigate("https://staging.collegesuggest.com/");
		
		page.hover("//*[@id='engineering-colleges-menu-button']");
		page.click("//*[@id=\"engineering-colleges-menu\"]/li[1]");

	}

	@Test(priority = 1)

	public void verifySortByTextIsPresent() {
		Locator SortByHeading = page.locator("//p[text()='Sort By']");
		assertThat(SortByHeading).hasText("Sort By");
	}

	@Test(priority = 2)

	public void clickOnCampus() {
		page.click("//div[normalize-space()='NIRF RANK']");
		page.click("//li[normalize-space()='CAMPUS']");
		Locator campus = page.locator("[aria-haspopup='listbox']");
		assertThat(campus).hasText("CAMPUS");
	}

	@Test(priority = 3)

	public void clickOnFees() {
		page.click("//div[normalize-space()='CAMPUS']");
		Locator fees = page.locator("//li[normalize-space()='FEES']");
		fees.click();
		assertThat(fees).hasText("FEES");
	}

	@Test(priority = 4)

	public void clickOnMedianSalary() {
		page.click("//div[normalize-space()='FEES']");

		Locator medianSalary = page.locator("//li[normalize-space()='MEDIAN SALARY']");
		medianSalary.click();
		assertThat(medianSalary).hasText("MEDIAN SALARY");
	}

	@Test(priority = 5)

	public void clickOnPlacement() {
		page.click("//div[normalize-space()='MEDIAN SALARY']");
		Locator placement = page.locator("//li[normalize-space()='PLACEMENT']");
		placement.click();
		assertThat(placement).hasText("PLACEMENT");
	}

	@Test(priority = 6)

	public void clickOnNirfRank() {
		page.click("//div[normalize-space()='PLACEMENT']");
		Locator placement = page.locator("//li[normalize-space()='NIRF RANK']");
		placement.click();
		assertThat(placement).hasText("NIRF RANK");
	}

	@Test(priority = 7)

	public void typeOnSearchbox() {
		Locator searchBox = page.locator("[placeholder='Search Your College']");
		searchBox.fill("IITM");
		page.click("(//li[text()='Indian Institute of Technology Madras'])[1]");
		Locator iiitMadras = page.locator("[class='css-1cgsgxp']");
		assertThat(iiitMadras).hasText("Indian Institute of Technology Madras");
	}

	@Test(priority = 8)

	public void clickOnIITMadras() {
		page.click("[class='css-1cgsgxp']");

		Locator iitBanner = page.locator("(//p[text()='Indian Institute of Technology Madras'])[1]");
		assertThat(iitBanner).hasText("Indian Institute of Technology Madras");

	}

}
