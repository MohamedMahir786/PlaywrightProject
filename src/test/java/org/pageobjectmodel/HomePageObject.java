package org.pageobjectmodel;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.nio.file.Paths;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.ScreenshotOptions;

public class HomePageObject {

	public Page page;

	// Header region screenshot

	String headerRegionSreenshot = "//*[@id=\"__next\"]/div/header";

	// inner text verify of engineering

	String textOfEngineeringDropdown = "//*[@id='engineering-colleges-menu']";

	// Home button
	String homeButton = "//*[text()='Home']";

	// Header drop down

	String engineeringDropDown = "(//a[text()='Engineering'])[1]";
	String medicalDropDown = "(//a[text()='Medical'])[1]";
	String dentalDropDown = "(//a[text()='Dental'])[1]";
	String architectureDropDown = "(//a[text()='Architecture'])[1]";
	String pharmacyDropDown = "(//a[text()='Pharmacy'])[1]";

	// inner college of the header

	String gftiEngineeringCollege = "(//a[text()='Top 10 GFTI Colleges in india'])[1]";
	String privateCollegeOfMedical = "(//a[text()='Top 10 Private Colleges in india'])[1]";
	String privateCollegeOfDental = "(//a[text()='Top 10 Private Colleges in india'])[1]";
	String nitCollegeOfArchitecture = "(//a[text()='Top 10 NIT Colleges in india'])[1]";
	String nitCollegeOfPharmacy = "(//a[text()='Top 10 Private Colleges in india'])[1]";
	
	
	
	

	//Search Box 
	
	String searchBox = "[placeholder='Search']";
	
	//Mahindra University college
	String mahindraUniversity = "//a[text()='Mahindra University']";
	
	//Verify the heading of search box
	String mainHeadingOfSearchBox = "//h1[text() = 'Your College Decision, Informed and Assured']";
	
	//Verify Banner section
	String verifyBanner = "[loading='eager']";
	
	
	
	
	
	
	
	
	
	//Explore by stream
	
	String engineeringCard = "(//a[text()='Engineering'])[2]"; 
	String medicalCard = "(//a[text()='Medical'])[2]";
	String dentalCard = "(//a[text()='Dental'])[2]";
	String architectureCard = "(//a[text()='Architecture'])[2]";
	String pharmacyCard = "(//a[text()='Pharmacy'])[2]";
	
	
	
	
	
	//Explore Careers
	
	String exploreCareerHeading = "//h2[text()='Explore Careers']";
	String topCollegeInIndiaHeader = "//p[text()='Top Colleges in India']";
	String topPlacesInIndiaToStudyHeader = "//p[text()='Top Places In India to study']";
	String topCoursesToStudyHeader = "//p[text()='Top Courses to study']";
	
	
	//Explore careers of TopCollegesinIndia engineering 
	
	String topEngineeringCollege = "//a[text()='Top Engineering colleges']";
	
	String topEngineeringCollegesinIndiaheader = "//p[text()='Top Engineering Colleges in India']";
	
	//Explore careers of TopPlacesInIndiatostudy coimbatore

	String coimbatoreCollege = "//a[text()='Coimbatore']";
	
	String topEngineeringCollegesinCoimbatoreheader = "//p[text()='Top Engineering Colleges in Coimbatore']";
	
	//Explore careers of TopCoursestostudy ece
	
	String eceCourses = "//a[text()='ECE']";
	
	String topEngineeringCollegesinECEheader = "//p[text()='Top Engineering Colleges in ECE']";
	
	
	
	
	
	
	
	//Ranking and exam section - verify the heading 
	
	String rankingExamheader = "//h2[text()='Rankings & Exams']";
	String  rankingExamParagraph = "//p[text()='Explore your preferred streams to learn about the relevant colleges ranking, and exams.']";
	String rankingsHeading = "//p[text()='Rankings']";
	String rankingsParagraph = "//p[text()='1500 Colleges Ranked based on transparent, accurate, government-approved, student-friendly data']";
	String examsHeading = "//p[text()='Exams']";
	String examsParagraph = "//p[text()='Easy Information and downloads on Exam preparation, dates, counselling, syllabus and more']";
	
	
	
