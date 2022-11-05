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



class order {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	ResponseObject response

	@Given("I am send request for Create a new order")
	def sendRequestRegister() {
		println ("\n I am send request for Create a new order")

		response = WS.sendRequest(findTestObject('API/Orders/Create a new order'))
	}

	@Then("I am verify Create a new order HTTP response code 200")
	def verifyRegiterResponseCode() {
		println ("\n I am verify Create a new order HTTP response code 200")

		WS.verifyResponseStatusCode(response, 200)
	}

	@Given("I am send request for Get all orders")
	def sendRequestLogin() {
		println ("\n I am send request for Get all orders")

		response = WS.sendRequest(findTestObject('API/Orders/Get all orders'))
	}

	@Then("I am verify Get all orders HTTP response code 200")
	def verifyLoginResponseCode() {
		println ("\n I am verify Get all orders HTTP response code 200")

		WS.verifyResponseStatusCode(response, 200)
	}

	@Given("I am send request for Get order by ID")
	def sendRequestinfo() {
		println ("\n I am send request for Get order by ID")

		response = WS.sendRequest(findTestObject('API/Orders/Get order by id'))
	}

	@Then("I am verify Get order by ID HTTP response code 200")
	def verifyInfoResponseCode() {
		println ("\n I am verify Get order by ID HTTP response code 200")

		WS.verifyResponseStatusCode(response, 200)
	}
	//Negative
	
	@Given("I am send request for Create a new order without access token")
	def sendRequestCreateNewOrderWithoudAccessToken() {
		println ("\n I am send request for Create a new order without access token")

		response = WS.sendRequest(findTestObject('API/Orders Negative/Create a new order'))
	}

	@Then("I am verify Create a new order without access token HTTP response code 401")
	def verifyCreateNewOrderWithoudAccessTokenResponseCode() {
		println ("\n I am verify Create a new order without access token HTTP response code 401")

		WS.verifyResponseStatusCode(response, 401)
	}

	@Given("I am send request for Get all orders with invalid endpoint")
	def sendRequestGetAllOrderWithInvalidEndpoint() {
		println ("\n I am send request for Get all orders with invalid endpoint")

		response = WS.sendRequest(findTestObject('API/Orders Negative/Get all orders'))
	}

	@Then("I am verify Get all orders with invalid endpoint HTTP response code 404")
	def verifyGetAllOrderWithInvalidEndpointResponseCode() {
		println ("\n I am verify Get all orders with invalid endpoint HTTP response code 404")

		WS.verifyResponseStatusCode(response, 404)
	}

	@Given("I am send request for Get order by id without access token")
	def sendRequestGetOrderByIdWithoutAccessToken() {
		println ("\n I am send request for Get order by ID")

		response = WS.sendRequest(findTestObject('API/Orders Negative/Get order by id'))
	}

	@Then("I am verify Get order by id without access token HTTP response code 401")
	def verifyGetOrderByIdWithoutAccessTokenResponseCode() {
		println ("\n I am verify Get order by id without access token HTTP response code 401")

		WS.verifyResponseStatusCode(response, 401)
	}
}
