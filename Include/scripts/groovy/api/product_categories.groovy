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

import org.openqa.selenium.Keys as Keys




class product_categories {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	ResponseObject response

	@Given("I am send request for create a category")
	def sendRequestCreateCategory() {
		println ("\n I am send request for create a category")

		response = WS.sendRequest(findTestObject("API/Product Categories/Create a category"))
	}

	@Then("I am verify create a category HTTP response code 200")
	def verifyCreateCategoryResponseCode() {
		println ("\n I am verify create a category HTTP response code 200")

		WS.verifyResponseStatusCode(response, 200)
	}

	@Given("I am send request for get all category")
	def sendRequestGetAllCategory() {
		println ("\n I am send request for get all category")
		
		response = WS.sendRequest(findTestObject('API/Product Categories/Get all category'))
		
		
	}

	@Then("I am verify get all category HTTP response code 200")
	def verifyGetAllCategoryResponseCode() {
		println ("\n I am verify get all category HTTP response code 200")
		
		WS.verifyResponseStatusCode(response, 200)
	}

	@Given("I am send request for get category by id")
	def sendRequestGetCategoryByID() {
		println ("\n I am send request for get category by id")
		
		response = WS.sendRequest(findTestObject('API/Product Categories/Get category by ID'))
		
		
	}

	@Then("I am verify get category by id HTTP response code 200")
	def verifyGetCategoryByIDResponseCode() {
		println ("\n I am verify get category by id HTTP response code 200")
		
		WS.verifyResponseStatusCode(response, 200)
	}
	
	//negative
	
	@Given("I am send request for Create a product category with blank data input")
	def sendRequestCreateProductCategoryWithBlankDataInput() {
		println ("\n I am send request for Create a product category with blank data input")

		response = WS.sendRequest(findTestObject("API/Product Categories Negative/Create a category"))
	}

	@Then("I am verify Create a product category with blank data input HTTP response code 500")
	def verifyCreateProductCategoryWithBlankDataInpuResponseCode() {
		println ("\n I am verify Create a product category with blank data input HTTP response code 500")

		WS.verifyResponseStatusCode(response, 500)
	}

	@Given("I am send request for Get all category with invalid endpoint")
	def sendRequestGetAllCategoryWithInvalidEndpoint() {
		println ("\n I am send request for Get all category with invalid endpoint")
		
		response = WS.sendRequest(findTestObject("API/Product Categories Negative/Get all category"))
	}

	@Then("I am verify Get all category with invalid endpoint HTTP response code 404")
	def verifyGetAllCategoryWithInvalidEndpointResponseCode() {
		println ("\n I am verify Get all category with invalid endpoint HTTP response code 404")
		
		WS.verifyResponseStatusCode(response, 404)
	}

	@Given("I am send request for Get category with invalid ID")
	def sendRequestGetCategoryWithInvalidID() {
		println ("\n I am send request for Get category with invalid ID")
		
		response = WS.sendRequest(findTestObject("API/Product Categories Negative/Get category by ID"))
	}

	@Then("I am verify Get category with invalid ID HTTP response code 404")
	def verifyGetCategoryWithInvalidIDResponseCode() {
		println ("\n I am verify Get category with invalid ID HTTP response code 404")
		
		WS.verifyResponseStatusCode(response, 404)
	}
}