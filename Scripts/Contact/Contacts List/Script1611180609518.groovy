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

String search_text = 'Example Contact2'

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementPresent(findTestObject('Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.setText(findTestObject('Page_Auth0_SignIn/Log_In_Email'), GlobalVariable.email_contact_list)

WebUI.setEncryptedText(findTestObject('Page_Auth0_SignIn/Log_In_Password'), GlobalVariable.encryptedPassword)

WebUI.click(findTestObject('Object Repository/Page_Auth0_SignIn/button_Log In'))

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/contacts_message'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/contacts_message'), 10)

clickUsingJS(findTestObject('Page_Contacts_Dashboard/Group1_Checkbox'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Group1_Bubble'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/Group1_Bubble'), 10)

clickUsingJS(findTestObject('Page_Contacts_Dashboard/Group1_Checkbox'), 10)

clickUsingJS(findTestObject('Page_Contacts_Dashboard/Group2_Checkbox'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Group2_Bubble'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/Group2_Bubble'), 10)

clickUsingJS(findTestObject('Page_Contacts_Dashboard/Group2_Checkbox'), 10)

clickUsingJS(findTestObject('Page_Contacts_Dashboard/Group3_Checkbox'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Group3_Bubble'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/Group3_Bubble'), 10)

clickUsingJS(findTestObject('Page_Contacts_Dashboard/Group3_Checkbox'), 10)

WebUI.waitForElementPresent(findTestObject('Nav_Bar/Search_Bar'), 10)

WebUI.setText(findTestObject('Nav_Bar/Search_Bar'), search_text)

String xpath = ('//div[@class="user-profile_name"][.="' + search_text) + '"]'

TestObject search_results = new TestObject('objectName')

search_results.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.waitForElementPresent(search_results, 10)

WebUI.verifyElementPresent(search_results, 10)

def clickUsingJS(TestObject to, int timeout) {
    WebDriver driver = DriverFactory.getWebDriver()

    WebElement element = WebUiCommonHelper.findWebElement(to, timeout)

    JavascriptExecutor executor = ((driver) as JavascriptExecutor)

    executor.executeScript('arguments[0].click()', element)
}

