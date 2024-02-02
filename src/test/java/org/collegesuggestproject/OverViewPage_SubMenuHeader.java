package org.collegesuggestproject;

import org.pageobjectmodel.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class OverViewPage_SubMenuHeader extends BaseClass {

	@BeforeClass
	public void setup() {
		playwright = Playwright.create();
		browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080));
		page = context.newPage();
		page.navigate("https://staging.collegesuggest.com/");
		page.hover("//*[@id='engineering-colleges-menu-button']");
		page.click("//*[@id=\"engineering-colleges-menu\"]/li[1]");

	}

	@Test(priority = 1)

	public void verifyTheOverview() {

	 
		
	}

}
