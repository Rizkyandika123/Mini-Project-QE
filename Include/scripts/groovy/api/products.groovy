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



class products {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	ResponseObject response

	@Given("I am send request for Create a new product")
	def sendRequestCreateNewProduct() {
		println ("\n I am send request for Create a new product")

		response = WS.sendRequest(findTestObject('API/Products/Create a new product'))
	}

	@Then("I am verify Create a new product HTTP response code 200")
	def verifyCreateNewProductResponseCode() {
		println ("\n I am verify Create a new product HTTP response code 200")

		WS.verifyResponseStatusCode(response, GlobalVariable.Statuscode)
	}

	@Given("I am send request for Get all product")
	def sendRequestGetAllProduct() {
		println ("\n I am send request for Get all product")

		response = WS.sendRequest(findTestObject('API/Products/Get all product'))
	}

	@Then("I am verify Get all product HTTP response code 200")
	def verifyGetAllProductResponseCode() {
		println ("\n I am verify Get all product HTTP response code 200")

		WS.verifyResponseStatusCode(response, GlobalVariable.Statuscode)
	}

	@Given("I am send request for Get product by ID")
	def sendRequestGetProductById() {
		println ("\n I am send request for Get product by ID")

		response = WS.sendRequest(findTestObject('API/Orders/Get order by id'))
	}

	@Then("I am verify Get product by ID HTTP response code 200")
	def verifyGetProductByIdResponseCode() {
		println ("\n I am verify Get product by ID HTTP response code 200")

		WS.verifyResponseStatusCode(response, GlobalVariable.Statuscode)
	}

	@Given("I am send request for Delete a product")
	def sendRequestDeleteProduct() {
		println ("\n I am send request for Delete a product")

		response = WS.sendRequest(findTestObject('API/Products/Delete a product'))
	}

	@Then("I am verify Delete a product HTTP response code 200")
	def verifyDeleteProductResponseCode() {
		println ("\n I am verify Delete a product HTTP response code 200")

		WS.verifyResponseStatusCode(response, GlobalVariable.Statuscode)
	}

	@Given("I am send request for Assign a product rating")
	def sendRequestAssignProductRating() {
		println ("\n I am send request for Assign a product rating")

		response = WS.sendRequest(findTestObject('API/Products/Assign a product rating'))
	}

	@Then("I am verify Assign a product rating HTTP response code 200")
	def verifyAssignProductRatingResponseCode() {
		println ("\n I am verify Assign a product rating HTTP response code 200")

		WS.verifyResponseStatusCode(response, 200)
	}

	@Given("I am send request for Get product ratings")
	def sendRequestGetProductRatings() {
		println ("\n I am send request for Get product ratings")

		response = WS.sendRequest(findTestObject('API/Products/Get product ratings'))
	}

	@Then("I am verify Get product ratings HTTP response code 200")
	def verifyGetProductRatingsResponseCode() {
		println ("\n I am verify Get product ratings HTTP response code 200")

		WS.verifyResponseStatusCode(response, GlobalVariable.Statuscode)
	}

	@Given("I am send request for Create a comment of product")
	def sendRequestCreateCommentOfProduct() {
		println ("\n I am send request for Create a comment of product")

		response = WS.sendRequest(findTestObject('API/Products/Create a comment fo product'))
	}

	@Then("I am verify Create a comment of product HTTP response code 200")
	def verifyCreateCommentOfProductResponseCode() {
		println ("\n I am verify Create a comment of product HTTP response code 200")

		WS.verifyResponseStatusCode(response, GlobalVariable.Statuscode)
	}

	@Given("I am send request for Get product comment")
	def sendRequestGetProductComment() {
		println ("\n I am send request for Get product comment")

		response = WS.sendRequest(findTestObject('API/Products/Get product comment'))
	}

	@Then("I am verify Get product comment HTTP response code 200")
	def verifyGetProductCommentResponseCode() {
		println ("\n I am verify Get product comment HTTP response code 200")

		WS.verifyResponseStatusCode(response, GlobalVariable.Statuscode)
	}

	//negative

	@Given("I am send request for Create a new product with invalid endpoint")
	def sendRequestCreateNewProductWithInvalidEndpoint() {
		println ("\n I am send request for Create a new product with invalid endpoint")

		response = WS.sendRequest(findTestObject('API/Products Negative/Create a new product'))
	}

