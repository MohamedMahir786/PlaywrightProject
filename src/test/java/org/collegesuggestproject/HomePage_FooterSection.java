package org.collegesuggestproject;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.pageobjectmodel.BaseClass;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;

public class HomePage_FooterSection extends BaseClass {

	@Test(priority = 1)
	public void cs_Verify_EngineeringSection_In_Footer_Is_Present_0001() throws InterruptedException {
		Locator Verify_EngineeringSection_In_Footer_Is_Present = page.locator("//div[normalize-space()='Engineering']");
		assertThat(Verify_EngineeringSection_In_Footer_Is_Present).hasText("Engineering");
	}

	// Verify if the 'Architecture' section in the footer is present.

	@Test(priority = 2)
	public void cs_Verify_ArchitectureSection_In_Footer_Is_Present_0002() throws InterruptedException {
		Locator Verify_ArchitectureSection_In_Footer_Is_Present = page
				.locator("//div[normalize-space()='Architecture']");
		assertThat(Verify_ArchitectureSection_In_Footer_Is_Present).hasText("Architecture");
	}

	// Verify if the 'Medical' section in the footer is present.

	@Test(priority = 3)
	public void cs_Verify_MedicalSection_In_Footer_Is_Present_0003() throws InterruptedException {
		Locator Verify_MedicalSection_In_Footer_Is_Present = page.locator("//div[normalize-space()='Medical']");
		assertThat(Verify_MedicalSection_In_Footer_Is_Present).hasText("Medical");

	}

	// Verify if the 'Dental' section in the footer is present.

	@Test(priority = 4)
	public void cs_Verify_DentalSection_In_Footer_Is_Present_0004() throws InterruptedException {

		Locator Verify_MedicalSection_In_Footer_Is_Present = page.locator("//div[normalize-space()='Dental']");
		assertThat(Verify_MedicalSection_In_Footer_Is_Present).hasText("Dental");

	}

	// Verify if the 'Pharmacy' section in the footer is present.

	@Test(priority = 5)
	public void cs_Verify_PharmacySection_In_Footer_Is_Present_0005() throws InterruptedException {

		Locator Verify_PharmacySection_In_Footer_Is_Present = page.locator("//div[normalize-space()='Pharmacy']");
		assertThat(Verify_PharmacySection_In_Footer_Is_Present).hasText("Pharmacy");

	}

	// Verify if the 'OtherLinks' section in the footer is present.

	@Test(priority = 7)
	public void cs_Verify_OtherLinksSection_In_Footer_Is_Present_0007() throws InterruptedException {

		Locator Verify_OtherLinksSection_In_Footer_Is_Present = page.locator("//div[normalize-space()='Other Links']");
		assertThat(Verify_OtherLinksSection_In_Footer_Is_Present).hasText("Other Links");

	}

	// Verify if the 'FollowUs' section in the footer is present.

	@Test(priority = 8)
	public void cs_Verify_FollowUsSection_In_Footer_Is_Present_0008() throws InterruptedException {

		Locator Verify_FollowUsSection_In_Footer_Is_Present = page.locator("//div[contains(text(),'follow Us')]");
		assertThat(Verify_FollowUsSection_In_Footer_Is_Present).hasText("follow Us");

	}

	@Test(priority = 9)

	public void click_On_IIITCollegeInIndia_0009() {

		page.click("//*[@id=\"__next\"]/div/div[1]/div/div/div[1]/div/div[1]/ul/li[3]/a");

		page.goBack();
	}

	@Test(priority = 10)

	public void click_On_NITCollegeInIndia_Of_ARCHITECTURE_0010() {

		page.click("//*[@id=\"__next\"]/div/div[1]/div/div/div[1]/div/div[2]/ul/li[2]/a");

		page.goBack();

	}

	@Test(priority = 11)

	public void click_On_GovermentCollegesInIndia_Of_Medical_0011() {

		page.click("//*[@id=\"__next\"]/div/div[1]/div/div/div[2]/div/div[1]/ul/li[1]/a");

		page.goBack();

	}

	@Test(priority = 12)

	public void click_On_PrivateCollegesInIndia_Of_Dental_0012() {

		page.click("//*[@id=\"__next\"]/div/div[1]/div/div/div[2]/div/div[2]/ul/li[2]/a");

		page.goBack();

	}

	@Test(priority = 13)

	public void click_On_PharmacyCollegesinIndia_0013() {

		page.click("//*[@id=\"__next\"]/div/div[1]/div/div/div[2]/div/div[3]/ul/li[3]/a");

		page.goBack();

	}

}
