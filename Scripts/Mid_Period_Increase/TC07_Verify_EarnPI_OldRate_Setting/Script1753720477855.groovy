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

WebUI.waitForElementPresent(findTestObject('Mid_period_increase/TC07_Verify_EarnPI_OldRate_Setting/Page_IBEX Payroll - Payroll Setup/td_Test Earning 2'), 
    5)

WebUI.verifyElementText(findTestObject('Object Repository/Mid_period_increase/TC07_Verify_EarnPI_OldRate_Setting/Page_IBEX Payroll - Payroll Setup/td_Test Earning 2'), 
    'Test Earning 2')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC07_Verify_EarnPI_OldRate_Setting/Page_IBEX Payroll - Payroll Setup/button_Edit_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Mid_period_increase/TC07_Verify_EarnPI_OldRate_Setting/Page_IBEX Payroll/input_Old pay rate'))

WebUI.verifyElementChecked(findTestObject('Object Repository/Mid_period_increase/TC07_Verify_EarnPI_OldRate_Setting/Page_IBEX Payroll/input_Old pay rate'), 
    4)

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC07_Verify_EarnPI_OldRate_Setting/Page_IBEX Payroll/a__ BACK TO PAYROLL SETUP_ PAYROLL INSTRUCTIONS'))

