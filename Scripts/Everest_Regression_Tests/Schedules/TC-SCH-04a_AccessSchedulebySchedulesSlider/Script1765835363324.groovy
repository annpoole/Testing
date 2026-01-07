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

'Set Schedule Listing filter to start date defined in variable or if using Test Suite: data defined in test data file "Test Data TC04a AccessSchedulebySchedulesSlider Period and Department".'
WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-04a/Page_IBEX Payroll - Schedules/input_Add Schedule_startDate'), 
    ScheduleFilterStartDate)

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-04a/Page_IBEX Payroll - Schedules/input_Add Schedule_startDate'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

'Set Schedule Listing filter to end date defined in variable or if using Test Suite: data defined in test data file "Test Data TC04a AccessSchedulebySchedulesSlider Period and Department".'
WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-04a/Page_IBEX Payroll - Schedules/input_Add Schedule_endDate'), 
    ScheduleFilterEndDate)

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-04a/Page_IBEX Payroll - Schedules/input_Add Schedule_endDate'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

'Set Schedule Listing filter to Department defined in variable or if using Test Suite: data defined in test data file "Test Data TC04a AccessSchedulebySchedulesSlider Period and Department".'
WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-04a/Page_IBEX Payroll - Schedules/input_Add Schedule_search-icon ng-untouched_f13003'), 
    Department)

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-04a/Page_IBEX Payroll - Schedules/input_Add Schedule_search-icon ng-untouched_f13003'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

'Verify the Schedule Listing is filtered to the test department.'
WebUI.verifyTextPresent(Department, false)

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-04a/Page_IBEX Payroll - Schedules/i_expand_more'))

'Verify the test period appears in Schedule Listing.'
WebUI.verifyTextPresent(SchedulePeriod, false)

'Click on the test period.'
WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-04a/Page_IBEX Payroll - Schedules/a_SchedulePeriod'))

'Check for Vacant row in Schedule details.'
WebUI.verifyElementPresent(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-04a/Page_IBEX Payroll - Schedules/div_Vacant'), 
    90)

'Close Schedules Slider.'
WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-04a/Page_IBEX Payroll - Schedules/i_clear'))

