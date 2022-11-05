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



class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am on the login page")
	def onTheLoginPage() {
		println ("\n I am on the login page")

		Mobile.startApplication('C:\\Users\\iputu\\OneDrive\\Desktop\\MSIB\\Mini project\\app-release.apk', true)

		Mobile.tap(findTestObject('Mobile/Login/android.widget.Button'), 0)
	}

	@When("I am input (.*) in form email in login page")
	def inputEmail(String email) {
		println ("\n I am input (.*) in form email in login page")

		Mobile.tap(findTestObject('Mobile/Login/android.widget.EditText - Email'), 0)

		Mobile.setText(findTestObject('Mobile/Login/android.widget.EditText - Email'), email, 0)
	}

	@And("I am input (.*) in form password in login page")
	def inputPassword(String password) {
		println ("\n I am input (.*) in form password in login page")

		Mobile.tap(findTestObject('Mobile/Login/android.widget.EditText - Password'), 0)

		Mobile.setText(findTestObject('Mobile/Login/android.widget.EditText - Password'), password, 0)
	}

	@And("I am click login button")
	def clickLoginButton() {
		println ("\n I am click login button")

		Mobile.tap(findTestObject('Mobile/Login/android.widget.Button - Login'), 0)
		
	
	}

	@Then("I am navigate to home page")
	def navigateToHomePage() {
		println ("\n I am navigateToHomePage")

		Mobile.verifyElementVisible(findTestObject('Mobile/Verify Object/Verify Object Login Button - Page Title'), 0)

		Mobile.verifyElementVisible(findTestObject('Mobile/Verify Object/Verify Object Login Page - Login Button'), 0)
	}
}