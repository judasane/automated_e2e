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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Object Repository/Login page/Page_On My Radar/input_Email_email'))

WebUI.click(findTestObject('Object Repository/Login page/Page_On My Radar/span_Signup'))

WebUI.setText(findTestObject('Object Repository/Login page/Page_On My Radar/input_Email_email'), ((GlobalVariable.email + '+') + RandStr.randomAscii(
        4)) + '@gmail.com')

WebUI.setText(findTestObject('Object Repository/Login page/Page_On My Radar/input_Name_displayName'), 'test')

WebUI.click(findTestObject('Object Repository/Login page/Page_On My Radar/div_Password_css-1e2ir0d'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login page/Page_On My Radar/input_Password_password'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.click(findTestObject('Object Repository/Page_On My Radar/span_Signup_1'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Login page/Page_On My Radar/button_Logout'), 0)

WebUI.closeBrowser()

