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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), 10)

WebUI.setText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), GlobalVariable.email_introduction_list)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Password'), GlobalVariable.encryptedPassword)

WebUI.click(findTestObject('Object Repository/Page_Auth0_SignIn/button_Log In'))

WebUI.waitForElementPresent(findTestObject('Nav_Bar/Nav_Bar'), 10)

WebUI.waitForElementPresent(findTestObject('Nav_Bar/Introductions_Nav_Bar'), 10)

WebUI.click(findTestObject('Nav_Bar/Introductions_Nav_Bar'))

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Introduction_Search_Bar'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Introduction_Search_Bar'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Approved_Check_Box'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Approved_Check_Box'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Completed_Check_Box'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Completed_Check_Box'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Declined_Check_Box'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Declined_Check_Box'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Draft_Check_Box'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Draft_Check_Box'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Pending_Check_Box'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Pending_Check_Box'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Successfull_Intros'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Successfull_Intros'), 10)

WebUI.verifyElementText(findTestObject('Page_Introduction_List/Successfull_Intros'), '1')

clickUsingJS(findTestObject('Page_Introduction_List/Approved_Check_Box'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

clickUsingJS(findTestObject('Page_Introduction_List/Approved_Check_Box'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

clickUsingJS(findTestObject('Page_Introduction_List/Completed_Check_Box'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

clickUsingJS(findTestObject('Page_Introduction_List/Completed_Check_Box'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

clickUsingJS(findTestObject('Page_Introduction_List/Declined_Check_Box'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

clickUsingJS(findTestObject('Page_Introduction_List/Declined_Check_Box'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

clickUsingJS(findTestObject('Page_Introduction_List/Draft_Check_Box'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

clickUsingJS(findTestObject('Page_Introduction_List/Draft_Check_Box'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

clickUsingJS(findTestObject('Page_Introduction_List/Pending_Check_Box'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Waiting_For_Approval_Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Intro_Sent_Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Approved_Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Declined Element'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

WebUI.verifyElementNotPresent(findTestObject('Page_Introduction_List/Draft_Element'), 10)

clickUsingJS(findTestObject('Page_Introduction_List/Pending_Check_Box'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Introduction_Search_Bar'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Introduction_Search_Bar'), 10)

WebUI.setText(findTestObject('Page_Introduction_List/Introduction_Search_Bar'), 'test4')

Thread.sleep(5000)

WebUI.waitForElementPresent(findTestObject('Page_Introduction_List/Search_Results'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Introduction_List/Search_Results'), 10)

Integer results = WebUiCommonHelper.findWebElements(findTestObject('Page_Introduction_List/Search_Results'), 10).size()

assert results == 4

def clickUsingJS(TestObject to, int timeout) {
    WebDriver driver = DriverFactory.getWebDriver()

    WebElement element = WebUiCommonHelper.findWebElement(to, timeout)

    JavascriptExecutor executor = ((driver) as JavascriptExecutor)

    executor.executeScript('arguments[0].click()', element)
}

