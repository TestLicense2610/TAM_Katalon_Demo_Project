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

/*
 * Create a test case with the list of test steps below
 * Open a browser 
 * Navigate to the link https://katalon-demo-cura.herokuapp.com/ 
 * Click on the a_btn-make-appointment on  Page_CURA Healthcare Service
 * Enter the John Doe to the input_Username on  Page_CURA Healthcare Service
 * Enter the ThisIsNotAPassword in the input_Password on Page_CURA Healthcare Service 
 * Click on the button_btn-login on Page_CURA Healthcare Service
 * Close Browser
 */



/*
 * Scenario Outline: Login with a valid credential 
 * Given I navigate to Cura System homepage:  https://katalon-demo-cura.herokuapp.com/ 
 * When I click Make Appointment button: a_btn-make-appointment on  Page_CURA Healthcare Service
 * And I enter username <username> : input_Username on  Page_CURA Healthcare Service
 * and password <password> input_Password on Page_CURA Healthcare Service 
 * And I click Log in button : button_btn-login on Page_CURA Healthcare Service
 * Then I should be able to login successfully
 * Examples: 
 * | username | password | 
 * | John Doe | ThisIsNotAPassword |
 */