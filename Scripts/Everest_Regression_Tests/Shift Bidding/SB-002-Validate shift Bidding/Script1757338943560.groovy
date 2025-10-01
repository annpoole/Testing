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

WebUI.waitForElementVisible(findTestObject('Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Schedules/i_toc'), 
    15)

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Schedules/i_toc'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Schedules/i_chevron_right'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Schedules/a_Shift Bidding'))

WebUI.verifyElementText(findTestObject('Object Repository/Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Shift Bidding/td_28-Sep-2025 Sun'), 
    '28-Sep-2025 Sun')

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Shift Bidding/button_View Bids'))

WebUI.verifyElementText(findTestObject('Object Repository/Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Shift Bidding - Bid Summary/td_Lindsay Abdul'), 
    'Lindsay Abdul')

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Shift Bidding - Bid Summary/i_radio_button_unchecked'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/Shift Bidding/Page_IBEX Payroll - Shift Bidding - Bid Summary/a_Back to Shift Bidding'))

