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

response = WS.sendRequest(findTestObject('API/Products/Create a new product'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('API/Products/Get all product'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('API/Orders/Get order by id'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('API/Products/Delete a product'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('API/Products/Assign a product rating'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('API/Products/Get product ratings'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('API/Products/Create a comment fo product'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('API/Products/Get product comment'))

WS.verifyResponseStatusCode(response, 200)

