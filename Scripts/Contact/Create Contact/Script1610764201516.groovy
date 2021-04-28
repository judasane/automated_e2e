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

String new_contact_first_name = RandStr.randomNumeric(5) + '+First_name'

String new_contact_Last_name = RandStr.randomNumeric(5) + '+Last_name'

String new_contact_full_name = (new_contact_first_name + ' ') + new_contact_Last_name

String new_contact_email = new_contact_first_name + '.test@email.com'

String new_contact_title = 'Some Tittle'

String new_contact_company = 'Some company'

String new_contact_notes = 'Some Notes'

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

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_First_Name_input'), new_contact_first_name)

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Last_Name_input'), new_contact_Last_name)

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Tittle_input'), new_contact_title)

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Company_input'), new_contact_company)

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Notes_input'), new_contact_notes)

WebUI.click(findTestObject('Page_Contacts_Dashboard/Create_Contact_Done_Button'))

WebUI.verifyElementPresent(findTestObject('Nav_Bar/Search_Bar'), 0)

WebUI.setText(findTestObject('Nav_Bar/Search_Bar'), new_contact_first_name)

String xpath = ('//div[.="' + new_contact_full_name) + '"]//ancestor::div[2]'

TestObject contact = new TestObject('objectName')

contact.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.waitForElementPresent(contact, 10)

WebUI.verifyElementPresent(contact, 10)

WebUI.mouseOver(contact)

WebUI.click(findTestObject('Page_Contacts_Dashboard/Contact_Edit_Button'))

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Contact_Details_Name'), 10)

WebUI.verifyElementText(findTestObject('Page_Contacts_Dashboard/Contact_Details_Name'), new_contact_full_name)

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Contact_Details_Title'), 10)

WebUI.verifyElementText(findTestObject('Page_Contacts_Dashboard/Contact_Details_Title'), new_contact_title)

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Contact_Details_Company'), 10)

WebUI.verifyElementText(findTestObject('Page_Contacts_Dashboard/Contact_Details_Company'), new_contact_company)

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Contact_Details_Notes'), 10)

WebUI.verifyElementText(findTestObject('Page_Contacts_Dashboard/Contact_Details_Notes'), new_contact_notes)

WebUI.closeBrowser()

