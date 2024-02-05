package org.collegesuggestproject;

import org.pageobjectmodel.BaseClass;
import org.pageobjectmodel.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_FooterSection extends BaseClass {

	HomePageObject homePage;

	@Test(priority = 1)
	public void cs_Verify_EngineeringSection_In_Footer_Is_Present_0001() throws InterruptedException {

		homePage = new HomePageObject(page);

		homePage.verifyEngineeringFooterHeading();
	}

	// Verify if the 'Architecture' section in the footer is present.

	@Test(priority = 2)
	public void cs_Verify_ArchitectureSection_In_Footer_Is_Present_0002() throws InterruptedException {

		homePage.verifyArchitectureFooter();
	}

	// Verify if the 'Medical' section in the footer is present.

	@Test(priority = 3)
	public void cs_Verify_MedicalSection_In_Footer_Is_Present_0003() throws InterruptedException {

		homePage.verifyMedicalFooter();

	}

	// Verify if the 'Dental' section in the footer is present.

	@Test(priority = 4)
	public void cs_Verify_DentalSection_In_Footer_Is_Present_0004() throws InterruptedException {

		homePage.verifyDentalFooter();

	}

	// Verify if the 'Pharmacy' section in the footer is present.

	@Test(priority = 5)
	public void cs_Verify_PharmacySection_In_Footer_Is_Present_0005() throws InterruptedException {

		homePage.verifyPharmacyFooter();

	}

	// Verify if the 'OtherLinks' section in the footer is present.

	@Test(priority = 7)
	public void cs_Verify_OtherLinksSection_In_Footer_Is_Present_0007() throws InterruptedException {

		homePage.verifyOtherLinksFooter();

	}

	// Verify if the 'FollowUs' section in the footer is present.

	@Test(priority = 8)
	public void cs_Verify_FollowUsSection_In_Footer_Is_Present_0008() throws InterruptedException {

		homePage.verifyFollowUsFooter();

	}

	@Test(priority = 9)

	public void click_On_IIITCollegeInIndia_Of_Engineering_0009() {

		homePage.clickOnIIITCollegeInIndiaOfEngineering();
	}

	@Test(priority = 10)

	public void click_On_NITCollegeInIndia_Of_ARCHITECTURE_0010() {

		homePage.clickOnNITCollegeInIndiaOfArchitecture();

	}

	@Test(priority = 11)

	public void click_On_GovermentCollegesInIndia_Of_Medical_0011() {

		homePage.clickOnGovermentCollegesInIndiaOfMedical();

	}

	@Test(priority = 12)

	public void click_On_PrivateCollegesInIndia_Of_Dental_0012() {

		homePage.clickOnPrivateCollegesInIndiaOfDental();
	}

	@Test(priority = 13)

	public void click_On_PharmacyCollegesinIndia_0013() {

		homePage.clickOnPharmacyCollegesinIndia();

	}

}
