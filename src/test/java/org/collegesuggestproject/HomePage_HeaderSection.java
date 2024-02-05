package org.collegesuggestproject;

import java.nio.file.Paths;

import org.pageobjectmodel.BaseClass;
import org.pageobjectmodel.HomePageObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Playwright;

public class HomePage_HeaderSection extends BaseClass {

	HomePageObject homePage;

	@BeforeClass
	public void setup() {
		playwright = Playwright.create();
		browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080)
				.setRecordVideoDir(Paths.get("vedios/")).setRecordVideoSize(1280, 720));
		page = context.newPage();
		page.navigate("https://staging.collegesuggest.com/");
		homePage = new HomePageObject(page);

	}

	@Test(priority = 2)

	public void verifyAllTheTextOfEngineeringDropdown() {
		homePage.verifyAllTheTextOfEngineeringDropdown();
	}

	@Test(priority = 6)

	public void navigateToGftiCollegeOfEngineering() {

		homePage.clickOnGftiEngineeringCollege();

	}

	@Test(priority = 7)

	public void navigateToPrivateCollegeOfMedical() {

		homePage.clickOnPrivateCollegeOfMedical();
	}

	@Test(priority = 8)

	public void navigateToPrivateCollegeOfDental() {
		homePage.clickOnPrivateCollegeOfDental();
	}

	@Test(priority = 9)

	public void navigateToNitCollegeOfArchitecture() {
		homePage.clickOnNitCollegeOfArchitecture();
	}

	@Test(priority = 10)

	public void navigateToNitCollegeOfPharmacy() {

		homePage.clickOnNitCollegeOfPharmacy();
	}

	@Test(priority = 11)

	public void verifyAllTheHeaderCollegesIsClickable() {

		homePage.clickAllTheHeaderColleges();
	}

}
