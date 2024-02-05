package org.collegesuggestproject;



import org.pageobjectmodel.BaseClass;
import org.pageobjectmodel.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_ExploreByStream extends BaseClass {

	HomePageObject homePage;

	@Test(priority = 1)
	public void Verify_ExploreByStream_Engineering_Is_Clickable() {
		homePage = new HomePageObject(page);
		homePage.verifyAndClickEngineeringCard();
	}

	@Test(priority = 2)
	public void Verify_ExploreByStream_Medical_Is_Clickable() {

		homePage.verifyAndClickMedicalCard();
	}

	@Test(priority = 3)
	public void Verify_ExploreByStream_Dental_Is_Clickable() {

		homePage.verifyAndClickDentalCard();
	}

	@Test(priority = 4)
	public void Verify_ExploreByStream_Architecture_Is_Clickable() {
		homePage.verifyAndClickArchitectureCard();
	}

	@Test(priority = 5)
	public void Verify_ExploreByStream_Pharmacy_Is_Clickable() {
		homePage.verifyAndClickPharmacyCard();
	}

}
