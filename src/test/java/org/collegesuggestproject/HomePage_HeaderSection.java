package org.collegesuggestproject;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.nio.file.Paths;

import org.pageobjectmodel.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Playwright;

public class HomePage_HeaderSection extends BaseClass {

	@BeforeClass
	public void setup() {
		playwright = Playwright.create();
		browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080)
				.setRecordVideoDir(Paths.get("vedios/")).setRecordVideoSize(1280, 720));
		page = context.newPage();
		page.navigate("https://staging.collegesuggest.com/");

	}

	     
	    
//	    @Test(priority = 2)
//	    
//	    public void engineering() {
//	    	page.click("(//a[text()='Engineering'])[1]");
//	    String colleges =	page.innerText("//*[@id='engineering-colleges-menu']");
//	    System.out.println("Colleges :" +colleges);
//	    }
	
	@Test(priority = 6)

	public void navigateToGftiCollegeOfEngineering() {

		Locator header = page.locator("//*[@id=\"__next\"]/div/header");
		header.screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("./snaps/region.png")));
		page.locator("(//a[text()='Engineering'])[1]").hover();
		page.click("(//a[text()='Top 10 GFTI Colleges in india'])[1]");
		assertThat(page).hasTitle("Top 10 GFTI Engineering Colleges In India | College Suggest");
		System.out.println("Top 10 GFTI Engineering Colleges In India | College Suggest");
		page.goBack();
	}

	@Test(priority = 7)

	public void navigateToPrivateCollegeOfMedical() {
		page.locator("(//a[text()='Medical'])[1]").hover();
		page.click("(//a[text()='Top 10 Private Colleges in india'])[1]");
		assertThat(page).hasTitle("Top 10 Private Medical Colleges in India | College Suggest");
		page.click("//*[text()='Home']");
	}

	@Test(priority = 8)

	public void navigateToPrivateCollegeOfDental() {
		page.locator("(//a[text()='Dental'])[1]").hover();
		page.click("(//a[text()='Top 10 Private Colleges in india'])[1]");
		assertThat(page).hasTitle("Top 10 Private Dental Colleges in India | College Suggest");
		page.goBack();
	}

	@Test(priority = 9)

	public void navigateToNitCollegeOfArchitecture() {
		page.locator("(//a[text()='Architecture'])[1]").hover();
		page.click("(//a[text()='Top 10 NIT Colleges in india'])[1]");
		assertThat(page).hasTitle("Top 10 NIT Architecture Colleges in India | College Suggest");
		page.goBack();
	}

	@Test(priority = 10)

	public void navigateToNitCollegeOfPharmacy() {

		page.locator("(//a[text()='Pharmacy'])[1]").hover();
		page.click("(//a[text()='Top 10 Private Colleges in india'])[1]");
		assertThat(page).hasTitle("Top 10 Private Pharmacy Colleges in India | College Suggest");
		page.goBack();

	}

}
