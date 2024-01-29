package org.collegesuggestproject;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.nio.file.Paths;

import org.pageobjectmodel.BaseClass;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;

public class HomePage_HeaderSection extends BaseClass {           
	
	@Test(priority = 1)

	public void navigateToGftiCollegeOfEngineering() {

		Locator header = page.locator("//*[@id=\"__next\"]/div/header");
		header.screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("./snaps/region.png")));
		page.locator("//*[@id='engineering-colleges-menu-button']").hover();
		page.click("//li[@role='menuitem']//a[contains(text(),'Top 10 GFTI Colleges in india')]");
		assertThat(page).hasTitle("Top 10 GFTI Engineering Colleges In India | College Suggest");
		System.out.println("Top 10 GFTI Engineering Colleges In India | College Suggest");
		page.goBack();
	}

	@Test(priority = 2)

	public void navigateToPrivateCollegeOfMedical() {
		page.locator("//*[@id='medical-colleges-menu-button']").hover();
		page.click("//li[@role='menuitem']//a[contains(text(),'Top 10 Private Colleges in india')]");
		assertThat(page).hasTitle("Top 10 Private Medical Colleges in India | College Suggest");
		page.click("//*[text()='Home']");
	}

	@Test(priority = 3)

	public void navigateToPrivateCollegeOfDental() {
		page.locator("//*[@id='dental-colleges-menu-button']").hover();
		page.click("//li[@role='menuitem']//a[contains(text(),'Top 10 Private Colleges in india')]");
		assertThat(page).hasTitle("Top 10 Private Dental Colleges in India | College Suggest");
		page.goBack();
	}

	@Test(priority = 4)

	public void navigateToNitCollegeOfArchitecture() {
		page.locator("//*[@id='architecture-colleges-menu-button']").hover();
		page.click("//li[@role='menuitem']//a[contains(text(),'Top 10 NIT Colleges in india')]");
		assertThat(page).hasTitle("Top 10 NIT Architecture Colleges in India | College Suggest");
		page.goBack(); 
	}

	@Test(priority = 5)

	public void navigateToNitCollegeOfPharmacy() {

		page.locator("//*[@id='pharmacy-colleges-menu-button']").hover();
		page.click("//li[@role='menuitem']//a[contains(text(),'Top 10 Private Colleges in india')]");
		assertThat(page).hasTitle("Top 10 Private Pharmacy Colleges in India | College Suggest");
		page.goBack();

	}

}
