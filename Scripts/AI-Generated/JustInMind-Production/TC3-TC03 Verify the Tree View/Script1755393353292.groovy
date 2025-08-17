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

"Step 1: Navigate to /support/exercises-data"

TrueTestScripts.navigate("/support/exercises-data")

"Step 2: Click on link displayingDataMasterRecords"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_support_exercises_data/link_displayingDataMasterRecords'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on link displayingDataMasterRecords.png')

"Step 3: Click on header displayingDataMasterRecords"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_support_exercises_data/header_displayingDataMasterRecords'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on header displayingDataMasterRecords.png')

"Step 4: Click on link properties"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_support_exercises_data/link_properties'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on link properties.png')

"Step 5: Click on header tableOptions (properties)"

// Bind values to the variables in the locators of "AI-Generated/JustInMind-Production/Dynamic Objects/Page_support_exercises_data/header_tableOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Dynamic Objects/Page_support_exercises_data/header_tableOptions', ['header_tableOptions_h2NthChild': header_tableOptions_h2NthChild, 'header_tableOptions_h2NthOfType': header_tableOptions_h2NthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on header tableOptions properties.png')

"Step 6: Click on link customizingDataList"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_support_exercises_data/link_customizingDataList'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on link customizingDataList.png')

"Step 7: Click on header tableOptions (customizingDataList)"

// Bind values to the variables in the locators of "AI-Generated/JustInMind-Production/Dynamic Objects/Page_support_exercises_data/header_tableOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Dynamic Objects/Page_support_exercises_data/header_tableOptions', ['header_tableOptions_h2NthChild': header_tableOptions_h2NthChild_1, 'header_tableOptions_h2NthOfType': header_tableOptions_h2NthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on header tableOptions customizingDataList.png')

"Step 8: Click on link sortColumns"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_support_exercises_data/link_sortColumns'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on link sortColumns.png')

"Step 9: Click on header tableOptions (sortColumns)"

// Bind values to the variables in the locators of "AI-Generated/JustInMind-Production/Dynamic Objects/Page_support_exercises_data/header_tableOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Dynamic Objects/Page_support_exercises_data/header_tableOptions', ['header_tableOptions_h2NthChild': header_tableOptions_h2NthChild_2, 'header_tableOptions_h2NthOfType': header_tableOptions_h2NthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on header tableOptions sortColumns.png')

"Step 10: Click on link filterRows"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_support_exercises_data/link_filterRows'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on link filterRows.png')

"Step 11: Click on header tableOptions (filterRows)"

// Bind values to the variables in the locators of "AI-Generated/JustInMind-Production/Dynamic Objects/Page_support_exercises_data/header_tableOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Dynamic Objects/Page_support_exercises_data/header_tableOptions', ['header_tableOptions_h2NthChild': header_tableOptions_h2NthChild_3, 'header_tableOptions_h2NthOfType': header_tableOptions_h2NthOfType_3]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on header tableOptions filterRows.png')

"Step 12: Click on item selectRows"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_support_exercises_data/item_selectRows'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on item selectRows.png')

"Step 13: Click on link selectRows"

WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Page_support_exercises_data/link_selectRows'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on link selectRows.png')

"Step 14: Click on header tableOptions (selectRows) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/JustInMind-Production/Dynamic Objects/Page_support_exercises_data/header_tableOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/JustInMind-Production/Dynamic Objects/Page_support_exercises_data/header_tableOptions', ['header_tableOptions_h2NthChild': header_tableOptions_h2NthChild_4, 'header_tableOptions_h2NthOfType': header_tableOptions_h2NthOfType_4]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on header tableOptions selectRows - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-TC03 Verify the Tree View_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}