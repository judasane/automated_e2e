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

String subject = 'New Subject'

String content = 'New Intro '

String old_content = 'Hi 0. Test and 0. Test,\nI hope this introduction is fruitful!\nHappy connecting!\n______________________________\ne2e.test.create.introduction'

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

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Contacts_Tittle'), 20)

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/Contacts_Tittle'), 20)

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Search_Nav_Bar'), '0.')

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/Test_Intro_User_Row'), 20)

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/Test_Intro2_User_Row'), 20)

WebUI.mouseOver(findTestObject('Page_Contacts_Dashboard/Test_Intro_User_Row'))

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Start_Intro_Button'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/Start_Intro_Button'), 10)

WebUI.click(findTestObject('Page_Contacts_Dashboard/Start_Intro_Button'))

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Search_Input'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Search_Input'), 10)

WebUI.setText(findTestObject('Page_Create_Intro/Search_Input'), 'Test')

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), 5)

WebUI.mouseOver(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'))

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), 0)

clickUsingJS(findTestObject('Page_Create_Intro/Intro2_User_Add_Button'), 30)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro_Subject_Input'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro_Subject_Input'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro_Content'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro_Content'), 10)

WebUI.setText(findTestObject('Page_Create_Intro/Intro_Subject_Input'), subject)

WebUI.setText(findTestObject('Page_Create_Intro/Intro_Content'), content)

WebUI.click(findTestObject('Page_Create_Intro/Send_Introduction_Button'))

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro_Sent_Span'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro_Sent_Span'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Intro_Sent_Message'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Intro_Sent_Message'), 10)

WebUI.waitForElementPresent(findTestObject('Page_Create_Intro/Read_Only_Subject'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Create_Intro/Read_Only_Subject'), 10)

WebUI.verifyElementText(findTestObject('Page_Create_Intro/Read_Only_Subject'), subject)

WebUI.verifyElementText(findTestObject('Page_Create_Intro/Read_Only_Content'), final_content)

def clickUsingJS(TestObject to, int timeout) {
    WebDriver driver = DriverFactory.getWebDriver()

    WebElement element = WebUiCommonHelper.findWebElement(to, timeout)

    JavascriptExecutor executor = ((driver) as JavascriptExecutor)

    executor.executeScript('arguments[0].click()', element)
}

