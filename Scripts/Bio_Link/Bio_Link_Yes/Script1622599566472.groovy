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

WebUI.waitForPageLoad(20)

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.setText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), GlobalVariable.email_quick_intro)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Password'), GlobalVariable.encryptedPassword)

WebUI.click(findTestObject('Object Repository/Page_Auth0_SignIn/button_Log In'))

WebUI.waitForPageLoad(20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contacts_Dashboard/Main_Contact_Row'), 10)

WebUI.mouseOver(findTestObject('Object Repository/Page_Contacts_Dashboard/Main_Contact_Row'))

WebUI.verifyElementClickable(findTestObject('Page_Contacts_Dashboard/Generate_Bio_Link_Button'))

WebUI.click(findTestObject('Page_Contacts_Dashboard/Generate_Bio_Link_Button'))

String my_clipboard = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null).getTransferData(DataFlavor.stringFlavor)

WebUI.navigateToUrl(my_clipboard)

WebUI.waitForPageLoad(20)

WebUI.verifyElementPresent(findTestObject('Page_Bio_Link/button_Yes'), 10)

WebUI.click(findTestObject('Page_Bio_Link/button_Yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Bio_Link/form_yes/bio_link_container'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Bio_Link/form_yes/email_input'), 5)

WebUI.click(findTestObject('Page_Bio_Link/form_yes/email_input'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Bio_Link/form_yes/email_input'), 'random@kanjea.app')

WebUI.verifyElementPresent(findTestObject('Page_Bio_Link/form_yes/first_name_input'), 5)

WebUI.click(findTestObject('Page_Bio_Link/form_yes/first_name_input'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Bio_Link/form_yes/first_name_input'), 'Test Name')

WebUI.verifyElementPresent(findTestObject('Page_Bio_Link/form_yes/last_name_input'), 5)

WebUI.click(findTestObject('Page_Bio_Link/form_yes/last_name_input'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Bio_Link/form_yes/last_name_input'), 'Last Test')

WebUI.verifyElementPresent(findTestObject('Page_Bio_Link/form_yes/title_input'), 5)

WebUI.click(findTestObject('Page_Bio_Link/form_yes/title_input'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Bio_Link/form_yes/title_input'), 'Employee')

WebUI.verifyElementPresent(findTestObject('Page_Bio_Link/form_yes/send_button'), 5)

WebUI.click(findTestObject('Page_Bio_Link/form_yes/send_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Bio_Link/div_success'), 5)

WebUI.closeBrowser()

