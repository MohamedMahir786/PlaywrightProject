package org.collegesuggestproject;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.nio.file.Paths;

import org.pageobjectmodel.BaseClass;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page.ScreenshotOptions;

public class SearchBox  extends BaseClass {

	
	
	@Test(priority = 1)
	
	public void typeOnSearchBox() {
		
		ScreenshotOptions screenshotOptions = new ScreenshotOptions();
    	Locator input = page.locator("(//input[@id=':r0:'])[1]");
    	input.type("Mahi");
    	page.screenshot(new ScreenshotOptions().setPath(Paths.get("./snaps/full_page.png")));
		
	
		page.click("//a[normalize-space()='Mahindra University']");
		assertThat(page).hasTitle("MU Hyderabad 2022 B.Tech Overview For Courses, Placements & More | College Suggest | College Suggest");
	}

	
	
}
