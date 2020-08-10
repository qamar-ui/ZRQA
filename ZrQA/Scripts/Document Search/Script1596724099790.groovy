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

WebUI.navigateToUrl('https://zrtest.qwikcoverage.com/Login/Login.aspx')

WebUI.setText(findTestObject('Page_QWIKCoverage  Login/input_WARNING_txtLoginId'), 'administrator')

WebUI.setEncryptedText(findTestObject('Page_QWIKCoverage  Login/input_WARNING_txtPassword'), '3Gnrt96KZzzGb8IrhFWWmQ==')

WebUI.click(findTestObject('Page_QWIKCoverage  Login/input_WARNING_btnLogin'))
WebUI.delay(60)
WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/a_Search'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/a_Document Search'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/i_Date From_fa fa-calendar'))
WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/Th_'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/td_1'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input_Date To_ctl00cphMaintxtEffDateTo'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/td_31'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/a_Search_1'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/i_Total Documents_fa fa-arrow-down fa-mx'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/ins_Issue_iCheck-helper'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/ins_Issue_iCheck-helper_1'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/ins_Issue_iCheck-helper'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/a_Download'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/a_Email'))

WebUI.setText(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input_ Recipient Email_ctl00cphMaincntrlSen_6b0073'), 
    'qamar.zaman@gboiq.com')

WebUI.setText(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input_ Subject_ctl00cphMaincntrlSendEmailtx_153100'), 
    'Testing documents')

WebUI.setText(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/textarea_ Email Message_ctl00cphMaincntrlSe_acf50c'), 
    'Testing documents')

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/button_Close'))

