import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('8cf54231-9350-4f15-9e4e-f55d3e5ab0b1', true)

Mobile.setText(findTestObject('Object Repository/Mobile/iOS_Simulator/XCUIElementTypeTextField - login_email'), 'linh.nguyen@katalon.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Mobile/iOS_Simulator/XCUIElementTypeSecureTextField - login_password'), 
    'abc', 0)

Mobile.tap(findTestObject('Object Repository/Mobile/iOS_Simulator/XCUIElementTypeStaticText - Login'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile/iOS_Simulator/XCUIElementTypeSecureTextField - login_password (1)'), 
    'avc', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Mobile/iOS_Simulator/XCUIElementTypeStaticText - Signup'), 'Signup')

Mobile.closeApplication()

