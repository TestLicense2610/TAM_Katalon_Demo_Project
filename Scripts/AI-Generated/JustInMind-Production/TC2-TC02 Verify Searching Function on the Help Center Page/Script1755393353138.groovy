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
	//WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over span freeResources"

WebUI.mouseOver(findTestObject('AI-Generated/JustInMind-Production/Page_home/span_freeResources'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Hover over span freeResources.png')

"Step 3: Click on div helpCenter -> Navigate to page '/support'"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_home/div_helpCenter'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on div helpCenter - Navigate to page support.png')

"Step 4: Click on input search"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_support/input_search'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on input search.png')

"Step 5: Enter input value in input search"

WebUI.setText(findTestObject('AI-Generated/JustInMind-Production/Page_support/input_search'), input_search)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Enter input value in input search.png')

"Step 6: Click on button submit -> Navigate to page '/support/search'"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_support/button_submit'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button submit - Navigate to page supportsearch.png')

"Step 7: Click on span dropdownList -> Navigate to page ''"

//WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_support_search/span_dropdownList'))

def actualText = WebUI.getText(findTestObject('AI-Generated/JustInMind-Production/Page_support_search/span_dropdownList'))
WebUI.verifyEqual(actualText, expectedText)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on span dropdownList - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-TC02 Verify Searching Function on the Help Center Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}