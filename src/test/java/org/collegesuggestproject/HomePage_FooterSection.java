package org.collegesuggestproject;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.pageobjectmodel.BaseClass;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;

public class HomePage_FooterSection extends BaseClass {

	@Test(priority = 1)
	public void cs_Verify_EngineeringSection_In_Footer_Is_Present_0001() throws InterruptedException {
		Locator Verify_EngineeringSection_In_Footer_Is_Present = page.locator("(//div[text()='Engineering'])");
		assertThat(Verify_EngineeringSection_In_Footer_Is_Present).hasText("Engineering");
	}

	// Verify if the 'Architecture' section in the footer is present.

	@Test(priority = 2)
	public void cs_Verify_ArchitectureSection_In_Footer_Is_Present_0002() throws InterruptedException {
		Locator Verify_ArchitectureSection_In_Footer_Is_Present = page
				.locator("//div[text()='Architecture']");
		assertThat(Verify_ArchitectureSection_In_Footer_Is_Present).hasText("Architecture");
	}

	// Verify if the 'Medical' section in the footer is present.

	@Test(priority = 3)
	public void cs_Verify_MedicalSection_In_Footer_Is_Present_0003() throws InterruptedException {
		Locator Verify_MedicalSection_In_Footer_Is_Present = page.locator("//div[text()='Medical']");
		assertThat(Verify_MedicalSection_In_Footer_Is_Present).hasText("Medical");

	}

	// Verify if the 'Dental' section in the footer is present.

	@Test(priority = 4)
	public void cs_Verify_DentalSection_In_Footer_Is_Present_0004() throws InterruptedException {

		Locator Verify_MedicalSection_In_Footer_Is_Present = page.locator("//div[text()='Dental']");
		assertThat(Verify_MedicalSection_In_Footer_Is_Present).hasText("Dental");

	}

	// Verify if the 'Pharmacy' section in the footer is present.

	@Test(priority = 5)
	public void cs_Verify_PharmacySection_In_Footer_Is_Present_0005() throws InterruptedException {

		Locator Verify_PharmacySection_In_Footer_Is_Present = page.locator("//div[text()='Pharmacy']");
		assertThat(Verify_PharmacySection_In_Footer_Is_Present).hasText("Pharmacy");

	}

	// Verify if the 'OtherLinks' section in the footer is present.

	@Test(priority = 7)
	public void cs_Verify_OtherLinksSection_In_Footer_Is_Present_0007() throws InterruptedException {

		Locator Verify_OtherLinksSection_In_Footer_Is_Present = page.locator("//div[text()='Other Links']");
		assertThat(Verify_OtherLinksSection_In_Footer_Is_Present).hasText("Other Links");

	}

	// Verify if the 'FollowUs' section in the footer is present.

	@Test(priority = 8)
	public void cs_Verify_FollowUsSection_In_Footer_Is_Present_0008() throws InterruptedException {

		Locator Verify_FollowUsSection_In_Footer_Is_Present = page.locator("(//div[text()='follow Us'])");
		assertThat(Verify_FollowUsSection_In_Footer_Is_Present).hasText("follow Us");

	}

	@Test(priority = 9)

	public void click_On_IIITCollegeInIndia_Of_Engineering_0009() {

		page.click("//a[text()='Top 10 IIIT Colleges in india']");

		page.goBack();
	}

	@Test(priority = 10)

	public void click_On_NITCollegeInIndia_Of_ARCHITECTURE_0010() {

		page.click("(//a[text()='Top 10 NIT Colleges in india'])[2]");

		page.goBack();

	}

	@Test(priority = 11)

	public void click_On_GovermentCollegesInIndia_Of_Medical_0011() {

		page.click("(//a[text()='Top 10 Government Colleges in india'])[3]");

		page.goBack();

	}

	@Test(priority = 12)

	public void click_On_PrivateCollegesInIndia_Of_Dental_0012() {

		page.click("(//a[text()='Top 10 Private Colleges in india'])[4]");

		page.goBack();

	}

	@Test(priority = 13)

	public void click_On_PharmacyCollegesinIndia_0013() {

		page.click("(//a[text()='Pharmacy Colleges in india'])");

		page.goBack();

	}

}
