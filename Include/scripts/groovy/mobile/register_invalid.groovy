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



class register_invalid {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am already on the register page")
	def onTheRegisterPage() {
		println ("\n I am on the register page")

		Mobile.startApplication('C:\\Users\\iputu\\OneDrive\\Desktop\\MSIB\\Mini project\\app-release.apk', true)

		Mobile.tap(findTestObject('Object Repository/Mobile/Register/android.widget.Button - Logout'), 0)

		Mobile.tap(findTestObject('Object Repository/Mobile/Register/android.widget.Button - Form Register'), 0)
	}

	@When("I am insert invalid (.*) in form fullname")
	def inputFullnameInFormFullname(String fullname) {
		println ("\n I am input (.*) in form fullname")

		Mobile.tap(findTestObject('Mobile/Register/android.widget.EditText - Form Fullname'), 0)

		Mobile.setText(findTestObject('Mobile/Register/android.widget.EditText - Form Fullname'), fullname, 0)
	}

	@And("I am insert invalid (.*) in form email")
	def I_check_for_the_value_in_step(String email) {
		println ("\n I am input (.*) in form email")

		Mobile.tap(findTestObject('Mobile/Register/android.widget.EditText - Form Email'), 0)

		Mobile.setText(findTestObject('Mobile/Register/android.widget.EditText - Form Email'), email, 0)
	}

	@And("I am insert invalid (.*) in form password")
	def I_check_for_the_value_in_stepwe(String password) {
		println ("\n I am input (.*) in form password")

		Mobile.tap(findTestObject('Object Repository/Mobile/Register/android.widget.EditText - Form Password'), 0)

		Mobile.setText(findTestObject('Mobile/Register/android.widget.EditText - Form Password'), password, 0)
	}

	@And("I am tap register button")
	def I_check_for_the_value_in_stepqwee() {
		println ("\n I am click register button")

		Mobile.tap(findTestObject('Object Repository/Mobile/Register/android.widget.Button - Register'), 5)
		
		Mobile.verifyElementVisible(findTestObject('Mobile/Failed Object/android.view.View - fullname can not empty appear'), 0)
		
		Mobile.verifyElementVisible(findTestObject('Mobile/Failed Object/android.view.View - email can not empty appear'), 0)
		
		Mobile.verifyElementVisible(findTestObject('Mobile/Failed Object/android.view.View - password can not empty appear'), 0)
	}

	@Then("I am verify error info")
	def I_verify_the_status_in_step() {
		println ("\n I am verify error info")

		
	}
}