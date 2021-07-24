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


def format_old_content (String original_string, String introduced_first_name, String recipient_first_name, String connector_name, String recipient_introduction_message, String introduced_introduction_message) {
	String formatted_string = original_string.replace('{introduced_first_name}', introduced_first_name)
	formatted_string = formatted_string.replace('{recipient_first_name}', recipient_first_name)
	formatted_string = formatted_string.replace('{user_display_name}', connector_name)
	formatted_string = formatted_string.replace('{recipient_introduction_message}', recipient_introduction_message)
	formatted_string = formatted_string.replace('{introduced_introduction_message}', introduced_introduction_message)
	formatted_string = formatted_string.replace('<br>', '\n')
	return formatted_string
}

String subject = 'New Subject'

String content = 'New Intro '

String intro_template= GlobalVariable.intro_template
String connector_name = 'e2e.test.create.introduction'
String recipient_first_name = '0. Test'
String introduced_first_name = '0. Test'
String recipient_introduction_message = 'Some intro'
String introduced_introduction_message = 'Some user'
String old_content = format_old_content(intro_template, introduced_first_name, recipient_first_name, connector_name, recipient_introduction_message, introduced_introduction_message)


String final_content = content + old_content

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

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Search_Input'), 5)

WebUI.setText(findTestObject('Page_Create_Intro/Search_Input'), 'intro2')

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), 5)

WebUI.mouseOver(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'))

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), 5)

clickUsingJS(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), 30)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro_Subject_Input'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro_Subject_Input'), 5)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro_Content'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro_Content'), 5)

WebUI.setText(findTestObject('Page_Create_Intro/Intro_Subject_Input'), subject)

WebUI.setText(findTestObject('Page_Create_Intro/Intro_Content'), content)

WebUI.click(findTestObject('Page_Create_Intro/Send_Introduction_Button'))

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro_Sent_Span'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro_Sent_Span'), 5)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro_Sent_Message'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro_Sent_Message'), 5)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Read_Only_Subject'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Read_Only_Subject'), 5)

WebUI.verifyElementText(findTestObject('Page_Create_Intro/Read_Only_Subject'), subject)

WebUI.verifyElementText(findTestObject('Page_Create_Intro/Read_Only_Content'), final_content)

def clickUsingJS(TestObject to, int timeout) {
    WebDriver driver = DriverFactory.getWebDriver()

    WebElement element = WebUiCommonHelper.findWebElement(to, timeout)

    JavascriptExecutor executor = ((driver) as JavascriptExecutor)

    executor.executeScript('\n\t\tfunction triggerMouseEvent(targetNode, eventType) {\n        \tvar clickEvent = document.createEvent(\'MouseEvents\');\n        \tclickEvent.initEvent(eventType, true, true);\n        \ttargetNode.dispatchEvent(clickEvent);\n\t\t};\n\t\t\n\t\ttriggerMouseEvent(arguments[0], "mouseover");\n\t\ttriggerMouseEvent(arguments[0], "mousedown");\n\t\ttriggerMouseEvent(arguments[0], "mouseup");\n\t\ttriggerMouseEvent(arguments[0], "click");\n\t', 
        element)
}



