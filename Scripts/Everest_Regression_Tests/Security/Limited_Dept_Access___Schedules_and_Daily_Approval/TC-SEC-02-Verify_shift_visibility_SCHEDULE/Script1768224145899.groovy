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

for (String dept : departments) {
    WebUI.comment("Verifying schedule for department: $dept")

    WebUI.click(findTestObject('Everest_Regression_Tests/Security/Limited_Dept_Access___Schedules_and_Daily_Approval/TC-SEC-02-Verify_shift_visibility/i_expand_department', 
            [('department') : dept]))

    WebUI.verifyElementText(findTestObject('Everest_Regression_Tests/Security/Limited_Dept_Access___Schedules_and_Daily_Approval/TC-SEC-02-Verify_shift_visibility/a_schedule_period', 
            [('department') : dept, ('schedule_period') : SchedulePeriod]), SchedulePeriod)

    WebUI.verifyElementText(findTestObject('Everest_Regression_Tests/Security/Limited_Dept_Access___Schedules_and_Daily_Approval/TC-SEC-02-Verify_shift_visibility/div_Posted', 
            [('department') : dept, ('schedule_period') : schedule_period]), 'POSTED')
}

