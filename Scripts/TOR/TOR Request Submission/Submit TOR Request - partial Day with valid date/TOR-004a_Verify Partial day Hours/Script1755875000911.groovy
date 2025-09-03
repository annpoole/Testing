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

WebUI.click(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-004a_Verify Partial day Hours/Page_IBEX Payroll - Employee Portal - New T_ee1426/button_Next'))

'total hours for TOR'
WebUI.verifyElementText(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-004a_Verify Partial day Hours/Page_IBEX Payroll - Employee Portal - New T_ee1426/div_Total Hours Requested Off 4.00'), 
    TOR_Total_hours)

WebUI.click(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-004a_Verify Partial day Hours/Page_IBEX Payroll - Employee Portal - New T_ee1426/button_Submit request'))

WebUI.waitForElementPresent(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-004a_Verify Partial day Hours/Page_IBEX Payroll - Employee Portal - Time Off/ul_Request Historyfiber_manual_recordTime O_3dd3a3'), 
    15)

WebUI.click(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-004a_Verify Partial day Hours/Page_IBEX Payroll - Employee Portal - Time Off/div_Leave_cdk-overlay-backdrop cdk-overlay-_213697'))

WebUI.setText(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-004a_Verify Partial day Hours/Page_IBEX Payroll - Employee Portal - Time Off/input_From_historyStart'), 
    TORStartDate)

WebUI.click(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-004a_Verify Partial day Hours/Page_IBEX Payroll - Employee Portal - Time Off/input_From_historyStart'))

'start and end (time and date)'
WebUI.verifyElementText(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-004a_Verify Partial day Hours/Page_IBEX Payroll - Employee Portal - Time Off/td_18-Mar-2024 0300 PM   18-Mar-2024 0700 PM'), 
    VERIFY_TOR)

