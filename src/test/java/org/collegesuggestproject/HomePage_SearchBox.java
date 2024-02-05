package org.collegesuggestproject;

import org.pageobjectmodel.BaseClass;
import org.pageobjectmodel.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_SearchBox extends BaseClass {
	HomePageObject homePage;

	@Test(priority = 0)

	public void verifyTheMainHeadingOfSearchBox() {
		homePage = new HomePageObject(page);
		homePage.verifyTheMainHeadingOfSearchBox();
	}

	@Test(priority = 1)

	public void enterCollegeNameAndTakeScreenShot() {

		homePage.enterCollegeNameAndTakeScreenShot();

	}

	@Test(priority = 3)

	public void clickOnMahindraUniversity() {

		homePage.clickOnMahindraUniversity();
	}

	@Test(priority = 2)

	public void verifyBannerSectionOfSearchBox() {
		homePage.verifyBannerSectionOfSearchBox();
	}
}
