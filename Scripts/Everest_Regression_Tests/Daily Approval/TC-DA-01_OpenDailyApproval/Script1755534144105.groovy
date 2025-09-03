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

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-DA-01_OpenDailyApproval/Page_IBEX Payroll - Home/a_Daily Approval'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Everest_Regression_Tests/TC-DA-01_OpenDailyApproval/Page_IBEX Payroll - Daily Approval/div_Daily Approvalnavigate_before 11 Feb - _9a3d1a'), 
    30)

WebUI.comment('below steps can be deleted later when you know the dA will land on right pay period')

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-DA-01_OpenDailyApproval/Page_IBEX Payroll - Daily Approval/i_today'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-DA-01_OpenDailyApproval/Page_IBEX Payroll - Daily Approval/th_August 2025'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-DA-01_OpenDailyApproval/Page_IBEX Payroll - Daily Approval/th_2025'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-DA-01_OpenDailyApproval/Page_IBEX Payroll - Daily Approval/span_2024'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-DA-01_OpenDailyApproval/Page_IBEX Payroll - Daily Approval/span_Mar'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-DA-01_OpenDailyApproval/Page_IBEX Payroll - Daily Approval/td_10'))

WebUI.comment('above steps can be deleted later when you know the dA will land on right pay period')

WebUI.verifyElementVisible(findTestObject('Object Repository/Everest_Regression_Tests/TC-DA-01_OpenDailyApproval/Page_IBEX Payroll - Daily Approval/fw-tabs_Summaryfiber_manual_recordFiltersfi_f8a64b'))

WebUI.verifyElementText(findTestObject('Object Repository/Everest_Regression_Tests/TC-DA-01_OpenDailyApproval/Page_IBEX Payroll - Daily Approval/div_Bravo House'), 
    'Bravo House')

