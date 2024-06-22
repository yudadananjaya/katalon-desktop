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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/* Author		: I Putu Yuda Danan Jaya
 * Created Date	: 22 June 2024
 * Updated by	: -
 * Updated Date	: -
 * Summary		:
 * 1. script for automating success login test case
 * */

def email = findTestData(('team account/' + GlobalVariable.environment) + '/account').getValue(1, 1)

def password = findTestData(('team account/' + GlobalVariable.environment) + '/account').getValue(2, 1)

def expectedUserName = findTestData(('team account/' + GlobalVariable.environment) + '/account').getValue(3, 1)

'Open Browser and navigate to url'
WebUI.callTestCase(findTestCase('pages/general/open browser and go to url dynamic'), [('url') : GlobalVariable.urlBase], FailureHandling.STOP_ON_FAILURE)

'Fill email and click submit button'
WebUI.callTestCase(findTestCase('pages/login/fill email and click submit button'), [('email') : email], FailureHandling.STOP_ON_FAILURE)

'Fill password and click login button'
WebUI.callTestCase(findTestCase('pages/login/fill password and click login button'), [('password') : password], FailureHandling.STOP_ON_FAILURE)

'Verify username in home page after success login'
WebUI.callTestCase(findTestCase('pages/home/verify expected username in home page'), [('expectedUserName') : expectedUserName], FailureHandling.STOP_ON_FAILURE)

'Close browser'
WebUI.callTestCase(findTestCase('pages/general/after test case close browser'), [:], FailureHandling.STOP_ON_FAILURE)
