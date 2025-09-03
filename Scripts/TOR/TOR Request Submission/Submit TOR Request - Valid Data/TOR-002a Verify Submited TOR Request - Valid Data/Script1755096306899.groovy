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

WebUI.verifyElementText(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-002a_verify_request/Page_IBEX Payroll - Employee Portal - New T_ee1426/div_Anemone House'), 
    TORDepartment)

WebUI.verifyElementText(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-002a_verify_request/Page_IBEX Payroll - Employee Portal - New T_ee1426/div_0300 PM - 1100 PM (8h 00m)'), 
    TotalHoursRequested)

WebUI.click(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-002a_verify_request/Page_IBEX Payroll - Employee Portal - New T_ee1426/button_Submit request'))

'landing on request history page'
WebUI.waitForElementVisible(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-002a_verify_request/Page_IBEX Payroll - Employee Portal - Time Off/ul_Request Historyfiber_manual_recordTime O_3dd3a3'), 
    15)

WebUI.setText(findTestObject('Object Repository/Page_IBEX Payroll - Employee Portal - Time Off/input_From_historyStart'), 
    TORStartDate)

WebUI.sendKeys(findTestObject('Object Repository/Page_IBEX Payroll - Employee Portal - Time Off/input_From_historyStart'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

WebUI.verifyElementText(findTestObject('Object Repository/Page_IBEX Payroll - Employee Portal - Time Off/spa-request-times_10-Mar-2024  11-Mar-2024'), 
    Verify_TOR)

