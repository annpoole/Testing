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

TestObject inProgressObj = findTestObject('Object Repository/Everest_Regression_Tests/TC-PR-02_calucate the input sheet/Page_IBEX Payroll - Process Payroll  Review_740d76/div_In Progress')

int maxWaitSeconds = 900 // 15 minutes

int intervalSeconds = 10 // check every 10 seconds

boolean isFound = false

for (int elapsed = 0; elapsed < maxWaitSeconds; elapsed += intervalSeconds) {
    if (WebUI.verifyElementPresent(inProgressObj, intervalSeconds, FailureHandling.OPTIONAL)) {
        WebUI.comment("✅ 'In Progress' element found after $elapsed seconds.")

        isFound = true

        break
    } else {
        WebUI.comment("⏳ Still waiting for 'In Progress'... ($elapsed/$maxWaitSeconds seconds)")
    }
}

if (!(isFound)) {
    WebUI.comment('❌ \'In Progress\' element did not appear within 15 minutes.')

    assert false
}

WebUI.verifyElementText(findTestObject('Object Repository/Everest_Regression_Tests/TC-PR-03_Approve the Payroll Result/Page_IBEX Payroll - Process Payroll  Review_740d76/div_Processed'), 
    'Processed')

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-PR-02_calucate the input sheet/Page_IBEX Payroll - Process Payroll  Review_740d76/a_Input Sheet'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-PR-03_Approve the Payroll Result/Page_IBEX Payroll - Input Sheet/input_Add Filter_results'))

WebUI.verifyElementText(findTestObject('Object Repository/Everest_Regression_Tests/TC-PR-03_Approve the Payroll Result/Page_IBEX Payroll - Payroll Results/a_Approve   SetupSimpleDialog(ApproveDialog_ffd324'), 
    'Approve SetupSimpleDialog(\'ApproveDialog\', \'Negative Pay Warning\', \'Approve\', \'/Edge5/Everest/PayrollResults/RunNegativePayWarningDialog.mr?payrunId=53ab5b90-2bdf-458e-9d40-cc7edc753727&workflowInstanceId=43381b6a-439e-4449-a71f-1780752332dd&workflowInstanceStepId=11\', \'\', \'autoOpen:false,width:640,height:310,modal:true,draggable:false,resizable:false\');')

