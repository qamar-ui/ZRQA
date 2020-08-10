import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.SelectorMethod as SelectorMethod
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.katalon.plugin.keyword.calendar.SetDateCalendarKeyword as SetDateCalendarKeyword

WebUI.openBrowser('')

WebUI.navigateToUrl('https://testv4.qwikcoverage.com/Login/Login.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_QWIKCoverage  Login/input_WARNING_txtLoginId'), 'Qamar.zaman')

WebUI.setEncryptedText(findTestObject('Page_QWIKCoverage  Login/input_WARNING_txtPassword'), 'TXN4EUMOZzGJIJqBVU6IGQ==')

WebUI.click(findTestObject('Page_QWIKCoverage  Login/input_WARNING_btnLogin'))

WebUI.delay(40)

WebUI.click(findTestObject('Page_Insite - QwikCoverage Light/a_Underwriting'))

WebUI.delay(20)

WebUI.click(findTestObject('Page_Insite - QwikCoverage Light/a_New RFP'))

WebUI.delay(20)

//WebUI.click(findTestObject('Object Repository/Page_Coverage AddEdit/i__fa fa-calendar'))
//WebUI.delay(40)
//WebUI.click(findTestObject('Page_Coverage AddEdit/td_10'))
// Create a new object using testobject method
//TestObject myNewObject = new TestObject('object id')
//Attributes
//Add property to Test Object, a property is defined by:
// property name,
// condition type,
// property value,
// a boolean value to indicate if the property will be used to identify the object during execution
//myNewObject.setSelectorValue(SelectorMethod.XPATH,"idctl01_cphMain_answercontrolb1337459bb244e7989effbf59d6cb1c7_txtx02ecc523-2b8f-4e40-a475-84acb1bc5e02")
// myNewObject.setSelectorMethod(SelectorMethod.XPATH)
// myNewObject.findProperty('Xpath').setActive(true)
//WebUI.click(myNewObject)
//Create test object for date picker 1
TestObject datepicker1 = new TestObject('dynamic')

datepicker1.addProperty('name', ConditionType.EQUALS, 'ctl01$cphMain$answercontrolb1337459bb244e7989effbf59d6cb1c7$txtx02ecc523-2b8f-4e40-a475-84acb1bc5e02')

datepicker1.addProperty('tag', ConditionType.EQUALS, 'input')

datepicker1.findProperty('name').setActive(true)

WebUI.click(datepicker1)

WebUI.setText(datepicker1, '3/17/2020')

//Create test object for date picker 2
TestObject datepicker2 = new TestObject('dynamic')

datepicker2.addProperty('name', ConditionType.EQUALS, 'ctl01$cphMain$answercontrolb1337459bb244e7989effbf59d6cb1c7$txtx2418188d-557b-47f1-b6cb-c16a0a5c7384')

datepicker2.addProperty('class', ConditionType.EQUALS, 'form-control error-aon-blur')

datepicker2.findProperty('class').setActive(true)

WebUI.click(datepicker2)

WebUI.setText(datepicker2, '3/19/2020')

//Create test object for  Policy holder
TestObject policyholder = new TestObject('dynamic')

policyholder.addProperty('name', ConditionType.EQUALS, 'ctl01$cphMain$answercontrolb1337459bb244e7989effbf59d6cb1c7$txtxc5ff5bfb-0cc0-42e6-a973-93831cebffdd')

policyholder.addProperty('class', ConditionType.EQUALS, 'form-control error-aon-blur')

policyholder.findProperty('class').setActive(true)

WebUI.click(policyholder)
WebUI.setText(policyholder,"Policyholder_1")
WebUI.delay(10)

//create test object for address1 and address2
/*TestObject address1=new TestObject('dynamic')
address1.addProperty('name', ConditionType.EQUALS, 'ctl01$cphMain$answercontrolb1337459bb244e7989effbf59d6cb1c7$txtx8c2cf029-d365-4cfa-89bc-0d33dd70dc1b')
address1.addProperty('class', ConditionType.EQUALS, 'form-control')
address1.findProperty('name').setActive(true)
WebUI.click(address1)
WebUI.setText(address1,'New_Jersy')*/

//Scroll to element to make dropdown element visible to browser
WebUI.scrollToElement(findTestObject('Page_Coverage AddEdit/Zip'), 40)

WebUI.setText(findTestObject('Page_Coverage AddEdit/Zip'), '219000')

//Create a test object for states dropdown 
TestObject dropdown_s = new TestObject('dynamic')

dropdown_s.addProperty('name', ConditionType.EQUALS, 'ctl01$cphMain$answercontrolb1337459bb244e7989effbf59d6cb1c7$drpl56b20cb6-929a-480f-a522-8a4dc2a4aa90')

dropdown_s.addProperty('class', ConditionType.EQUALS, 'form-control error-aon-blur')

dropdown_s.findProperty('name').setActive(true)
 
//WebUI.click(dropdown_s)
WebUI.click(findTestObject('Page_Coverage AddEdit/a_Close'))
WebUI.delay(10)
//select option from states dropdown(Alaska has value =1692.
WebUI.selectOptionByValue(findTestObject('Page_Coverage AddEdit/states dropdown'), '1692', false)

