package org.collegesuggestproject;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.pageobjectmodel.BaseClass;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;

public class HomePage_RankingExams extends BaseClass {

	// verify the presence of Ranking Exam text
	@Test(priority = 1)
	public void cs_Verify_RankingExam_Text_Is_Present_0001() throws InterruptedException {
		Locator RankingExamheader = page.locator("//h2[text()='Rankings & Exams']");
		assertThat(RankingExamheader).hasText("Rankings & Exams");
	}

	// verify the presence of Ranking Exam paragraph
	@Test(priority = 2)
	public void cs_Verify_RankingExam_Paragraph_Is_Present_0002() throws InterruptedException {
		Locator RankingExamParagraph = page.locator(
				"//p[text()='Explore your preferred streams to learn about the relevant colleges ranking, and exams.']");
		assertThat(RankingExamParagraph)
				.hasText("Explore your preferred streams to learn about the relevant colleges ranking, and exams.");
	}

	// verify the presence of Rankings heading
	@Test(priority = 3)
	public void cs_Verify_Rankings_Heading_Is_Present_0003() throws InterruptedException {
		Locator RankingsHeading = page.locator("//p[text()='Rankings']");
		assertThat(RankingsHeading).hasText("Rankings");
	}

	// verify the presence of Rankings paragraph
	@Test(priority = 4)
	public void cs_Verify_Rankings_Paragraph_Is_Present_0004() throws InterruptedException {
		Locator RankingsParagraph = page.locator("//p[text()='1500 Colleges Ranked based on transparent, accurate, government-approved, student-friendly data']");
		assertThat(RankingsParagraph).hasText(
				" 1500 Colleges Ranked based on transparent, accurate, government-approved, student-friendly data");
	}

	// verify the presence of Exams heading
	@Test(priority = 5)
	public void cs_Verify_Exams_Heading_Is_Present_0005() throws InterruptedException {
		Locator ExamsHeading = page.locator("//p[text()='Exams']");
		assertThat(ExamsHeading).hasText("Exams");
	}

	// verify the presence of Exams paragraph
	@Test(priority = 6)
	public void cs_Verify_Exams_Paragraph_Is_Present_0006() throws InterruptedException {
		Locator ExamsParagraph = page.locator("//p[text()='Easy Information and downloads on Exam preparation, dates, counselling, syllabus and more']");
		assertThat(ExamsParagraph)
				.hasText(" Easy Information and downloads on Exam preparation, dates, counselling, syllabus and more");
	}

//  verify that Top Engineering College is clickable
	@Test(priority = 7)
	public void cs_Verify_TopEngineeringCollege_Is_Clickable_0007() throws InterruptedException {
		page.click("//a[text()='Top Engineering Colleges in India']");

		page.goBack();
	}

	// verify that Top Medical College is clickable
	@Test(priority = 8)
	public void cs_Verify_TopMedicalCollege_Is_Clickable_0008() throws InterruptedException {
		page.click("//a[text()='Top Medical Colleges in India']");

		page.goBack();
	}

	// verify that Top Architecture College is clickable
	@Test(priority = 9)
	public void cs_Verify_TopArchitectureCollege_Is_Clickable_0009() throws InterruptedException {
		page.click("//a[text()='Top Architecture Colleges in India']");

		page.goBack();
	}

}
