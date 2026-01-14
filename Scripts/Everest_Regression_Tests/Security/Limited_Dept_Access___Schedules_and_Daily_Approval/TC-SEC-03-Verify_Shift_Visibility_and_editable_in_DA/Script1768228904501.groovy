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

WebUI.callTestCase(findTestCase('Everest_Regression_Tests/Security/Employee_Profiles/TC-SEC-EMP-01-Alexander_Reese_limitedAccess_SCH_DA'), 
    [('Username') : 'alexanderr@qatestorg1', ('Password') : 'Abcd1234'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Security/Limited_Dept_Access___Schedules_and_Daily_Approval/TC-SEC-03-Verify_Shift_in_DA/Page_IBEX Payroll - Home/a_Daily Approval'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Everest_Regression_Tests/Security/Limited_Dept_Access___Schedules_and_Daily_Approval/TC-SEC-03-Verify_Shift_in_DA/Page_IBEX Payroll - Daily Approval/h1_Daily Approval'), 
    90)

WebUI.verifyElementText(findTestObject('Object Repository/Everest_Regression_Tests/Security/Limited_Dept_Access___Schedules_and_Daily_Approval/TC-SEC-03-Verify_Shift_in_DA/Page_IBEX Payroll - Daily Approval/div_15 Dec - 28 Dec, 2024'), 
    '15 Dec - 28 Dec, 2024')

WebUI.verifyElementVisible(findTestObject('Object Repository/Everest_Regression_Tests/Security/Limited_Dept_Access___Schedules_and_Daily_Approval/TC-SEC-03-Verify_Shift_in_DA/Page_IBEX Payroll - Daily Approval/h1_Summary of Hours'))

'checking accessed departments are visisble'
for (String dept : departments) {
    WebUI.verifyTextPresent(dept, false)
}

