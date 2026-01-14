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

WebUI.callTestCase(findTestCase('Everest_Regression_Tests/Security/Employee_Profiles/TC-SEC-EMP-02-Ahmir Weiss_FullAccess_SS_SB_SCH'), 
    [('Username') : 'ahmirw@qatestorg1', ('Password') : 'Abcd1234'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Security/Limited_Dept_Access___Schedules_and_Daily_Approval/TC-01_limited_dept_schedule/Page_IBEX Payroll - Schedules/Page_IBEX Payroll - Home/a_Schedules'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Everest_Regression_Tests/Security/Limited_Dept_Access___Schedules_and_Daily_Approval/TC-01_limited_dept_schedule/Page_IBEX Payroll - Schedules/span_Department'), 
    30)

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Security/Limited_Dept_Access___Schedules_and_Daily_Approval/TC-01_limited_dept_schedule/Page_IBEX Payroll - Schedules/i_toc'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Security/Limited_Dept_Access___Schedules_and_Daily_Approval/TC-01_limited_dept_schedule/Page_IBEX Payroll - Schedules/a_Schedule Listingfiber_manual_record'))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/Security/Limited_Dept_Access___Schedules_and_Daily_Approval/TC-01_limited_dept_schedule/Page_IBEX Payroll - Schedules/input_Add Schedule_startDate'), 
    Start_Date)

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/Security/Limited_Dept_Access___Schedules_and_Daily_Approval/TC-01_limited_dept_schedule/Page_IBEX Payroll - Schedules/input_Add Schedule_startDate'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/Security/Limited_Dept_Access___Schedules_and_Daily_Approval/TC-01_limited_dept_schedule/Page_IBEX Payroll - Schedules/input_Add Schedule_endDate'), 
    End_Date)

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/Security/Limited_Dept_Access___Schedules_and_Daily_Approval/TC-01_limited_dept_schedule/Page_IBEX Payroll - Schedules/input_Add Schedule_endDate'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

for (String dept : departments) {
    WebUI.verifyTextPresent(dept, false)
}

