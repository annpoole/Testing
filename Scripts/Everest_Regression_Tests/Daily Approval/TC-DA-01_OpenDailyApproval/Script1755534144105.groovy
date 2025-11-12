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

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-DA-01_OpenDailyApproval/Page_IBEX Payroll - Daily Approval/input_navigate_before_date-toolbar__input i_9a347a'), 
    Start_Date)

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/TC-DA-01_OpenDailyApproval/Page_IBEX Payroll - Daily Approval/input_navigate_before_date-toolbar__input i_9a347a'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('Object Repository/Everest_Regression_Tests/TC-DA-01_OpenDailyApproval/Page_IBEX Payroll - Daily Approval/div_Expand rowexpand_moreeditEditlockUnappr_ebe47a'), 
    15)

WebUI.comment('above steps can be deleted later when you know the dA will land on right pay period')

WebUI.verifyElementVisible(findTestObject('Object Repository/Everest_Regression_Tests/TC-DA-01_OpenDailyApproval/Page_IBEX Payroll - Daily Approval/fw-tabs_Summaryfiber_manual_recordFiltersfi_f8a64b'))

