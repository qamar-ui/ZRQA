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

WebUI.setText(findTestObject('Page_QWIKCoverage  Login/input_WARNING_txtLoginId'), 'Qamar.zaman')

WebUI.setEncryptedText(findTestObject('Page_QWIKCoverage  Login/input_WARNING_txtPassword'), 'TXN4EUMOZzGJIJqBVU6IGQ==')

WebUI.click(findTestObject('Page_QWIKCoverage  Login/input_WARNING_btnLogin'))

WebUI.delay(40)

WebUI.click(findTestObject('Page_Insite - QwikCoverage Light/a_Underwriting'))

WebUI.delay(40)

WebUI.click(findTestObject('Page_Insite - QwikCoverage Light/a_New RFP'))

WebUI.delay(40)

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
//WebUi.click(myNewObject)

  
	 TestObject to = new TestObject('dynamic')
	 
	 to.addProperty('name', ConditionType.EQUALS, 'ctl01$cphMain$answercontrolb1337459bb244e7989effbf59d6cb1c7$txtx02ecc523-2b8f-4e40-a475-84acb1bc5e02')
	 
	 to.addProperty('tag', ConditionType.EQUALS, 'input')
	 
	 to.findProperty('name').setActive(true)
	  
	 WebUI.click(to)
	 
	 WebUI.setText(to, '3/17/2020')
 
	 
	 
	TestObject to1=new TestObject('dynamic')
to1.addProperty('name', ConditionType.EQUALS, 'ctl01$cphMain$answercontrolb1337459bb244e7989effbf59d6cb1c7$txtx2418188d-557b-47f1-b6cb-c16a0a5c7384')
to1.addProperty('class',ConditionType.EQUALS,'form-control error-aon-blur')
to1.findProperty('class').setActive(true)
WebUI.click(to1)
WebUI.setText(to1, '3/19/2020')
 


 