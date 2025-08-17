import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.JustInMind_Production.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /community"

TrueTestScripts.navigate("/community")

"Step 2: Click on link uiLibrariesAndWidgets -> Navigate to page '/community/topics/all/status/all/category/*/sort/updated/page/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_community/link_uiLibrariesAndWidgets'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on link uiLibrariesAndWidgets - Navigate to page communitytopicsallstatusallcategorysortupdatedpage.png')

"Step 3: Click on link allTopics -> Navigate to page '/community/topics/all/status/all/category/all/sort/updated/page/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_community_topics_all_status_all_category_sort_updated_page/link_allTopics'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on link allTopics - Navigate to page communitytopicsallstatusallcategoryallsortupdatedpage.png')

"Step 4: Click on i topicStatus (topicStatus)"

// Bind values to the variables in the locators of "AI-Generated/JustInMind-Production/Dynamic Objects/Page_community_topics_all_status_all_category_all_sort_updated_page/i_topicStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Dynamic Objects/Page_community_topics_all_status_all_category_all_sort_updated_page/i_topicStatus', ['i_topicStatus_id': i_topicStatus_id, 'i_topicStatus_topic': i_topicStatus_topic]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on i topicStatus topicStatus.png')

"Step 5: Click on i topicStatus (topicStatus2)"

// Bind values to the variables in the locators of "AI-Generated/JustInMind-Production/Dynamic Objects/Page_community_topics_all_status_all_category_all_sort_updated_page/i_topicStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Dynamic Objects/Page_community_topics_all_status_all_category_all_sort_updated_page/i_topicStatus', ['i_topicStatus_id': i_topicStatus_id_1, 'i_topicStatus_topic': i_topicStatus_topic_1]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on i topicStatus topicStatus2.png')

"Step 6: Click on link problems -> Navigate to page '/community/topics/problem/status/all/category/all/sort/updated/page/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_community_topics_all_status_all_category_all_sort_updated_page/link_problems'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on link problems - Navigate to page communitytopicsproblemstatusallcategoryallsortupdatedpage.png')

"Step 7: Click on i topicStatus (topicStatus)"

// Bind values to the variables in the locators of "AI-Generated/JustInMind-Production/Dynamic Objects/Page_community_topics_problem_status_all_category_all_sort_updated/i_topicStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Dynamic Objects/Page_community_topics_problem_status_all_category_all_sort_updated/i_topicStatus', ['i_topicStatus_id': i_topicStatus_id_2, 'i_topicStatus_topic': i_topicStatus_topic_2]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on i topicStatus topicStatus.png')

"Step 8: Click on i topicStatus (topicStatus2)"

// Bind values to the variables in the locators of "AI-Generated/JustInMind-Production/Dynamic Objects/Page_community_topics_problem_status_all_category_all_sort_updated/i_topicStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Dynamic Objects/Page_community_topics_problem_status_all_category_all_sort_updated/i_topicStatus', ['i_topicStatus_id': i_topicStatus_id_3, 'i_topicStatus_topic': i_topicStatus_topic_3]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on i topicStatus topicStatus2.png')

"Step 9: Click on link questions -> Navigate to page '/community/topics/question/status/all/category/all/sort/updated/page/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_community_topics_problem_status_all_category_all_sort_updated/link_questions'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on link questions - Navigate to page communitytopicsquestionstatusallcategoryallsortupdatedpage.png')

"Step 10: Click on i topicStatusIcon (questionStatus)"

// Bind values to the variables in the locators of "AI-Generated/JustInMind-Production/Dynamic Objects/Page_community_topics_question_status_all_category_all_sort_updated/i_topicStatusIcon"
WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Dynamic Objects/Page_community_topics_question_status_all_category_all_sort_updated/i_topicStatusIcon', ['i_topicStatusIcon_id': i_topicStatusIcon_id, 'i_topicStatusIcon_topic': i_topicStatusIcon_topic]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on i topicStatusIcon questionStatus.png')

"Step 11: Click on i topicStatusIcon (topicStatusIcon)"

// Bind values to the variables in the locators of "AI-Generated/JustInMind-Production/Dynamic Objects/Page_community_topics_question_status_all_category_all_sort_updated/i_topicStatusIcon"
WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Dynamic Objects/Page_community_topics_question_status_all_category_all_sort_updated/i_topicStatusIcon', ['i_topicStatusIcon_id': i_topicStatusIcon_id_1, 'i_topicStatusIcon_topic': i_topicStatusIcon_topic_1]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on i topicStatusIcon topicStatusIcon.png')

"Step 12: Click on link ideas -> Navigate to page '/community/topics/idea/status/all/category/all/sort/updated/page/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_community_topics_question_status_all_category_all_sort_updated/link_ideas'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on link ideas - Navigate to page communitytopicsideastatusallcategoryallsortupdatedpage.png')

"Step 13: Click on i ideaStatus (object)"

// Bind values to the variables in the locators of "AI-Generated/JustInMind-Production/Dynamic Objects/Page_community_topics_idea_status_all_category_all_sort_updated_page/i_ideaStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Dynamic Objects/Page_community_topics_idea_status_all_category_all_sort_updated_page/i_ideaStatus', ['i_ideaStatus_id': i_ideaStatus_id, 'i_ideaStatus_topic': i_ideaStatus_topic]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on i ideaStatus object.png')

"Step 14: Click on i ideaStatus (ideaStatus) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/JustInMind-Production/Dynamic Objects/Page_community_topics_idea_status_all_category_all_sort_updated_page/i_ideaStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Dynamic Objects/Page_community_topics_idea_status_all_category_all_sort_updated_page/i_ideaStatus', ['i_ideaStatus_id': i_ideaStatus_id_1, 'i_ideaStatus_topic': i_ideaStatus_topic_1]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Click on i ideaStatus ideaStatus - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-TC04 Verify QnA Categories_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}