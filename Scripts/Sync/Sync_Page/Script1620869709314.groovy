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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.setText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), GlobalVariable.email_contact_list)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Password'), GlobalVariable.encryptedPassword)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Auth0_SignIn/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Auth0_SignIn/button_Log In'))

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/contacts_message'), 10)

WebUI.verifyElementClickable(findTestObject('Side_Bar/Burger_Icon'))

WebUI.click(findTestObject('Side_Bar/Burger_Icon'))

WebUI.verifyElementClickable(findTestObject('Side_Bar/Sidebar_Sync_Item'))

WebUI.click(findTestObject('Side_Bar/Sidebar_Sync_Item'))

WebUI.verifyElementPresent(findTestObject('Page_Sync/Sync_Settings_Title'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Sync/Google_Sync_Button'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Sync/Microsoft_Sync_Button'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Sync/Twitter Sync Button'), 5)

WebUI.verifyElementClickable(findTestObject('Nav_Bar/Profile_Dropdown'))

WebUI.click(findTestObject('Nav_Bar/Profile_Dropdown'))

WebUI.verifyElementClickable(findTestObject('Nav_Bar/Log_Out_Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Nav_Bar/Log_Out_Button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.closeBrowser()

