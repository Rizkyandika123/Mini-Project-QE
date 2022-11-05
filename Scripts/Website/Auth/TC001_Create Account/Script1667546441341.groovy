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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://alta-shop.vercel.app/')

WebUI.click(findTestObject('Object Repository/Website/Auth/Object - Create Account/i_AltaShop_v-icon notranslate fas fa-sign-i_3d16a9'))

WebUI.click(findTestObject('Object Repository/Website/Auth/Object - Create Account/a_Register'))

WebUI.setText(findTestObject('Object Repository/Website/Auth/Object - Create Account/input_Nama Lengkap_input-1483'), 'Test Delapan')

WebUI.setText(findTestObject('Object Repository/Website/Auth/Object - Create Account/input_Email_input-1486'), 'testdelapan@email.com')

WebUI.setText(findTestObject('Object Repository/Website/Auth/Object - Create Account/input_Password_input-1489'), '1234567890')

WebUI.click(findTestObject('Object Repository/Website/Auth/Object - Create Account/span_Register'))

WebUI.verifyElementAttributeValue(findTestObject('Website/Verify Object/Verify Login Page'), 'class', 'v-card__title', 0)

