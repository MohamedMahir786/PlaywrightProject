package org.collegesuggestproject;

import org.pageobjectmodel.BaseClass;
import org.pageobjectmodel.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_ExploreCareers extends BaseClass {

	HomePageObject homePage;

	// Verify the presence of the 'Explore Careers' section heading.
	@Test(priority = 1)

	public void cs_Verify_ExploreCareersSection_Heading_Is_Present_0001() {
		homePage = new HomePageObject(page);

		homePage.verifyExploreCareerHeading();

	}

	// Verify the presence of the 'Top Colleges in India' heading.

	@Test(priority = 2)

	public void cs_Verify_TopCollegeInIndia_Heading_Is_Present_0002() {

		homePage.verifyTopCollegeInIndiaheading();

	}

	// Verify the presence of the 'Top Places In India to study' heading.

	@Test(priority = 3)

	public void cs_Verify_TopPlacesInIndiaToStudy_Heading_Is_Present_0003() throws InterruptedException {

		homePage.verifyTopPlacesInIndiaToStudyheading();
	}

	// Verify the presence of the 'Top Courses to study' heading.

	@Test(priority = 4)

	public void cs_Verify_TopCoursesToStudy_Heading_Is_Present_0004() throws InterruptedException {

		homePage.verifyTopCoursesToStudyheading();

	}

	@Test(priority = 5)

	public void click_On_TopCollegesinIndia_0005() {
		homePage.clickOnTopEngineeringCollegesInIndia();
	}

	@Test(priority = 6)

	public void click_On_TopPlacesInIndiatostudy_0006() {
		homePage.clickOnTopPlacesInIndiatostudyCoimbatore();
	}

	@Test(priority = 7)

	public void click_On_TopCoursestostudy_0007() {
		homePage.clickOnTopCoursestostudyEce();
	}

}
