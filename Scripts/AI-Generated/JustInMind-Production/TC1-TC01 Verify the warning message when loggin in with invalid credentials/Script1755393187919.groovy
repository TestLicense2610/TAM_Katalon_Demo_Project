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

"Step 1: Navigate to /community/login"

TrueTestScripts.navigate("/community/login")

"Step 2: Login into Application"

//TrueTestScripts.login()
WebUI.setText(findTestObject('Object Repository/Page_Login - Justinmind QA Help Desk/input_Email'), 'linh.nguyen@katalon.com')

WebUI.click(findTestObject('Object Repository/Page_Login - Justinmind QA Help Desk/input_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - Justinmind QA Help Desk/input_Password'), 'uZy0U1VXwr434ZbiYe7pwg==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login - Justinmind QA Help Desk/input_login-submit'))

"Step 3: Click on div loginErrorMessage -> Navigate to page ''"

//WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_community_login/div_loginErrorMessage'))
def actualText = WebUI.getText(findTestObject('AI-Generated/JustInMind-Production/Page_community_login/div_loginErrorMessage'))
WebUI.verifyEqual(actualText, expectedText)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on div loginErrorMessage - Navigate to page .png')

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-TC01 Verify the warning message when loggin in with invalid credentials_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}