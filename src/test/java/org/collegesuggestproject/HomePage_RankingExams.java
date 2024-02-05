package org.collegesuggestproject;

import org.pageobjectmodel.BaseClass;
import org.pageobjectmodel.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_RankingExams extends BaseClass {

	HomePageObject homePage;

	// verify the presence of Ranking Exam text
	@Test(priority = 1)
	public void cs_Verify_RankingExam_Text_Is_Present_0001() throws InterruptedException {
		homePage = new HomePageObject(page);
		homePage.verifyRankingandExamsHeading();
	}

	// verify the presence of Ranking Exam paragraph
	@Test(priority = 2)
	public void cs_Verify_RankingExam_Paragraph_Is_Present_0002() throws InterruptedException {

		homePage.verifyRankingandExamParagraph();
	}

	// verify the presence of Rankings heading
	@Test(priority = 3)
	public void cs_Verify_Rankings_Heading_Is_Present_0003() throws InterruptedException {
		homePage.verifyRankingsHeading();
	}

	// verify the presence of Rankings paragraph
	@Test(priority = 4)
	public void cs_Verify_Rankings_Paragraph_Is_Present_0004() throws InterruptedException {
		homePage.verifyRankingsParagraph();
	}

	// verify the presence of Exams heading
	@Test(priority = 5)
	public void cs_Verify_Exams_Heading_Is_Present_0005() throws InterruptedException {
		homePage.verifyExamsHeading();
	}

	// verify the presence of Exams paragraph
	@Test(priority = 6)
	public void cs_Verify_Exams_Paragraph_Is_Present_0006() throws InterruptedException {
		homePage.verifyExamsParagraph();
	}

//  verify that Top Engineering College is clickable
	@Test(priority = 7)
	public void cs_Verify_TopEngineeringCollege_Is_Clickable_0007() throws InterruptedException {
		homePage.clickOnTopEngineeringCollegeRankSection();
	}

	// verify that Top Medical College is clickable
	@Test(priority = 8)
	public void cs_Verify_TopMedicalCollege_Is_Clickable_0008() throws InterruptedException {
		homePage.clickOnTopMedicalCollegeRankSection();
	}

	// verify that Top Architecture College is clickable
	@Test(priority = 9)
	public void cs_Verify_TopArchitectureCollege_Is_Clickable_0009() throws InterruptedException {
		homePage.clickOnTopArchitectureCollegeRankSection();
	}

}