	@Then("I am verify Create a new product with invalid endpoint HTTP response code 404")
	def verifyCreateNewProductWithInvalidEndpointResponseCode() {
		println ("\n I am verify Create a new product with invalid endpoint HTTP response code 404")

		WS.verifyResponseStatusCode(response, 404)
	}

	@Given("I am send request for Get all product with invalid endpoint")
	def sendRequestGetAllProductWithInvalidEndpoint() {
		println ("\n I am send request for Get all product with invalid endpoint")

		response = WS.sendRequest(findTestObject('API/Products Negative/Get all product'))
	}

	@Then("I am verify Get all product with invalid endpoint HTTP response code 404")
	def verifyGetAllProductWithInvalidEndpointResponseCode() {
		println ("\n I am verify Get all product with invalid endpoint HTTP response code 404")

		WS.verifyResponseStatusCode(response, 404)
	}

	@Given("I am send request for Get product by ID with invalid ID")
	def sendRequestGetProductByIdWithInvalidId() {
		println ("\n I am send request for Get product by ID with invalid ID")

		response = WS.sendRequest(findTestObject('API/Products Negative/Get product By ID'))
	}

	@Then("I am verify Get product by ID with invalid ID HTTP response code 404")
	def verifyGetProductByIdWithInvalidIdResponseCode() {
		println ("\n I am verify Get product by ID with invalid ID HTTP response code 404")

		WS.verifyResponseStatusCode(response, 404)
	}

	@Given("I am send request for Delete a product with invalid endpoint")
	def sendRequestDeleteProductWithInvalidEndpoint() {
		println ("\n I am send request for Delete a product with invalid endpoint")

		response = WS.sendRequest(findTestObject('API/Products Negative/Delete a product'))
	}

	@Then("I am verify Delete a product with invalid endpoint HTTP response code 404")
	def verifyDeleteProductWithInvalidEndpointResponseCode() {
		println ("\n I am verify Delete a product with invalid endpoint HTTP response code 404")

		WS.verifyResponseStatusCode(response, 404)
	}

	@Given("I am send request for Assign a product rating without access token")
	def sendRequestAssignProductRatingWithoutAccessToken() {
		println ("\n I am send request for Assign a product rating without access token")

		response = WS.sendRequest(findTestObject('API/Products Negative/Assign a product rating'))
	}

	@Then("I am verify Assign a product rating HTTP response code 401")
	def verifyAssignProductRatingWithoutAccessTokenResponseCode() {
		println ("\n I am verify Assign a product rating HTTP response code 401")

		WS.verifyResponseStatusCode(response, 401)
	}

	@Given("I am send request for Get product ratings with invalid endpoint")
	def sendRequestGetProductRatingsWithInvalidEndpoint() {
		println ("\n I am send request for Get product ratings with invalid endpoint")

		response = WS.sendRequest(findTestObject('API/Products Negative/Get product ratings'))
	}

	@Then("I am verify Get product ratings HTTP response code 404")
	def verifyGetProductRatingsWithInvalidEndpointResponseCode() {
		println ("\n I am verify Get product ratings HTTP response code 404")

		WS.verifyResponseStatusCode(response, 404)
	}

	@Given("I am send request for Create a comment of product without access token")
	def sendRequestCreateCommentOfProductWithoutAccessToken() {
		println ("\n I am send request for Create a comment of product without access token")

		response = WS.sendRequest(findTestObject('API/Products Negative/Create a comment fo product'))
	}

	@Then("I am verify Create a comment of product without access token HTTP response code 401")
	def verifyCreateCommentOfProductWithoutAccessTokenResponseCode() {
		println ("\n I am verify Create a comment of product without access token HTTP response code 401")

		WS.verifyResponseStatusCode(response, 401)
	}

	@Given("I am send request for Get product comment with invalid endpoint")
	def sendRequestGetProductCommentWithInvalidEndpoint() {
		println ("\n I am send request for Get product comment with invalid endpoint")

		response = WS.sendRequest(findTestObject('API/Products Negative/Get product comment'))
	}

	@Then("I am verify Get product comment with invalid endpoint HTTP response code 404")
	def verifyGetProductWithInvalidEndpointCommentResponseCode() {
		println ("\n I am verify Get product comment with invalid endpoint HTTP response code 404")

		WS.verifyResponseStatusCode(response, 404)
	}
}
