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
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang.RandomStringUtils as RandStr
import com.kms.katalon.core.testobject.ConditionType as ConditionType

String new_contact_name = RandStr.randomNumeric(5) + '+Test'

String new_contact_email = new_contact_name + '.test@email.com'

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), 10)

WebUI.setText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), GlobalVariable.email_create_contacts)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Password'), GlobalVariable.encryptedPassword)

WebUI.click(findTestObject('Object Repository/Page_Auth0_SignIn/button_Log In'))

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/First_Contact_Row'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/Create_New_Contact_Button'), 10)

WebUI.click(findTestObject('Page_Contacts_Dashboard/Create_New_Contact_Button'))

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/Contact_Email_input'), 10)

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Email_input'), new_contact_email)

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_First_Name_input'), new_contact_name)

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Last_Name_input'), 'User')

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Tittle_input'), 'Some Tittle')

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Company_input'), 'Some company')

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Bio_input'), 'Some bio')

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Notes_input'), 'Some Notes')

WebUI.click(findTestObject('Page_Contacts_Dashboard/Create_Contact_Done_Button'))

WebUI.verifyElementPresent(findTestObject('Nav_Bar/Search_Bar'), 0)

WebUI.setText(findTestObject('Nav_Bar/Search_Bar'), new_contact_name)

String xpath = ('//div[.="' + new_contact_name) + ' User"]//ancestor::div[2]'

TestObject to = new TestObject('objectName')

to.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.verifyElementPresent(to, 0)

