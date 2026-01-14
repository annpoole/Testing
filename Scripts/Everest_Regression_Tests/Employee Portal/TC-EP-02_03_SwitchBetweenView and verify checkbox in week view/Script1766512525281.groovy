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

WebUI.selectOptionByValue(findTestObject('Everest_Regression_Tests/Employee portal/TC-EP-03_Switch btw week pay and verify checkbox/Page_IBEX Payroll - Employee Portal - My Schedule/select_WeekPay PeriodMonth'), 
    'payperiod', true)

WebUI.selectOptionByValue(findTestObject('Everest_Regression_Tests/Employee portal/TC-EP-03_Switch btw week pay and verify checkbox/Page_IBEX Payroll - Employee Portal - My Schedule/select_WeekPay PeriodMonth'), 
    'month', true)

WebUI.selectOptionByValue(findTestObject('Everest_Regression_Tests/Employee portal/TC-EP-03_Switch btw week pay and verify checkbox/Page_IBEX Payroll - Employee Portal - My Schedule/select_WeekPay PeriodMonth'), 
    'week', true)

WebUI.verifyElementText(findTestObject('Everest_Regression_Tests/Employee portal/TC-EP-03_Switch btw week pay and verify checkbox/Page_IBEX Payroll - Employee Portal - My Schedule/label_Show Other Employees'), 
    'Show Other Employees')

WebUI.click(findTestObject('Everest_Regression_Tests/Employee portal/TC-EP-03_Switch btw week pay and verify checkbox/Page_IBEX Payroll - Employee Portal - My Schedule/input_Total Hours in Week_showOtherEmployees'))

WebUI.click(findTestObject('Everest_Regression_Tests/Employee portal/TC-EP-03_Switch btw week pay and verify checkbox/Page_IBEX Payroll - Employee Portal - My Schedule/input_Total Hours in Week_showOtherEmployees'))

