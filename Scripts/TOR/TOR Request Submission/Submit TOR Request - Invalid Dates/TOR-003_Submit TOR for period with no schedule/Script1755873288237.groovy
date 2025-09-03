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

WebUI.click(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-002 Submit TOR Request - Valid Data/Page_IBEX Payroll - Employee Portal - Time Off/a_Request Time Off'))

WebUI.setText(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-003_Invalid date range/Page_IBEX Payroll - Employee Portal - New T_ee1426/input_Start Date_startDate'), 
    TORStartDate)

WebUI.sendKeys(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-003_Invalid date range/Page_IBEX Payroll - Employee Portal - New T_ee1426/input_Start Date_startDate'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-003_Invalid date range/Page_IBEX Payroll - Employee Portal - New T_ee1426/input_End Date_endDate'), 
    TOREndDate)

WebUI.sendKeys(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-003_Invalid date range/Page_IBEX Payroll - Employee Portal - New T_ee1426/input_End Date_endDate'), 
    Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-003_Invalid date range/Page_IBEX Payroll - Employee Portal - New T_ee1426/fw-select_-- Select one --_1'))

// Inform tester about the upcoming manual interaction
WebUI.comment('highlighting the next dropdown ')

// Optional: visually highlight the dropdown for the tester
WebUI.executeJavaScript('\n    const el = document.querySelector(\'fw-select\');\n    if (el) { el.style.border = \'2px solid red\'; el.scrollIntoView({behavior: \'smooth\', block: \'center\'}); }\n', 
    null)

WebUI.click(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-003_Invalid date range/Page_IBEX Payroll - Employee Portal - New T_ee1426/fw-select_-- Select one --_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-003_Invalid date range/Page_IBEX Payroll - Employee Portal - New T_ee1426/div_Vacation'))

WebUI.setText(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-003_Invalid date range/Page_IBEX Payroll - Employee Portal - New T_ee1426/textarea_Notes_employeeNotes'), 
    TORRequestNote)

WebUI.click(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-003_Invalid date range/Page_IBEX Payroll - Employee Portal - New T_ee1426/button_Next'))

WebUI.verifyElementText(findTestObject('Object Repository/TOR/TOR Request Submission/TOR-003_Invalid date range/Page_IBEX Payroll - Employee Portal - New T_ee1426/fw-message-banner_warningYou currently do n_a6476c'), 
    TOR_InvalidWarning)

