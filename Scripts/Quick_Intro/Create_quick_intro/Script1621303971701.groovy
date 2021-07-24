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

//TODO: Remove this if we're sure that notifications-api is awake always
WebUI.navigateToUrl(GlobalVariable.notifications_api_url)

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

WebUI.verifyElementPresent(findTestObject('Page_Quick_Intro/Section_Main_Contact'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Quick_Intro/Section_Select_Contacts'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Quick_Intro/Section_Short_Message_For_Recipient'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Quick_Intro/button_Got It'), 5)

WebUI.click(findTestObject('Page_Quick_Intro/button_Got It'))

WebUI.setText(findTestObject('Page_Quick_Intro/Search_contact'), 'recipient')

WebUI.click(findTestObject('Page_Quick_Intro/Search_contact'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Create_Intro/Intro2_User_Add_Button'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create_Intro/Intro2_User_Add_Button'), 5)

WebUI.mouseOver(findTestObject('Object Repository/Page_Create_Intro/Intro2_User_Add_Button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create_Intro/Intro2_User_Add_Button'), 5)

WebUI.click(findTestObject('Object Repository/Page_Create_Intro/Intro2_User_Add_Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Page_Quick_Intro/Request_intro_message_to_main_contact_button'))

WebUI.click(findTestObject('Page_Quick_Intro/Request_intro_message_to_main_contact_button'))

WebUI.verifyElementClickable(findTestObject('Page_Quick_Intro/button_Yes, Request Introduction message'))

WebUI.click(findTestObject('Page_Quick_Intro/button_Yes, Request Introduction message'))

WebUI.waitForElementPresent(findTestObject('Page_Quick_Intro/Modal_introduced_contact_introduction_message_sent'), 5)

WebUI.waitForElementClickable(findTestObject('Page_Quick_Intro/button_close_request_bio_modal'), 2)

WebUI.click(findTestObject('Page_Quick_Intro/button_close_request_bio_modal'))

WebUI.navigateToUrl(GlobalVariable.gmail_url)

WebUI.waitForPageLoad(20)

WebUI.verifyElementPresent(findTestObject('Page_Gmail/Gmail_form_email_address'), 5)

WebUI.setText(findTestObject('Page_Gmail/Gmail_form_email_address'), GlobalVariable.main_contact_email)

WebUI.verifyElementPresent(findTestObject('Page_Gmail/Gmail_form_next_button'), 5)

WebUI.click(findTestObject('Page_Gmail/Gmail_form_next_button'))

WebUI.verifyElementPresent(findTestObject('Page_Gmail/Gmail_form_password'), 5)

WebUI.setEncryptedText(findTestObject('Page_Gmail/Gmail_form_password'), GlobalVariable.encryptedPassword)

WebUI.click(findTestObject('Page_Gmail/Gmail_form_login_button'))

WebUI.verifyElementPresent(findTestObject('Page_Gmail/Page_Gmail_Inbox/Refresh_button'), 10)

WebUI.click(findTestObject('Page_Gmail/Page_Gmail_Inbox/Refresh_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Gmail/Page_Gmail_Inbox/gmail_inbox_first_email'), 5)

clickUsingJS(findTestObject('Page_Gmail/Page_Gmail_Inbox/gmail_inbox_first_email'), 30)

WebUI.verifyElementPresent(findTestObject('Page_Quick_Intro/Introduction_request_link'), 5)

clickUsingJS(findTestObject('Page_Quick_Intro/Introduction_request_link'), 30)

WebUI.switchToWindowIndex('1')

WebUI.waitForElementVisible(findTestObject('Page_Introduction_Request_Form/Request_intro_message_form_first_name_input'), 
    5)

WebUI.setText(findTestObject('Page_Introduction_Request_Form/Request_intro_message_form_first_name_input'), 'Main')

WebUI.waitForElementVisible(findTestObject('Page_Introduction_Request_Form/Request_intro_message_form_last_name_input'), 
    5)

WebUI.setText(findTestObject('Page_Introduction_Request_Form/Request_intro_message_form_last_name_input'), 'Test')

WebUI.waitForElementVisible(findTestObject('Page_Introduction_Request_Form/Request_intro_message_form_introduction_message_textarea'), 
    0)

WebUI.setText(findTestObject('Page_Introduction_Request_Form/Request_intro_message_form_introduction_message_textarea'), 
    'A new message')

WebUI.click(findTestObject('Page_Quick_Intro/Request_intro_message_form_confirm_button'))

WebUI.switchToWindowIndex('0')

WebUI.click(findTestObject('Page_Gmail/Page_Gmail_Inbox/Delete_message_button'))

WebUI.click(findTestObject('Page_Gmail/Page_Gmail_Inbox/Avatar_circle'))

WebUI.verifyElementPresent(findTestObject('Page_Gmail/Page_Gmail_Inbox/Exit_button'), 5)

WebUI.click(findTestObject('Page_Gmail/Page_Gmail_Inbox/Exit_button'))

WebUI.navigateToUrl(GlobalVariable.url + 'v2/contacts')

WebUI.waitForElementVisible(findTestObject('Page_Contacts_Dashboard/Main_Contact_Row'), 20)

WebUI.click(findTestObject('Page_Contacts_Dashboard/Main_Contact_Row'))

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Contact_Name'), 3)

WebUI.mouseOver(findTestObject('Page_Contacts_Dashboard/Contact_Name'))

WebUI.click(findTestObject('Page_Contacts_Dashboard/Edit_Contact_Button'))

WebUI.waitForElementVisible(findTestObject('Page_Introduction_Request_Form/Request_intro_message_form_first_name_input'), 
    3)

WebUI.setText(findTestObject('Page_Introduction_Request_Form/Request_intro_message_form_first_name_input'), 'Introduced')

WebUI.waitForElementVisible(findTestObject('Page_Contacts_Dashboard/Edit_contact_introduction_message'), 3)

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Edit_contact_introduction_message'), 'A message for introduced contact')

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Create_Contact_Done_Button'), 3)

WebUI.click(findTestObject('Page_Contacts_Dashboard/Create_Contact_Done_Button'))

WebUI.waitForElementVisible(findTestObject('Nav_Bar/Profile_Dropdown'), 3)

clickUsingJS(findTestObject('Nav_Bar/Profile_Dropdown'), 30)

WebUI.waitForElementVisible(findTestObject('Nav_Bar/Log_Out_Button'), 2)

clickUsingJS(findTestObject('Nav_Bar/Log_Out_Button'), 30)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 3)

WebUI.closeBrowser()

def clickUsingJS(TestObject to, int timeout) {
    WebDriver driver = DriverFactory.getWebDriver()

    WebElement element = WebUiCommonHelper.findWebElement(to, timeout)

    JavascriptExecutor executor = ((driver) as JavascriptExecutor)

    executor.executeScript('\n\t\tfunction triggerMouseEvent(targetNode, eventType) {\n        \tvar clickEvent = document.createEvent(\'MouseEvents\');\n        \tclickEvent.initEvent(eventType, true, true);\n        \ttargetNode.dispatchEvent(clickEvent);\n\t\t};\n\t\t\n\t\ttriggerMouseEvent(arguments[0], "mouseover");\n\t\ttriggerMouseEvent(arguments[0], "mousedown");\n\t\ttriggerMouseEvent(arguments[0], "mouseup");\n\t\ttriggerMouseEvent(arguments[0], "click");\n\t', 
        element)
}

