package api
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



class authentication {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	ResponseObject response

	@Given("I am send request for register")
	def sendRequestRegister() {
		println ("\n I am send request for register")

		response = WS.sendRequest(findTestObject('API/Auth/Register'))
	}

	@Then("I am verify register HTTP response code 200")
	def verifyRegiterResponseCode() {
		println ("\n I am verify register HTTP response code 200")

		WS.verifyResponseStatusCode(response, 200)
	}

	@Given("I am send request for login")
	def sendRequestLogin() {
		println ("\n I am send request for login")

		response = WS.sendRequest(findTestObject('API/Auth/Login'))
	}

	@Then("I am verify login HTTP response code 200")
	def verifyLoginResponseCode() {
		println ("\n I am verify login HTTP response code 200")

		WS.verifyResponseStatusCode(response, 200)
	}
	
	@Given("I am send request for get user information")
	def sendRequestGetUserInformation() {
		println ("\n I am send request for get user information")

		response = WS.sendRequest(findTestObject('API/Auth/Login'))
	}

	@Then("I am verify user information HTTP response code 200")
	def verifyGetUserInformationResponseCode() {
		println ("\n I am verify user information HTTP response code 200")

		WS.verifyResponseStatusCode(response, 200)
	}
	
	
	//asd
	@Given("I am send request for register with same email")
	def sendRequestRegisterWithSameEmail() {
		println ("\n I am send request for register with same email")

		response = WS.sendRequest(findTestObject('API/Auth Negative/Register'))
	}

	@Then("I am verify register with same email HTTP response code 400")
	def verifyRegisterWithSameEmailResponseCode() {
		println ("\n I am verify register with same email HTTP response code 400")

		WS.verifyResponseStatusCode(response, 400)
	}
	
	@Given("I am send request for login with invalid password")
	def sendRequestLoginWithInvalidPassword() {
		println ("\n I am send request for login with invalid password")

		response = WS.sendRequest(findTestObject('API/Auth Negative/Login'))
	}

	@Then("I am verify login HTTP response code 400")
	def verifyLoginWithInvalidPasswordResponseCode() {
		println ("\n I am verify login HTTP response code 400")

		WS.verifyResponseStatusCode(response, 400)
	}
	
	@Given("I am send request for get user information without login")
	def sendRequestGetUserInformationWithoutLogin() {
		println ("\n I am send request for get user information without login")

		response = WS.sendRequest(findTestObject('API/Auth Negative/Information'))
	}

	@Then("I am verify user information without login HTTP response code 401")
	def verifyGetUserInformationWithoutLoginResponseCode() {
		println ("\n I am verify user information without login HTTP response code 401")

		WS.verifyResponseStatusCode(response, 401)
	}
}
