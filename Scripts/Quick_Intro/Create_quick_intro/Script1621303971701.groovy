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

WebUI.navigateToUrl('https://notifications-api-development.herokuapp.com')

WebUI.waitForPageLoad(20)

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.setText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), GlobalVariable.email_quick_intro)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Password'), GlobalVariable.encryptedPassword)

WebUI.click(findTestObject('Object Repository/Page_Auth0_SignIn/button_Log In'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Contacts_Dashboard/Contact_Tittle'), 10)

WebUI.mouseOver(findTestObject('Object Repository/Page_Contacts_Dashboard/Main_Contact_Row'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Contacts_Dashboard/Start_Quick_Intro_Button'))

WebUI.click(findTestObject('Object Repository/Page_Contacts_Dashboard/Start_Quick_Intro_Button'))

WebUI.verifyElementPresent(findTestObject('Page_Quick_Intro/Section_Main_Contact (1)'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Quick_Intro/Section_Select_Contacts (1)'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Quick_Intro/Section_Short_Message_For_Recipient (1)'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Quick_Intro/button_Got It'), 5)

WebUI.click(findTestObject('Page_Quick_Intro/button_Got It'))

WebUI.setText(findTestObject('Page_Quick_Intro/Search_contact'), 'recipient')

WebUI.click(findTestObject('Page_Quick_Intro/Search_contact'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Create_Intro/Intro2_User_Add_Button'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create_Intro/Intro2_User_Add_Button'), 5)

WebUI.mouseOver(findTestObject('Object Repository/Page_Create_Intro/Intro2_User_Add_Button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Create_Intro/Intro2_User_Add_Button'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create_Intro/Intro2_User_Add_Button'), 5)

WebUI.click(findTestObject('Object Repository/Page_Create_Intro/Intro2_User_Add_Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Page_Quick_Intro/span_Request Introduction message_mdl-butto_015823'))

WebUI.click(findTestObject('Page_Quick_Intro/span_Request Introduction message_mdl-butto_015823'))

WebUI.verifyElementClickable(findTestObject('Page_Quick_Intro/button_Yes, Request Introduction message'))

WebUI.click(findTestObject('Page_Quick_Intro/button_Yes, Request Introduction message'))

WebUI.waitForElementPresent(findTestObject('Page_Quick_Intro/Modal_introduced_contact_introduction_message_sent'), 5)

WebUI.navigateToUrl('https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.waitForPageLoad(20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Gmail/input_Ir a Gmail_identifier'), 5)

WebUI.setText(findTestObject('Object Repository/Page_Gmail/input_Ir a Gmail_identifier'), 'introduced.omr@gmail.com')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Gmail/div_Siguiente_VfPpkd-RLmnJb'))

WebUI.click(findTestObject('Object Repository/Page_Gmail/div_Siguiente_VfPpkd-RLmnJb'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Gmail/input_Se han producido demasiados intentos _9b645a'), 
    5)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Gmail/input_Se han producido demasiados intentos _9b645a'), 
    'tnM9pyQGa2UJlSvG75G1pA==')

WebUI.click(findTestObject('Object Repository/Page_Gmail/div_Siguiente_VfPpkd-RLmnJb_1'))

WebUI.verifyElementPresent(findTestObject('Page_Quick_Intro/Quick_intro_message_request_email'), 5)

WebUI.click(findTestObject('Page_Quick_Intro/Quick_intro_message_request_email'))

WebUI.verifyElementPresent(findTestObject('Page_Quick_Intro/Introduction_request_link'), 5)

WebUI.click(findTestObject('Page_Quick_Intro/Introduction_request_link'))

WebUI.switchToWindowIndex('1')

WebUI.waitForElementVisible(findTestObject('Page_Quick_Intro/input_BIO REQUEST_first_name'), 5)

WebUI.setText(findTestObject('Page_Quick_Intro/input_BIO REQUEST_first_name'), 'Main')

WebUI.waitForElementVisible(findTestObject('Page_Quick_Intro/input_Field required_last_name'), 5)

WebUI.click(findTestObject('Page_Quick_Intro/input_Field required_last_name'))

WebUI.waitForElementVisible(findTestObject('Page_Quick_Intro/textarea_pThis is an intro message for Main_cb300b'), 0)

WebUI.setText(findTestObject('Page_Quick_Intro/textarea_pThis is an intro message for Main_cb300b'), 'This is an intro message for Main Contact')

WebUI.click(findTestObject('Page_Quick_Intro/span_Confirm_mdl-button__ripple-container'))

WebUI.switchToWindowIndex('0')

WebUI.click(findTestObject('Page_Quick_Intro/div__asa'))

WebUI.click(findTestObject('Object Repository/Page_Recibidos (2) - introduced.omrgmail.co_9945ab/img_Enviar comentarios a Google_gb_Da gbii'))

WebUI.click(findTestObject('Object Repository/Page_Recibidos (2) - introduced.omrgmail.co_9945ab/a_Salir'))

WebUI.navigateToUrl('https://app-dev.onmyradar.io/v2/contacts')

WebUI.waitForElementVisible(findTestObject('Page_Quick_Intro/div_MCMain Contactintroduced.omrgmail.com'), 0)

WebUI.click(findTestObject('Page_Quick_Intro/div_MCMain Contactintroduced.omrgmail.com'))

WebUI.waitForElementVisible(findTestObject('Page_Quick_Intro/div_Main Contact'), 0)

WebUI.click(findTestObject('Page_Quick_Intro/div_Main Contact'))

WebUI.waitForElementVisible(findTestObject('Page_Quick_Intro/svg_Main Contact_feather feather-edit conta_0154f3'), 0)

WebUI.click(findTestObject('Page_Quick_Intro/svg_Main Contact_feather feather-edit conta_0154f3'))

WebUI.waitForElementVisible(findTestObject('Page_Quick_Intro/input_BIO REQUEST_first_name'), 0)

WebUI.setText(findTestObject('Page_Quick_Intro/input_BIO REQUEST_first_name'), 'Introduced')

WebUI.waitForElementVisible(findTestObject('Page_Quick_Intro/div_This is an intro message for introduced_401b92'), 0)

WebUI.setText(findTestObject('Page_Quick_Intro/div_This is an intro message for introduced_401b92'), 'This is an intro message for introduced contact')

WebUI.waitForElementClickable(findTestObject('Page_Quick_Intro/span_Done_mdl-button__ripple-container'), 0)

WebUI.click(findTestObject('Page_Quick_Intro/span_Done_mdl-button__ripple-container'))

WebUI.verifyElementClickable(findTestObject('Nav_Bar/Profile_Dropdown'))

WebUI.click(findTestObject('Nav_Bar/Profile_Dropdown'))

WebUI.verifyElementClickable(findTestObject('Nav_Bar/Log_Out_Button'))

WebUI.click(findTestObject('Nav_Bar/Log_Out_Button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.closeBrowser()

def clickUsingJS(TestObject to, int timeout) {
    WebDriver driver = DriverFactory.getWebDriver()

    WebElement element = WebUiCommonHelper.findWebElement(to, timeout)

    JavascriptExecutor executor = ((driver) as JavascriptExecutor)

    executor.executeScript('\n\t\tfunction triggerMouseEvent(targetNode, eventType) {\n        \tvar clickEvent = document.createEvent(\'MouseEvents\');\n        \tclickEvent.initEvent(eventType, true, true);\n        \ttargetNode.dispatchEvent(clickEvent);\n\t\t};\n\t\t\n\t\ttriggerMouseEvent(arguments[0], "mouseover");\n\t\ttriggerMouseEvent(arguments[0], "mousedown");\n\t\ttriggerMouseEvent(arguments[0], "mouseup");\n\t\ttriggerMouseEvent(arguments[0], "click");\n\t', 
        element)
}

