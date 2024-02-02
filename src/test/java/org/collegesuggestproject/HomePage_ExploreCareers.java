package org.collegesuggestproject;

import org.pageobjectmodel.BaseClass;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomePage_ExploreCareers extends BaseClass {

	// Verify the presence of the 'Explore Careers' section heading.
	@Test(priority = 1)

	public void cs_Verify_ExploreCareersSection_Heading_Is_Present_0001() {

		Locator ExploreCareersSectionheader = page.locator("//h2[text()='Explore Careers']");
		assertThat(ExploreCareersSectionheader).hasText("Explore Careers");

	}

	// Verify the presence of the 'Top Colleges in India' heading.

	@Test(priority = 2)

	public void cs_Verify_TopCollegeInIndia_Heading_Is_Present_0002() {

		Locator TopCollegeInIndiaheader = page.locator("//p[text()='Top Colleges in India']");
		assertThat(TopCollegeInIndiaheader).hasText("Top Colleges in India");

	}

	// Verify the presence of the 'Top Places In India to study' heading.

	@Test(priority = 3)

	public void cs_Verify_TopPlacesInIndiaToStudy_Heading_Is_Present_0003() throws InterruptedException {
		Locator TopPlacesInIndiaToStudyheader = page.locator("//p[text()='Top Places In India to study']");
		assertThat(TopPlacesInIndiaToStudyheader).hasText("Top Places In India to study");

	}

	// Verify the presence of the 'Top Courses to study' heading.

	@Test(priority = 4)

	public void cs_Verify_TopCoursesToStudy_Heading_Is_Present_0004() throws InterruptedException {

		Locator TopCoursesToStudyheader = page.locator("//p[text()='Top Courses to study']");
		assertThat(TopCoursesToStudyheader).hasText("Top Courses to study");

	}

	@Test(priority = 5)

	public void click_On_TopCollegesinIndia_0005() {
		page.click("//a[text()='Top Engineering colleges']");

		Locator TopEngineeringCollegesinIndiaheader = page
				.locator("//p[text()='Top Engineering Colleges in India']");
		assertThat(TopEngineeringCollegesinIndiaheader).hasText("Top Engineering Colleges in India");

		page.goBack();
	}

	@Test(priority = 6)

	public void click_On_TopPlacesInIndiatostudy_0006() {
		page.click("//a[text()='Coimbatore']");

		Locator TopEngineeringCollegesinCoimbatoreheader = page
				.locator("//p[text()='Top Engineering Colleges in Coimbatore']");
		assertThat(TopEngineeringCollegesinCoimbatoreheader).hasText("Top Engineering Colleges in Coimbatore");

		page.goBack();
	}

	@Test(priority = 7)

	public void click_On_TopCoursestostudy_0007() {
		page.click("//a[text()='ECE']");

		Locator TopEngineeringCollegesinECEheader = page
				.locator("//p[text()='Top Engineering Colleges in ECE']");
		assertThat(TopEngineeringCollegesinECEheader).hasText("Top Engineering Colleges in ECE");

		page.goBack();
	}

}
