package org.pageobjectmodel;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ListingPageObject {
	
	
	
	public Page page;
	
	
	//Sort by
	
	String sortByHeading = "//p[text()='Sort By']";
	String nirfRankClick = "//div[normalize-space()='NIRF RANK']";
	String nirfRankVerify = "//li[normalize-space()='NIRF RANK']";
	String campusVerify = "//li[normalize-space()='CAMPUS']";
	String campusClick = "//div[normalize-space()='CAMPUS']";
	String feesVerify = "//li[normalize-space()='FEES']";
	String feesClick = "//div[normalize-space()='FEES']";
	String medianSalaryVerify = "//li[normalize-space()='MEDIAN SALARY']";
	String medianSalaryClick = "//div[normalize-space()='MEDIAN SALARY']";
	String placementVerify = "//li[normalize-space()='PLACEMENT']";
	String placementClick = "//div[normalize-space()='PLACEMENT']";
	
	
	// Sort by - search box
	
	String searchBoxHolder = "[placeholder='Search Your College']";
	
	String iiitMadrasCollege = "(//li[text()='Indian Institute of Technology Madras'])[1]";
	
	String verifyiiitMadrasCollege = "[class='css-1cgsgxp']";
	
	String iitMadrasBanner = "(//p[text()='Indian Institute of Technology Madras'])[1]";
	
	
	
	
	//Filter section - verify heading 
	
	String filter = "//p[contains(text(),'Filter')]";
	String state = "//p[normalize-space()='State']";
	String city = "//p[normalize-space()='City']";
	String ownerShip = "//p[normalize-space()='Ownership']";
	String category = "//p[normalize-space()='Category']";
	String course = "//p[normalize-space()='Course']";
			
	//Filter section - click heading
	
	

	 
//	String stateHeader = 
//	String cityHeader = 
//	String ownerShipHeader = 
//	String categoryHeader =
//	String courseHeader = 
	
	
	
	
	public ListingPageObject(Page page) {
		this.page=page;
	}


	

	
	public void verifySortByHeading() {
		Locator SortByHeading = page.locator(sortByHeading);
		assertThat(SortByHeading).hasText("Sort By");
	}
	
	public void clickOnCampusSortBy() {
		page.click(nirfRankClick);
		page.click(campusVerify);
		Locator campus = page.locator("[aria-haspopup='listbox']");
		assertThat(campus).hasText("CAMPUS");
	}

	public void clickOnFeesSortBy() {
		
		page.click(campusClick);
		Locator fees = page.locator(feesVerify);
		fees.click();
		assertThat(fees).hasText("FEES");
		
		
		
	}
	
	public void clickOnMedianSalarySortBy() {
		
		page.click(feesClick);

		Locator medianSalary = page.locator(medianSalaryVerify);
		medianSalary.click();
		assertThat(medianSalary).hasText("MEDIAN SALARY");
		
		
	}
	
	public void clickOnPlacementSortBy() {
		
		page.click(medianSalaryClick);
		Locator placement = page.locator(placementVerify);
		placement.click();
		assertThat(placement).hasText("PLACEMENT");
	}
	
	
	public void  clickOnNirfRankSortBy() {
		page.click(placementClick);
		Locator placement = page.locator(nirfRankVerify);
		placement.click();
		assertThat(placement).hasText("NIRF RANK");
		
		
	}
	public void enterOnSearchbox() {
		
		Locator searchBox = page.locator(searchBoxHolder);
		searchBox.fill("IITM");
		page.click(iiitMadrasCollege);
		Locator iiitMadras = page.locator(verifyiiitMadrasCollege);
		assertThat(iiitMadras).hasText("Indian Institute of Technology Madras");
		
		
	}
	
	
	public void clickOnOnIITMadras() {
		
		page.click(verifyiiitMadrasCollege);

		Locator iitBanner = page.locator(iitMadrasBanner);
		assertThat(iitBanner).hasText("Indian Institute of Technology Madras");
		
		
	}
	
	
	
	//Filter headings verify
	
	public void verifyFilterHeading() {

		Locator filterHeading = page.locator(filter);
		assertThat(filterHeading).hasText("Filter");

	}

	
	public void verifyStateHeading() {

		Locator stateHeading = page.locator(state);
		assertThat(stateHeading).hasText("State");

	}

	
	public void verifyCityHeading() {

		Locator cityHeading = page.locator(city);
		assertThat(cityHeading).hasText("City");

	}

	
	public void verifyOwnershipHeading() {

		Locator ownershipHeading = page.locator(ownerShip);
		assertThat(ownershipHeading).hasText("Ownership");

	}

	
	public void verifyCategoryHeading() {

		Locator categoryHeading = page.locator(category);
		assertThat(categoryHeading).hasText("Category");

	}

	
	public void verifyCourseHeading() {

		Locator courseHeading = page.locator(course);
		assertThat(courseHeading).hasText("Course");

	}

	
	
	
}
