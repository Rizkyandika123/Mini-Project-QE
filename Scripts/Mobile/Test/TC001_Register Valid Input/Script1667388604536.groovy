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

Mobile.startApplication('C:\\Users\\iputu\\OneDrive\\Desktop\\MSIB\\Mini project\\app-release.apk', true)

Mobile.verifyElementAttributeValue(findTestObject('Mobile/Verify Object/android.view.View - verify text title home page'), 'content-desc', 
    'Products', 5)

Mobile.tap(findTestObject('Object Repository/Mobile/Register/android.widget.Button - Logout'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Register/android.widget.Button - Form Register'), 0)

Mobile.tap(findTestObject('Mobile/Register/android.widget.EditText - Form Fullname'), 0)

Mobile.setText(findTestObject('Mobile/Register/android.widget.EditText - Form Fullname'), 'Test Ename tes', 0)

Mobile.tap(findTestObject('Mobile/Register/android.widget.EditText - Form Email'), 0)

Mobile.setText(findTestObject('Mobile/Register/android.widget.EditText - Form Email'), 'testenametes@email.com', 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Register/android.widget.EditText - Form Password'), 0)

Mobile.setText(findTestObject('Mobile/Register/android.widget.EditText - Form Password'), '1234567890', 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Register/android.widget.Button - Register'), 5)

Mobile.verifyElementAttributeValue(findTestObject('Mobile/Verify Object/android.view.View - verify text title home page'), 'content-desc', 
    '', 5)

