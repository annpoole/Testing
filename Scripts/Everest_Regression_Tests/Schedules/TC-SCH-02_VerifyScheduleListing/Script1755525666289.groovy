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

WebUI.waitForElementVisible(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/div_SchedulesPrint Copy clearReject Schedul_088b23'), 
    20)

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/a_Schedule Listingfiber_manual_record'))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_Add Schedule_startDate'), 
    Schedule_StartDate)

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_Add Schedule_startDate'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_Add Schedule_startDate'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_Add Schedule_search-icon ng-untouched_f13003'), 
    Schedule_Department)

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_Add Schedule_search-icon ng-untouched_f13003'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/div_Bravo House'), 
    Schedule_Search)

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/i_expand_more'))

WebUI.verifyElementText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/a_10-Mar-2024 - 23-Mar-2024'), 
    '10-Mar-2024 - 23-Mar-2024')

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/a_10-Mar-2024 - 23-Mar-2024'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/i_toc'))

