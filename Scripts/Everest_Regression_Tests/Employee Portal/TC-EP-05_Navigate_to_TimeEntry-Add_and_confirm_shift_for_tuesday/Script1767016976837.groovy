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

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Employee portal/TC-EP-05_Navigate_to_TimeEntry-Add_and_confirm_shift_for_tuesday/Page_IBEX Payroll - Home/a_Time Entry'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Everest_Regression_Tests/Employee portal/TC-EP-05_Navigate_to_TimeEntry-Add_and_confirm_shift_for_tuesday/Page_IBEX Payroll - Employee Portal - Time Entry/header_Navigate to previous periodnavigate__a921b1'), 
    60)

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/Employee portal/TC-EP-05_Navigate_to_TimeEntry-Add_and_confirm_shift_for_tuesday/Page_IBEX Payroll - Employee Portal - Time Entry/input_navigate_before_date-toolbar__input i_9a347a'), 
    PayPeriod_Start)

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/Employee portal/TC-EP-05_Navigate_to_TimeEntry-Add_and_confirm_shift_for_tuesday/Page_IBEX Payroll - Employee Portal - Time Entry/input_navigate_before_date-toolbar__input i_9a347a'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('Everest_Regression_Tests/Employee portal/TC-EP-05_Navigate_to_TimeEntry-Add_and_confirm_shift_for_tuesday/Page_IBEX Payroll - Employee Portal - Time Entry/button_No shifts for DATE Click to addadd', 
        [('Added_Shift_DATE') : 'Dec 31']))

WebUI.click(findTestObject('Everest_Regression_Tests/Employee portal/TC-EP-05_Navigate_to_TimeEntry-Add_and_confirm_shift_for_tuesday/Page_IBEX Payroll - Employee Portal - Time Entry/button_No shifts for DATE Click to addadd', 
        [('Added_Shift_DATE') : 'Dec 31']))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/Employee portal/TC-EP-05_Navigate_to_TimeEntry-Add_and_confirm_shift_for_tuesday/Page_IBEX Payroll - Employee Portal - Time Entry/input_Start_input-text ng-untouched ng-pris_1d0acb'), 
    Start_Time)

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/Employee portal/TC-EP-05_Navigate_to_TimeEntry-Add_and_confirm_shift_for_tuesday/Page_IBEX Payroll - Employee Portal - Time Entry/input_End_input-text ng-untouched ng-pristi_7b89bb'), 
    End_Time)

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Employee portal/TC-EP-05_Navigate_to_TimeEntry-Add_and_confirm_shift_for_tuesday/Page_IBEX Payroll - Employee Portal - Time Entry/label_Worked'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Employee portal/TC-EP-05_Navigate_to_TimeEntry-Add_and_confirm_shift_for_tuesday/Page_IBEX Payroll - Employee Portal - Time Entry/button_Save'))

