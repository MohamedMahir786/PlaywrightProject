package org.collegesuggestproject;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.pageobjectmodel.BaseClass;
import org.testng.annotations.Test;

public class ExploreByStream extends BaseClass {

	@Test(priority = 1)

	public void Verify_ExploreByStream_Engineering_Is_Clickable() {
		page.click("(//a[@class='css-1i8t417'][normalize-space()='Engineering'])[1]");
		assertThat(page).hasTitle("Top Engineering Colleges in India | College Suggest");                      
		page.goBack();
	}

	@Test(priority = 2)

	public void Verify_ExploreByStream_Medical_Is_Clickable() {
		page.click("(//a[@class='css-1i8t417'][normalize-space()='Medical'])[1]");
		assertThat(page).hasTitle("Top Medical Colleges in India | College Suggest");
		page.goBack();
	}                                

	@Test(priority = 3)

	public void Verify_ExploreByStream_Dental_Is_Clickable() {
		page.click("(//a[@class='css-1i8t417'][normalize-space()='Dental'])[1]");
		assertThat(page).hasTitle("Top Dental Colleges in India | College Suggest");
		page.goBack();
	}

	@Test(priority = 4)

	public void Verify_ExploreByStream_Architecture_Is_Clickable() {
		page.click("(//a[@class='css-1i8t417'][normalize-space()='Architecture'])[1]");
		assertThat(page).hasTitle("Top Architecture Colleges in India | College Suggest");
		page.goBack();
	}

	@Test(priority = 5)

	public void Verify_ExploreByStream_Pharmacy_Is_Clickable() {
		page.click("(//a[@class='css-1i8t417'][normalize-space()='Pharmacy'])[1]");
		assertThat(page).hasTitle("Top Pharmacy Colleges in India | College Suggest");
		page.goBack();
	}

}
