package org.pageobjectmodel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class BaseClass {
	public Browser browser;
	public Page page;
	public Playwright playwright;
	public BrowserContext browserContext;

	@BeforeClass
	public void setup() {
		playwright = Playwright.create();
		browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080));
		page = context.newPage();
		page.navigate("https://staging.collegesuggest.com/");

	}

	@AfterClass
	public void teardown() {
		browser.close();
		page.close();

	}

}
