package debugging;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Header {

	private static Browser browser;
	private static Page page;

	public static void main(String[] args) {
		setUp();
		navigateToGftiCollegeOfEngineering();
		navigateToPrivateCollegeOfMedical();
		navigateToPrivateCollegeOfDental();
		navigateToNitCollegeOfArchitecture();
		navigateToNitCollegeOfPharmacy();

		// Close the browser when done
		page.close();
		browser.close();
	}

	private static void setUp() {
		Playwright playwright = Playwright.create();
		browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));

		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080));
		page = context.newPage();
		page.navigate("https://staging.collegesuggest.com/");
	}

	private static void navigateToGftiCollegeOfEngineering() {
		page.pause();

		Locator header = page.locator("//*[@id=\"__next\"]/div/header");
		header.screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("./snaps/region.png")));
		page.locator("//*[@id='engineering-colleges-menu-button']").hover();
		page.click("//li[@role='menuitem']//a[contains(text(),'Top 10 GFTI Colleges in india')]");
		assertThat(page).hasTitle("Top 10 GFTI Engineering Colleges In India | College Suggest");
		System.out.println("Top 10 GFTI Engineering Colleges In India | College Suggest" + "");
		page.goBack();
	}

	private static void navigateToPrivateCollegeOfMedical() {
		page.locator("//*[@id='medical-colleges-menu-button']").hover();
		page.click("//li[@role='menuitem']//a[contains(text(),'Top 10 Private Colleges in india')]");
		assertThat(page).hasTitle("Top 10 Private Medical Colleges in India | College Suggest");
		page.click("//*[text()='Home']");
	}

	private static void navigateToPrivateCollegeOfDental() {
		page.locator("//*[@id='dental-colleges-menu-button']").hover();
		page.click("//li[@role='menuitem']//a[contains(text(),'Top 10 Private Colleges in india')]");
		assertThat(page).hasTitle("Top 10 Private Dental Colleges in India | College Suggest");
		page.goBack();

	}

	private static void navigateToNitCollegeOfArchitecture() {
		page.locator("//*[@id='architecture-colleges-menu-button']").hover();
		page.click("//li[@role='menuitem']//a[contains(text(),'Top 10 NIT Colleges in india')]");
		assertThat(page).hasTitle("Top 10 NIT Architecture Colleges in India | College Suggest");
		page.goBack();
	}

	private static void navigateToNitCollegeOfPharmacy() {
		page.locator("//*[@id='pharmacy-colleges-menu-button']").hover();
		page.click("//li[@role='menuitem']//a[contains(text(),'Top 10 Private Colleges in india')]");
		assertThat(page).hasTitle("Top 10 Private Pharmacy Colleges in India | College Suggest");
		page.goBack();
	}

}
