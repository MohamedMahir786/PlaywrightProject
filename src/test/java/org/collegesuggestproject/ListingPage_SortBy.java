package org.collegesuggestproject;

import org.pageobjectmodel.BaseClass;
import org.pageobjectmodel.HomePageObject;
import org.pageobjectmodel.ListingPageObject;
import org.testng.annotations.Test;

public class ListingPage_SortBy extends BaseClass {

	HomePageObject homePage;
	ListingPageObject listingPage;

	@Test(priority = 0)
	public void setup1() {


		page.hover("//*[@id='engineering-colleges-menu-button']");
		page.click("//*[@id=\"engineering-colleges-menu\"]/li[1]");

		homePage = new HomePageObject(page);
		listingPage = new ListingPageObject(page);

	}

	@Test(priority = 1)

	public void verifySortByTextIsPresent() {

		listingPage.verifySortByHeading();
	}

	@Test(priority = 2)

	public void clickOnCampus() {

		listingPage.clickOnCampusSortBy();
	}

	@Test(priority = 3)

	public void clickOnFees() {
		listingPage.clickOnFeesSortBy();
	}

	@Test(priority = 4)

	public void clickOnMedianSalary() {
		listingPage.clickOnMedianSalarySortBy();
	}

	@Test(priority = 5)

	public void clickOnPlacement() {
		listingPage.clickOnPlacementSortBy();
	}

	@Test(priority = 6)

	public void clickOnNirfRank() {
		listingPage.clickOnNirfRankSortBy();
	}

	@Test(priority = 7)

	public void typeOnSearchbox() {


		listingPage.enterOnSearchbox();
	}

	@Test(priority = 8)

	public void clickOnIITMadras() {

		listingPage.clickOnOnIITMadras();

	}

}
