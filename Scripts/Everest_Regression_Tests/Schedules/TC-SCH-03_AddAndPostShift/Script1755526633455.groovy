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

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_Employee_Quick_Filter'))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_Employee_Quick_Filter'), 
    Employee)

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_Employee_Quick_Filter'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

WebUI.verifyTextPresent(Employee, false)

WebUI.rightClick(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/div_workblock-container_3 (Second day of Week)'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/div_New Shift'))

WebUI.waitForElementVisible(findTestObject('Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_Start Time_startTime'), 
    2)

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_Start Time_startTime'), 
    Start_Time)

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_End Time_endTime'), 
    End_Time)

WebUI.waitForElementVisible(findTestObject('Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_End Time_endTime'), 
    2)

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/textarea_Keep when copied_description'), 
    Shift_Description)

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/textarea_Keep when copied_payrollnotes'), 
    Shift_PayrollNotes)

'Click on Recurrence tab'
WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/a_Recurrencefiber_manual_record'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/fw-select_Does not Repeat'))

'Choose "Daily" recurrence option.'
WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/div_Daily'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_day(s)_everyWeekday'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_No end date_endAfter'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/label_occurrences'))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_End After_occurrences'), 
    No_Of_Days)

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/button_Save'))

WebUI.delay(2)

'Confirm shift exists matching test data start time.'
WebUI.verifyTextPresent(Start_Time_NoAMPM, false)

'Open shift editor (first shift of recurring series)'
WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/div_workblock-container_3 (Second day of Week)'))

WebUI.delay(5)

WebUI.verifyTextPresent(Shift_Description, false)

WebUI.verifyTextPresent(Recurrence_Details, false)

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/button_Post'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/button_Post_ConfirmModal'))

WebUI.click(findTestObject('Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/i_toc'))

WebUI.verifyElementPresent(findTestObject('Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/div_Posted'), 
    0)