	//Rank and Exam box is clickable
	
	
	String topEngineeringCollegeRankSection = "//a[text()='Top Engineering Colleges in India']";
	String topMedicalCollegeRankSection = "//a[text()='Top Medical Colleges in India']";
	String topArchitectureCollegeRankSection = "//a[text()='Top Architecture Colleges in India']";
	
	
	
	
	
	//Footer Sections - headings
	
	
	
	String engineeringFooter = "(//div[text()='Engineering'])";
	String architectureFooter = "//div[text()='Architecture']";
	String medicalFooter = "//div[text()='Medical']";
	String dentalFooter = "//div[text()='Dental']";
	String pharmacyFooter = "//div[text()='Pharmacy']";
	String otherLinksFooter = "//div[text()='Other Links']";
	String followUsFooter = "(//div[text()='follow Us'])";
	
	
	
	//Footer section - click on the footer links 
	
	
	String iiitEngineering = "//a[text()='Top 10 IIIT Colleges in india']";
	String nitArchitecture = "(//a[text()='Top 10 NIT Colleges in india'])[2]";
	String govermentMedical = "(//a[text()='Top 10 Government Colleges in india'])[3]";
	String privateDental = "(//a[text()='Top 10 Private Colleges in india'])[4]";
	String pharmacyCollegeIndia = "(//a[text()='Pharmacy Colleges in india'])";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public HomePageObject(Page page) {
		this.page = page;
	}

	// Header section

	public void verifyAllTheTextOfEngineeringDropdown() {
		page.hover(engineeringDropDown);
		String engineeringHeader = page.innerText(textOfEngineeringDropdown);
		System.out.println("Colleges :" + engineeringHeader);
	}

