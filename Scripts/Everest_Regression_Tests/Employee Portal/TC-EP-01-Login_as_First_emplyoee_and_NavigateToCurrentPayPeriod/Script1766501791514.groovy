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

WebUI.callTestCase(findTestCase('Shared/SH_Login_As_First_Test_Employee'), [('Username') : Emp_mail, ('Password') : Pass], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Employee portal/Page_IBEX Payroll - Home/a_My Schedule'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Everest_Regression_Tests/Employee portal/TC-EP-02 VerifyShiftsAreVisibleFromScheduleData/Page_IBEX Payroll - Employee Portal - My Schedule/span_Total Hours in Week'), 
    60)

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/Employee portal/TC-EP-02 VerifyShiftsAreVisibleFromScheduleData/Page_IBEX Payroll - Employee Portal - My Schedule/input_navigate_before_date-toolbar__input i_9a347a'), 
    PayPeriod_Start)

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/Employee portal/TC-EP-02 VerifyShiftsAreVisibleFromScheduleData/Page_IBEX Payroll - Employee Portal - My Schedule/input_navigate_before_date-toolbar__input i_9a347a'), 
    Keys.chord(Keys.ENTER))

