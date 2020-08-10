import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://testv4.qwikcoverage.com/Login/Login.aspx')

WebUI.setText(findTestObject('Object Repository/Page_QWIKCoverage  Login/input_WARNING_txtLoginId'), 'Qamar.zaman')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_QWIKCoverage  Login/input_WARNING_txtPassword'), 'TXN4EUMOZzGJIJqBVU6IGQ==')

WebUI.click(findTestObject('Object Repository/Page_QWIKCoverage  Login/input_WARNING_btnLogin'))

WebUI.delay(30)

WebUI.focus(findTestObject('Page_Insite - QwikCoverage Light/a_Underwriting'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/a_Underwriting'))

WebUI.delay(30)

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/a_New RFP'))

WebUI.delay(30)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/first test object'), 20)

WebUI.click(findTestObject('Object Reprository/Page_Insite - QwikCoverage Light/first test object'))

WebUI.click(findTestObject('Object Repository/Page_Coverage AddEdit/i_QwikCoverage_fa fa-tasks CustomClassSideBar'))

WebUI.click(findTestObject('Object Repository/Page_Coverage AddEdit/a_Logout'))

