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
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.DataFlavor as DataFlavor

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.notifications_api_url)

WebUI.waitForPageLoad(20)

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), 10)

WebUI.setText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), GlobalVariable.email_contact_list)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Password'), GlobalVariable.encryptedPassword)

WebUI.click(findTestObject('Object Repository/Page_Auth0_SignIn/button_Log In'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Contacts_Dashboard/contacts_message'), 10)

WebUI.verifyElementPresent(findTestObject('Nav_Bar/Profile_Dropdown'), 5)

WebUI.click(findTestObject('Nav_Bar/Profile_Dropdown'))

WebUI.verifyElementPresent(findTestObject('Nav_Bar/Profile_Link'), 5)

WebUI.click(findTestObject('Nav_Bar/Profile_Link'))

WebUI.verifyElementPresent(findTestObject('Page_profile/Copy_Button'), 10)

WebUI.click(findTestObject('Page_profile/Copy_Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('Page_Contacts_Dashboard/Url_Copied_Toast'), 5)

String my_clipboard = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null).getTransferData(DataFlavor.stringFlavor)

WebUI.navigateToUrl(my_clipboard)

WebUI.verifyElementPresent(findTestObject('Page_user_form/first_name_input'), 5)

WebUI.click(findTestObject('Page_user_form/first_name_input'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_user_form/first_name_input'), 'Test Name')

WebUI.verifyElementPresent(findTestObject('Page_user_form/last_name_input'), 1)

WebUI.click(findTestObject('Page_user_form/last_name_input'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_user_form/last_name_input'), 'Last Test')

WebUI.verifyElementPresent(findTestObject('Page_user_form/email_input'), 1)

WebUI.click(findTestObject('Page_user_form/email_input'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_user_form/email_input'), GlobalVariable.contact_url_request_email)

WebUI.verifyElementPresent(findTestObject('Page_user_form/title_input'), 1)

WebUI.click(findTestObject('Page_user_form/title_input'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_user_form/title_input'), 'Employee')

WebUI.verifyElementPresent(findTestObject('Page_user_form/company_input'), 1)

WebUI.click(findTestObject('Page_user_form/company_input'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_user_form/company_input'), 'Testing Company')

WebUI.verifyElementPresent(findTestObject('Page_user_form/keywords_input'), 1)

WebUI.focus(findTestObject('Page_user_form/keywords_input'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_user_form/keywords_input'), 'Employee')

WebUI.waitForElementClickable(findTestObject('Page_user_form/keywords_confirm'), 1)

WebUI.click(findTestObject('Page_user_form/keywords_confirm'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_user_form/looking_for_textarea'), 1)

WebUI.focus(findTestObject('Page_user_form/looking_for_textarea'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_user_form/looking_for_textarea'), 'I\'m looking for a meeting')

WebUI.verifyElementPresent(findTestObject('Page_user_form/button_send_user_form'), 1)

WebUI.click(findTestObject('Page_user_form/button_send_user_form'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Page_user_form/div_success'), 10)

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementPresent(findTestObject('Nav_Bar/Badge_One_Notification'), 5)

WebUI.click(findTestObject('Nav_Bar/Badge_One_Notification'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Nav_Bar/Notifications_List_Title'), 2)

WebUI.verifyElementPresent(findTestObject('Nav_Bar/First_Notification'), 2)

WebUI.click(findTestObject('Nav_Bar/First_Notification'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Page_introduction_requests/first_introduction_request'), 5)

WebUI.mouseOver(findTestObject('Page_introduction_requests/first_introduction_request'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_introduction_requests/start_intro_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_introduction_requests/start_intro_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Search_Input'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Search_Input'), 5)

WebUI.setText(findTestObject('Page_Create_Intro/Search_Input'), 'exam')

WebUI.waitForElementVisible(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), 2)

WebUI.mouseOver(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'))

WebUI.verifyElementVisible(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro_Subject_Input'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro_Subject_Input'), 5)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro_Content'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro_Content'), 5)

WebUI.click(findTestObject('Page_Create_Intro/Send_Introduction_Button'))

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro_Sent_Span'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro_Sent_Span'), 2)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro_Sent_Message'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro_Sent_Message'), 5)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Read_Only_Subject'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Read_Only_Subject'), 5)

WebUI.verifyElementText(findTestObject('Page_Create_Intro/Read_Only_Subject'), subject)

WebUI.verifyElementText(findTestObject('Page_Create_Intro/Read_Only_Content'), final_content)

