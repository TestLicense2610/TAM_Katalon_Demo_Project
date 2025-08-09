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

//Mobile.startApplication('41737d08-66f1-4a17-be67-d35a8c6152af', true)
Mobile.startApplication('/Users/linh.nguyen/Documents/Mobile Apps/Android/IT Glossary_1.5_Apkpure.apk', false)

Mobile.tap(findTestObject('Object Repository/TestCloud_Record/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/TestCloud_Record/android.widget.TextView - About App'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/TestCloud_Record/android.widget.TextView - This app contains a wide collection of IT terminology, abbreviations and MCQs, specially designed for students'), 
    'This app contains a wide collection of IT terminology, abbreviations and MCQ\'s, specially designed for students.')

Mobile.closeApplication()

