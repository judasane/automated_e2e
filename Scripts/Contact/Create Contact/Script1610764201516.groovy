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

String random_first_name = RandStr.randomNumeric(5) + '+First_name'

String random_last_name = RandStr.randomNumeric(5) + '+Last_name'

String full_name = (random_first_name + ' ') + random_last_name

def contact_data = [('first_name') : random_first_name, ('last_name') : random_last_name, ('full_name') : full_name, ('email') : random_first_name + 
    '.test@email.com', ('title') : 'Some Tittle', ('company') : 'Some company', ('notes') : 'Some Notes']

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), 1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), 1)

WebUI.setText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), GlobalVariable.email_create_contacts)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Password'), GlobalVariable.encryptedPassword)

WebUI.click(findTestObject('Object Repository/Page_Auth0_SignIn/button_Log In'))

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/First_Contact_Row'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/Create_New_Contact_Button'), 1)

WebUI.click(findTestObject('Page_Contacts_Dashboard/Create_New_Contact_Button'))

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/Contact_Email_input'), 1)

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_First_Name_input'), contact_data['first_name'])

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Email_input'), contact_data['email'])

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Last_Name_input'), contact_data['last_name'])

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Tittle_input'), contact_data['title'])

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Company_input'), contact_data['company'])

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Notes_input'), contact_data['notes'])

WebUI.click(findTestObject('Page_Contacts_Dashboard/Create_Contact_Done_Button'))

WebUI.verifyElementPresent(findTestObject('Nav_Bar/Search_Bar'), 1)

WebUI.setText(findTestObject('Nav_Bar/Search_Bar'), contact_data['first_name'])

String xpath = ('//div[.="' + (contact_data['full_name'])) + '"]//ancestor::div[2]'

TestObject contact = new TestObject('objectName')

contact.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.waitForElementPresent(contact, 10)

WebUI.verifyElementPresent(contact, 1)

WebUI.mouseOver(contact)

WebUI.click(findTestObject('Page_Contacts_Dashboard/Contact_Edit_Button'))

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Contact_Name'), 1)

WebUI.verifyElementText(findTestObject('Page_Contacts_Dashboard/Contact_Name'), contact_data['full_name'])

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Contact_Tittle'), 1)

WebUI.verifyElementText(findTestObject('Page_Contacts_Dashboard/Contact_Tittle'), contact_data['title'])

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Contact_Company'), 1)

WebUI.verifyElementText(findTestObject('Page_Contacts_Dashboard/Contact_Company'), contact_data['company'])

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Contact_Notes'), 1)

WebUI.verifyElementText(findTestObject('Page_Contacts_Dashboard/Contact_Notes'), contact_data['notes'])

WebUI.closeBrowser()

