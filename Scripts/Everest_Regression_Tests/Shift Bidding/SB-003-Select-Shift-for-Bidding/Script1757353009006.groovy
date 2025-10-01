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

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Shift Bidding/a_Select Shifts for Bidding'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Shift Bidding - Select _05fd86/span_21-Sep-2025 - 04-Oct-2025'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Shift Bidding - Select _05fd86/body_menusearchFind Advanced Search closeDa_ce3dc7'))

WebUI.verifyElementText(findTestObject('Object Repository/Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Shift Bidding - Select _05fd86/div_Balsam House  0800 AM - 0400 PM (8h 00m_14dde2'), 
    'Balsam House 08:00 AM - 04:00 PM (8h 00m) autorenew')

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Shift Bidding - Select _05fd86/i_radio_button_unchecked'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Shift Bidding - Select _05fd86/button_Open 1 Shift(s)'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Shift Bidding - Select _05fd86/input_day(s) before the start time of the s_b65259'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Shift Bidding - Select _05fd86/label_Custom date  time today at today'))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Shift Bidding - Select _05fd86/input_Custom date  timeat_form-control ng-u_9a287d'), 
    '10-oct-2025')

