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

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over span object"

WebUI.mouseOver(findTestObject('AI-Generated/JustInMind-Production/Page_home/span_object'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Hover over span object.png')

"Step 3: Click on link freeUiDesignSoftware -> Navigate to page '/ui-design/software'"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_home/link_freeUiDesignSoftware'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link freeUiDesignSoftware - Navigate to page ui-designsoftware.png')

"Step 4: Click on span freeUiDesignSoftware -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_ui_design_software/span_freeUiDesignSoftware'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on span freeUiDesignSoftware - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-TC05 Verify the Breadcrumbs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}