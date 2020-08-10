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
WebUI.delay(60);
WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/a_Create New Task'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AddEdit Task/select_SelectAccounting RequestApprovalAppr_441dcf'), 
    '31', true)

WebUI.setText(findTestObject('Object Repository/Page_AddEdit Task/input_Description_ctl00cphMainCategoryTask1_9c6e9f'), 
    'This is test for  katalon')

WebUI.click(findTestObject('Object Repository/Page_AddEdit Task/a_Search'))

WebUI.click(findTestObject('Object Repository/Page_AddEdit Task/a_Select'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AddEdit Task/select_NormalMediumHigh'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AddEdit Task/select_SelectAlexa SkalandunasAmanda Pruger_03c4a5'), 
    '17232', true)

WebUI.click(findTestObject('Object Repository/Page_AddEdit Task/i_ Due Date_fa fa-calendar'))

WebUI.click(findTestObject('Object Repository/Page_AddEdit Task/input_ Due Date_ctl00cphMainCategoryTask1tx_e53257'))

WebUI.click(findTestObject('Object Repository/Page_AddEdit Task/td_4'))

WebUI.setText(findTestObject('Object Repository/Page_AddEdit Task/textarea_Comments_ctl00cphMainCategoryTask1_c949c4'), 
    'This is  test for Katalon Studio')

WebUI.click(findTestObject('Object Repository/Page_AddEdit Task/input_Attachments_ctl00cphMainCategoryTask1_40790c'))

WebUI.click(findTestObject('Object Repository/Page_AddEdit Task/a_Save  Close'))

