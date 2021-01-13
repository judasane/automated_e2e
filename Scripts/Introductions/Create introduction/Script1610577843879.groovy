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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://web-portal-app-development.herokuapp.com')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), 5)

WebUI.setText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), 'e2e.test.create.introduction@onmyradar.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Password'), 'tnM9pyQGa2UJlSvG75G1pA==')

WebUI.click(findTestObject('Object Repository/Page_Auth0_SignIn/button_Log In'))

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/Test_Intro_User_Row'), 20)

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/Test_Intro2_User_Row'), 20)

WebUI.mouseOver(findTestObject('Page_Contacts_Dashboard/Test_Intro_User_Row'))

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Start_Intro_Button'), 10)

WebUI.click(findTestObject('Page_Contacts_Dashboard/Start_Intro_Button'))

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Search_Input'), 10)

WebUI.setText(findTestObject('Page_Create_Intro/Search_Input'), 'Test')

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Test_Intro2_User_Row'), 5)

WebUI.mouseOver(findTestObject('Page_Create_Intro/Test_Intro2_User_Row'))

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), 0)

def clickUsingJS(TestObject to, int timeout)
{
	WebDriver driver = DriverFactory.getWebDriver()
	WebElement element = WebUiCommonHelper.findWebElement(to, timeout)
	JavascriptExecutor executor = ((driver) as JavascriptExecutor)
	executor.executeScript('arguments[0].click()', element)
}

clickUsingJS(findTestObject('Page_Create_Intro/Test_Intro2_User_Row'), 30)