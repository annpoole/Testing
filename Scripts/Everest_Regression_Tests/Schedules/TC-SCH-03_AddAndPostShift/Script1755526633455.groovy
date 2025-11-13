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

WebUI.rightClick(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/div_(0.00, 0.00)_workblock-container ng-sta_4f922f'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/li_New Shift'))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_Start Date_startDate'), 
    Start_date)

WebUI.sendKeys(findTestObject('TOR/TOR Request Submission/TOR-003_Invalid date range/Page_IBEX Payroll - Employee Portal - New T_ee1426/input_Start Date_startDate'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

WebUI.setText(findTestObject('Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_Start Time_startTime'), 
    Start_time)

WebUI.sendKeys(findTestObject('Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_Start Time_startTime'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_End Date_endDate'), 
    End_Date)

WebUI.sendKeys(findTestObject('TOR/TOR Request Submission/TOR-003_Invalid date range/Page_IBEX Payroll - Employee Portal - New T_ee1426/input_End Date_endDate'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_End Time_endTime'), 
    End_Time)

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_End Time_endTime'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

'press anywhere to remove the overlays'
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/span_Does not Repeat'))

'some time not click the option or take time'
WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/div_Daily'))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_Every_numberOfDays'), 
    No_Of_days)

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/div_End By'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_occurrences_endBy'))

'to remove the dropdown option'
WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/div_Leave_cdk-overlay-backdrop cdk-transpar_2727b2'))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_End By_endByDate'), 
    'Mon, 17-Oct-2025')

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_End By_endByDate'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/button_Save'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/button_Post'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/button_Post_1'))

