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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Sign In with Auth0/img_Protected with_auth0-lock-header-logo'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Sign In with Auth0/input_Log In_email'), GlobalVariable.email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In with Auth0/input_Log In_password'), GlobalVariable.encryptedPassword)

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign In with Auth0/input_Log In_password'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_On My Radar/div_To start your experience'), 0)

