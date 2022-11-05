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

Mobile.verifyElementText(findTestObject('Mobile/Verify Object/Verify Object Home Page - Page Title'), 'Products')

Mobile.tap(findTestObject('Mobile/Login/android.widget.Button'), 0)

Mobile.tap(findTestObject('Mobile/Login/android.widget.EditText - Email'), 0)

Mobile.setText(findTestObject('Mobile/Login/android.widget.EditText - Email'), 'testsatu@email.com', 0)

Mobile.tap(findTestObject('Mobile/Login/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Mobile/Login/android.widget.EditText - Password'), '1234567890', 0)

Mobile.tap(findTestObject('Mobile/Login/android.widget.Button - Login'), 0)

Mobile.verifyElementExist(findTestObject('Mobile/Verify Object/Verify Object Home Page - Logout Button'), 0)

