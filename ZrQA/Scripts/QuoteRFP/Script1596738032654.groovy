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
WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Page_QWIKCoverage  Login/input_WARNING_txtLoginId'), 'administrator')

WebUI.setEncryptedText(findTestObject('Page_QWIKCoverage  Login/input_WARNING_txtPassword'), '3Gnrt96KZzzGb8IrhFWWmQ==')

WebUI.click(findTestObject('Page_QWIKCoverage  Login/input_WARNING_btnLogin'))
WebUI.delay(30, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/a_Underwriting'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/a_New RFP'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input__ctl00cphMainanswercontrolb1337459bb2_274a1a'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/td_25'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input__ctl00cphMainanswercontrolb1337459bb2_60ab34'))

WebUI.click(findTestObject('Page_Insite - QwikCoverage Light/td_31'))

WebUI.setText(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input__ctl00cphMainanswercontrolb1337459bb2_6f5934'), 
    'Test RFP4 0807 Automation')

WebUI.setText(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input_Address 1_ctl00cphMainanswercontrolb1_7fd9df'), 
    'shghjkhiojio')

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input_Address 2_ctl00cphMainanswercontrolb1_0aebd5'))

WebUI.setText(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input_City_ctl00cphMainanswercontrolb133745_5166e1'), 
    'city')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/select_SelectAlaskaAlabamaArkansasArizonaCa_5694cd'), 
    '1692', true)

WebUI.setText(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input_Zip_ctl00cphMainanswercontrolb1337459_60083f'), 
    '99501')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/select_SelectCorporateGSSR'), 
    '6817', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/select_SelectU-VA-1001-BU-TA-1001-B'), 
    '1444', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/select_SelectBasic ADDVoluntary ADD'), 
    '10298', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/select_Select0866 - CARVEOUT PRINCIPAL4645 _75b871'), 
    '0866 - CARVEOUT PRINCIPAL', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/select_SelectEmployers (employees)'), 
    '4187', true)

WebUI.setText(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input__ctl00cphMainanswercontrolb1337459bb2_a16baa'), 
    '9')

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/div_(9100)EXECUTIVESLEGISLATIVE AND GENERAL_be981c'))

WebUI.setText(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input__ctl00cphMainanswercontrolb1337459bb2_a16baa'), 
    '(9100)EXECUTIVES,LEGISLATIVE AND GENERAL GOVERNMENT,EXCEPT FINANCE')

//WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input_Attach Additional Information_ctl00cp_ba85fe'))

//WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/i_Uploading_fa fa-trash fa-mx'))

//WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/button_Yes Delete it'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/select_SelectSystem UserTroy IngramRay Kirc_14e805'), 
    '17242', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/select_Select(None) (None)Dexter GriffinPai_ce8463'), 
    '12', true)

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input_Field is required_ctl00cphMainbtnbutt_0efba4'))

WebUI.click(findTestObject('Page_Insite - QwikCoverage Light/a_Search_1_2'))

WebUI.setText(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input_Agency_ctl00cphMainClientBrokerContac_c3bfb3'), 
    'demo agency 1')

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/button_Search_Agency'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/a_Select'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/div_ Agency                                _1b5f16'))

WebUI.click(findTestObject('Page_Insite - QwikCoverage Light/a_Search_agent'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/a_Select_1'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/a_Save'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/a_Search_Claims TPA'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/a_Select_1_2'))

WebUI.setText(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input_Percentage_ctl00cphMaincntrlAccountTP_8cfed8'), 
    '0')

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/div_TPA                                    _61885f'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input_Close_ctl00cphMainbtnNextStep1'))


WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/a_Create Submission'))

WebUI.click(findTestObject('Object Repository/Page_Insite - QwikCoverage Light/input__ctl00cphMaincntrlCoverageAddEditWiza_297c3f'))

