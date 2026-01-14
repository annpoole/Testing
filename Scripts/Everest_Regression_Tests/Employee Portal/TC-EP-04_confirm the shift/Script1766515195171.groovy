import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/Employee portal/TC-EP-04-confirm shift/Page_IBEX Payroll - Employee Portal - My Schedule/input_navigate_before_date-toolbar__input i_9a347a'), 
    PayPeriod_Start)

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/Employee portal/TC-EP-04-confirm shift/Page_IBEX Payroll - Employee Portal - My Schedule/input_navigate_before_date-toolbar__input i_9a347a'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('Everest_Regression_Tests/Employee portal/TC-EP-04-confirm shift/Page_IBEX Payroll - Employee Portal - My Schedule/obj_Shift_By_Day_Department_Time'), 
    30)

WebUI.verifyElementPresent(findTestObject('Everest_Regression_Tests/Employee portal/TC-EP-04-confirm shift/Page_IBEX Payroll - Employee Portal - My Schedule/obj_Shift_By_Day_Department_Time', 
        [('DAY') : DAY, ('Department') : Department]), 15)