	public void clickOnGftiEngineeringCollege() {

		Locator header = page.locator(headerRegionSreenshot);
		header.screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("./snaps/region.png")));

		page.locator(engineeringDropDown).hover();
		page.click(gftiEngineeringCollege);
		assertThat(page).hasTitle("Top 10 GFTI Engineering Colleges In India | College Suggest");
		System.out.println("Top 10 GFTI Engineering Colleges In India | College Suggest");
		page.goBack();
	}

	public void clickOnPrivateCollegeOfMedical() {

		page.locator(medicalDropDown).hover();
		page.click(privateCollegeOfMedical);
		assertThat(page).hasTitle("Top 10 Private Medical Colleges in India | College Suggest");
		page.click(homeButton);

	}

	public void clickOnPrivateCollegeOfDental() {
		page.locator(dentalDropDown).hover();
		page.click(privateCollegeOfDental);
		assertThat(page).hasTitle("Top 10 Private Dental Colleges in India | College Suggest");
		page.goBack();

	}

	public void clickOnNitCollegeOfArchitecture() {
		page.locator(architectureDropDown).hover();
		page.click(nitCollegeOfArchitecture);
		assertThat(page).hasTitle("Top 10 NIT Architecture Colleges in India | College Suggest");
		page.goBack();

	}

	public void clickOnNitCollegeOfPharmacy() {
		page.locator(pharmacyDropDown).hover();
		page.click(nitCollegeOfPharmacy);
		assertThat(page).hasTitle("Top 10 Private Pharmacy Colleges in India | College Suggest");
		page.goBack();

	}

	public void clickAllTheHeaderColleges() {
		String[] collegeTypes = { "Engineering", "Medical", "Dental", "Architecture", "Pharmacy" };
		for (int i = 0; i < collegeTypes.length; i++) {
			String collegeType = collegeTypes[i];
			page.click("(//a[text()='" + collegeType + "'])[1]");
			page.goBack();
		}
	}
	
	
	
	//Search Box Section
	
	
	public void verifyTheMainHeadingOfSearchBox() {
		String mainHeader = page.innerText(mainHeadingOfSearchBox);
		System.out.println("Success : "+ mainHeader);
	}
	
	
	public void enterCollegeNameAndTakeScreenShot() {
		ScreenshotOptions screenshotOptions = new ScreenshotOptions();
		Locator input = page.locator("[placeholder='Search']");
		input.fill("Mahi");
		page.screenshot(new ScreenshotOptions().setPath(Paths.get("./snaps/full_page.png")));

	}
	
	public void clickOnMahindraUniversity() {
			
		page.click(mahindraUniversity);
		assertThat(page).hasTitle(
				"MU Hyderabad 2022 B.Tech Overview For Courses, Placements & More | College Suggest | College Suggest");
	}
	
	public void verifyBannerSectionOfSearchBox() {
		if(page.isDisabled("[loading='eager']"));{
			System.out.println("Success : The Banner Image Is Displayed");
		}
		
	}
	
	
	
	
	//Explore By Stream
	public void verifyAndClickEngineeringCard() {
		page.click(engineeringCard);
		assertThat(page).hasTitle("Top Engineering Colleges in India | College Suggest");
		page.goBack();
	}

	
	public void verifyAndClickMedicalCard() {
		page.click(medicalCard);
		assertThat(page).hasTitle("Top Medical Colleges in India | College Suggest");
		page.goBack(); 
	}
	
	public void verifyAndClickDentalCard() {
		page.click(dentalCard);
		assertThat(page).hasTitle("Top Dental Colleges in India | College Suggest");
		page.goBack(); 
	}
	
	public void verifyAndClickArchitectureCard() {
		page.click(architectureCard);
		assertThat(page).hasTitle("Top Architecture Colleges in India | College Suggest");
		page.goBack(); 
	}
	public void verifyAndClickPharmacyCard() {
		
		page.click(pharmacyCard);
		assertThat(page).hasTitle("Top Pharmacy Colleges in India | College Suggest");
		page.goBack(); 
	}
	
	
	//Explore Careers
	
	
	public void verifyExploreCareerHeading() {
		Locator ExploreCareersSectionheader = page.locator(exploreCareerHeading);
		assertThat(ExploreCareersSectionheader).hasText("Explore Careers");
	}
	
	public void verifyTopCollegeInIndiaheading() {
		Locator TopCollegeInIndiaheader = page.locator(topCollegeInIndiaHeader);
		assertThat(TopCollegeInIndiaheader).hasText("Top Colleges in India");
	}
	
	public void verifyTopPlacesInIndiaToStudyheading() {
		
		Locator TopPlacesInIndiaToStudyheader = page.locator(topPlacesInIndiaToStudyHeader);
		assertThat(TopPlacesInIndiaToStudyheader).hasText("Top Places In India to study");
		
	}
	public void verifyTopCoursesToStudyheading()
	{
		Locator TopCoursesToStudyheader = page.locator(topCoursesToStudyHeader);
		assertThat(TopCoursesToStudyheader).hasText("Top Courses to study");
	}
	
	//Explore carees of TopCollegesinIndia engineering 
	
	public void clickOnTopEngineeringCollegesInIndia() {
		page.click(topEngineeringCollege);

		Locator TopEngineeringCollegesinIndiaheader = page.locator(topEngineeringCollegesinIndiaheader);
		assertThat(TopEngineeringCollegesinIndiaheader).hasText("Top Engineering Colleges in India");

		page.goBack();
	}

	
	//Explore careers of TopPlacesInIndiatostudy coimbatore
	
	
	public void clickOnTopPlacesInIndiatostudyCoimbatore() {
		page.click(coimbatoreCollege);

		Locator TopEngineeringCollegesinCoimbatoreheader = page
				.locator(topEngineeringCollegesinCoimbatoreheader);
		assertThat(TopEngineeringCollegesinCoimbatoreheader).hasText("Top Engineering Colleges in Coimbatore");

		page.goBack();
	}
	
	
	//Explore careers of TopCoursestostudy ece
	
	
	public void clickOnTopCoursestostudyEce() {
		page.click(eceCourses);

		Locator TopEngineeringCollegesinECEheader = page.locator(topEngineeringCollegesinECEheader);
		assertThat(TopEngineeringCollegesinECEheader).hasText("Top Engineering Colleges in ECE");

		page.goBack();
	}
	
	
	//Rank and Exam verify the headings 
	
	
	
	public void verifyRankingandExamsHeading() {
		Locator RankingExamheader = page.locator(rankingExamheader);
		assertThat(RankingExamheader).hasText("Rankings & Exams");
	}
	
	public void verifyRankingandExamParagraph() {
		
		Locator RankingExamParagraph = page.locator(rankingExamParagraph);
		assertThat(RankingExamParagraph)
				.hasText("Explore your preferred streams to learn about the relevant colleges ranking, and exams.");
		
	}
	
	public void verifyRankingsHeading() {
		Locator RankingsHeading = page.locator(rankingsHeading);
		assertThat(RankingsHeading).hasText("Rankings");
			
	}
	
	
	public void verifyRankingsParagraph() {
		
		Locator RankingsParagraph = page.locator(rankingsParagraph);
		assertThat(RankingsParagraph).hasText(
				" 1500 Colleges Ranked based on transparent, accurate, government-approved, student-friendly data");
		
	}
	
	
	public void verifyExamsHeading() {
		Locator ExamsHeading = page.locator(examsHeading);
		assertThat(ExamsHeading).hasText("Exams");
	}
	
	
	public void verifyExamsParagraph() {
		Locator ExamsParagraph = page.locator(examsParagraph);
		assertThat(ExamsParagraph)
				.hasText(" Easy Information and downloads on Exam preparation, dates, counselling, syllabus and more");
	}
	
	public void clickOnTopEngineeringCollegeRankSection() {
		page.click(topEngineeringCollegeRankSection);

		page.goBack();
	}
	
	
	public void clickOnTopMedicalCollegeRankSection() {
		page.click(topMedicalCollegeRankSection);

		page.goBack();
	}
	
	public void clickOnTopArchitectureCollegeRankSection() {
		page.click(topArchitectureCollegeRankSection);

		page.goBack();
	}
	
	
	
	//Footer Section - verify the headings 
	
	
	public void verifyEngineeringFooterHeading() {
		
		
		Locator Verify_EngineeringSection_In_Footer_Is_Present = page.locator(engineeringFooter);
		assertThat(Verify_EngineeringSection_In_Footer_Is_Present).hasText("Engineering");
	}
	
	public void verifyArchitectureFooter() {
		
		Locator Verify_ArchitectureSection_In_Footer_Is_Present = page
				.locator(architectureFooter);
		assertThat(Verify_ArchitectureSection_In_Footer_Is_Present).hasText("Architecture");
		
	}
	
	public void verifyMedicalFooter() {
		
		Locator Verify_MedicalSection_In_Footer_Is_Present = page.locator(medicalFooter);
		assertThat(Verify_MedicalSection_In_Footer_Is_Present).hasText("Medical");
		
	}
	
	public void verifyDentalFooter() {
		Locator Verify_MedicalSection_In_Footer_Is_Present = page.locator(dentalFooter);
		assertThat(Verify_MedicalSection_In_Footer_Is_Present).hasText("Dental");
	}
	
	public void verifyPharmacyFooter() {
		
		Locator Verify_PharmacySection_In_Footer_Is_Present = page.locator(pharmacyFooter);
		assertThat(Verify_PharmacySection_In_Footer_Is_Present).hasText("Pharmacy");
	}
	
	public void verifyOtherLinksFooter() {
		
		

		Locator Verify_OtherLinksSection_In_Footer_Is_Present = page.locator(otherLinksFooter);
		assertThat(Verify_OtherLinksSection_In_Footer_Is_Present).hasText("Other Links");
	}
	
	
	public void verifyFollowUsFooter() {

		Locator Verify_FollowUsSection_In_Footer_Is_Present = page.locator(followUsFooter);
		assertThat(Verify_FollowUsSection_In_Footer_Is_Present).hasText("follow Us");
	}
	
	
	
	//Footer section - click on the footer links 
	
	
	public void clickOnIIITCollegeInIndiaOfEngineering() {
		page.click(iiitEngineering);

		page.goBack();
		
	}
	
	
	public void clickOnNITCollegeInIndiaOfArchitecture(){
		
		page.click(nitArchitecture);

		page.goBack();
	}
	
	public void clickOnGovermentCollegesInIndiaOfMedical(){
		page.click(govermentMedical);

		page.goBack();
	}
	
	public void clickOnPrivateCollegesInIndiaOfDental(){
		
		page.click(privateDental);

		page.goBack();

	}
	public void clickOnPharmacyCollegesinIndia(){
	
		page.click(pharmacyCollegeIndia);

		page.goBack();
	}

	
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


