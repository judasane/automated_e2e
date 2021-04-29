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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/OMR_Logo'), 10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), 10)

WebUI.setText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Email'), GlobalVariable.email_edit_contact)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Auth0_SignIn/Log_In_Password'), GlobalVariable.encryptedPassword)

WebUI.click(findTestObject('Object Repository/Page_Auth0_SignIn/button_Log In'))

WebUI.verifyElementPresent(findTestObject('Page_Contacts_Dashboard/First_Contact_Row'), 10)

WebUI.mouseOver(findTestObject('Page_Contacts_Dashboard/First_Contact_Row'))

WebUI.click(findTestObject('Page_Contacts_Dashboard/Contact_Edit_Button'))

WebUI.mouseOver(findTestObject('Page_Contacts_Dashboard/Contact_Name'))

WebUI.click(findTestObject('Page_Contacts_Dashboard/Edit_Contact_Button'))

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Contact_First_Name_input'), 10)

WebUI.clearText(findTestObject('Page_Contacts_Dashboard/Contact_First_Name_input'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_First_Name_input'), 'New Name')

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Last_Name_input'), 'Edited')

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Tittle_input'), 'Some Tittle 2')

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Company_input'), 'Some company 2')

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Notes_input'), 'Some notes 2')

WebUI.click(findTestObject('Page_Contacts_Dashboard/Create_Contact_Done_Button'))

WebUI.waitForElementPresent(findTestObject('Page_Contacts_Dashboard/Contact_Name'), 10)

WebUI.verifyElementText(findTestObject('Page_Contacts_Dashboard/Contact_Name'), 'New Name Edited')

WebUI.verifyElementText(findTestObject('Page_Contacts_Dashboard/Contact_Intro_Message'), 'Test')

WebUI.verifyElementText(findTestObject('Page_Contacts_Dashboard/Contact_Tittle'), 'Some Tittle 2')

WebUI.verifyElementText(findTestObject('Page_Contacts_Dashboard/Contact_Company'), 'Some company 2')

WebUI.verifyElementText(findTestObject('Page_Contacts_Dashboard/Contact_Notes'), 'Some notes 2')

WebUI.mouseOver(findTestObject('Page_Contacts_Dashboard/Contact_Name'))

WebUI.click(findTestObject('Page_Contacts_Dashboard/Edit_Contact_Button'))

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_First_Name_input'), 'Edited')

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Last_Name_input'), 'User')

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Tittle_input'), 'Some Tittle')

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Company_input'), 'Some company')

WebUI.setText(findTestObject('Page_Contacts_Dashboard/Contact_Notes_input'), 'Some notes')

WebUI.click(findTestObject('Page_Contacts_Dashboard/Create_Contact_Done_Button'))

