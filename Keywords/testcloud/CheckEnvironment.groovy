package testcloud

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class CheckEnvironment {
	@Keyword
	def static String getEnvironmentType() {
		Object remote = RunConfiguration.getExecutionProperties().getAt("drivers").getAt("system").getAt("Remote")

		if (remote != null) {
			// Run with TestCloud environments
			if (remote.getAt("remoteWebDriverType").equals("Selenium")) {
				String remoteMobileDriver = remote.getAt("remoteMobileDriver")
				if (remoteMobileDriver != null) {
					Object preferences = RunConfiguration.getExecutionProperties().getAt("drivers").getAt("preferences").getAt("Remote")
					String platformName = preferences.getAt("platformName")
					
					// TestCloud Mobile App / Mobile browser on TO
					if (platformName.toLowerCase().equals("android")) {
						return preferences.getAt("appName") != null ? "Android" : "Web"
					} else {
						return preferences.getAt("appName") != null ? "iOS" : "Web"
					}
				} else {
					// TestCloud Desktop
					return "Web"
				}
			} else if (remote.getAt("remoteWebDriverType").equals("Appium")) {
				// TestCloud Mobile App on KS
				return remote.getAt("testCloudRemoteOS")
			} else {
				return "API"
			}
		} else {
			// Run on local machine
			Object system = RunConfiguration.getExecutionProperties().getAt("drivers").getAt("system")
			if (system.getAt("WebUI") != null) {
				return "Web"
			} else if (system.getAt("Mobile") != null) {
				return system.getAt("Mobile").getAt("deviceOS")
			} else {
				return "API"
			}
		}
		return "Unknown"
	}
}
