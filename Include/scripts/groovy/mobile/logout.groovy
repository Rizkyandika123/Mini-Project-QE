package mobile
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class logout {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am already on the home page")
	def alreadyOnTheHomePage() {
		println ("\n I am already on the home page")

		WebUI.callTestCase(findTestCase('Mobile/Auth/TC005P_Login'), [:], FailureHandling.STOP_ON_FAILURE)

		Mobile.verifyElementExist(findTestObject('Mobile/Verify Object/Verify Object Login Button - Page Title'), 0)
	}

	@When("I am click logout button")
	def clickLogoutButton() {
		println ("\n I am click logout button")

		Mobile.tap(findTestObject('Object Repository/Mobile/Logout/android.widget.Button'), 0)

		Mobile.tap(findTestObject('Mobile/Logout/android.widget.Button'), 0)
	}

	@Then("I am navigate to login page")
	def navigateToLoginButton() {
		println ("\n I am navigate to login page")

		Mobile.verifyElementExist(findTestObject('Mobile/Verify Object/Verify Object Login Button - Page Title'), 0)

		Mobile.verifyElementExist(findTestObject('Mobile/Verify Object/Verify Object Login Page - Login Button'), 0)

		Mobile.closeApplication()
	}
}