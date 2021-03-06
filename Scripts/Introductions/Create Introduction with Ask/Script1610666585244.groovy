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

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), 5)

WebUI.setText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), GlobalVariable.email_create_introduction)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Password'), GlobalVariable.encryptedPassword)

WebUI.click(findTestObject('Object Repository/Page_Auth0_SignIn/button_Log In'))

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Contacts_Tittle'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/Contacts_Tittle'), 5)

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Search_Nav_Bar'), '0. Test')

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/Test_Intro_User_Row'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/Test_Intro2_User_Row'), 5)

WebUI.mouseOver(findTestObject('Page_Contacts_Dashboard/Test_Intro_User_Row'))

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Start_Intro_Button'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/Start_Intro_Button'), 5)

WebUI.click(findTestObject('Page_Contacts_Dashboard/Start_Intro_Button'))

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Search_Input'), 5)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Search_Input'), 5)

WebUI.setText(findTestObject('Page_Create_Intro/Search_Input'), 'intro2')

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), 5)

WebUI.mouseOver(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'))

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), 5)

clickUsingJS(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), 30)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Check_Answer1'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Check_Answer1'), 5)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Check_Answer2'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Check_Answer2'), 5)

clickUsingJS(findTestObject('Page_Create_Intro/Check_Answer1'), 30)

WebUI.waitForElementNotPresent(findTestObject('Page_Create_Intro/Check_Answer_disabled'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Ask_Introduce'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Ask_Introduce'), 5)

clickUsingJS(findTestObject('Page_Create_Intro/Check_Answer1'), 30)

WebUI.waitForElementNotPresent(findTestObject('Page_Create_Intro/Check_Answer_disabled'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Create_Intro/Ask_Introduce'), 5)

WebUI.verifyElementNotPresent(findTestObject('Page_Create_Intro/Ask_Introduce'), 5)

clickUsingJS(findTestObject('Page_Create_Intro/Check_Answer2'), 30)

WebUI.waitForElementNotPresent(findTestObject('Page_Create_Intro/Check_Answer_disabled'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Ask_Contact'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Ask_Contact'), 5)

clickUsingJS(findTestObject('Page_Create_Intro/Check_Answer2'), 30)

WebUI.waitForElementNotPresent(findTestObject('Page_Create_Intro/Check_Answer_disabled'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Create_Intro/Ask_Contact'), 5)

WebUI.verifyElementNotPresent(findTestObject('Page_Create_Intro/Ask_Contact'), 5)

clickUsingJS(findTestObject('Page_Create_Intro/Check_Answer1'), 30)

WebUI.waitForElementNotPresent(findTestObject('Page_Create_Intro/Check_Answer_disabled'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Ask_Introduce'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Ask_Introduce'), 5)

clickUsingJS(findTestObject('Page_Create_Intro/Check_Answer2'), 30)

WebUI.waitForElementNotPresent(findTestObject('Page_Create_Intro/Check_Answer_disabled'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Do_It_In_Advance'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Do_It_In_Advance'), 5)

clickUsingJS(findTestObject('Page_Create_Intro/Do_It_In_Advance'), 30)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Send_All_In_Advance'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Send_All_In_Advance'), 5)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro_Subject_Input'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro_Subject_Input'), 5)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro_Content'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro_Content'), 5)

WebUI.click(findTestObject('Page_Create_Intro/Send_All_In_Advance'))

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Waiting_For_Approval'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Waiting_For_Approval'), 5)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Waiting_For_Approval_Label'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Waiting_For_Approval_Label'), 5)

def clickUsingJS(TestObject to, int timeout) {
    WebDriver driver = DriverFactory.getWebDriver()

    WebElement element = WebUiCommonHelper.findWebElement(to, timeout)

    JavascriptExecutor executor = ((driver) as JavascriptExecutor)

    executor.executeScript('\n\t\tfunction triggerMouseEvent(targetNode, eventType) {\n        \tvar clickEvent = document.createEvent(\'MouseEvents\');\n        \tclickEvent.initEvent(eventType, true, true);\n        \ttargetNode.dispatchEvent(clickEvent);\n\t\t};\n\t\t\n\t\ttriggerMouseEvent(arguments[0], "mouseover");\n\t\ttriggerMouseEvent(arguments[0], "mousedown");\n\t\ttriggerMouseEvent(arguments[0], "mouseup");\n\t\ttriggerMouseEvent(arguments[0], "click");\n\t', 
        element)
}

