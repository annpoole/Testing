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

WebUI.callTestCase(findTestCase('Everest_Regression_Tests/Home/TC-Home-01'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Everest_Regression_Tests/Schedules/TC-SCH-01_OpenSchedulesSlider'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Everest_Regression_Tests/Schedules/TC-SCH-02_VerifyScheduleListing'), [('Schedule_StartDate') : '10-Mar-2024'
        , ('Schedule_Search') : 'Bravo House'], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_Show employees in other departments_s_fe1fd5'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_Show employees in other departments_s_fe1fd5'), 
    Emplyoee)

WebUI.findWebElements(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/div_Anderson, Liana'), 
    10)

WebUI.rightClick(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/div_(0.00, 0.00)_workblock-container ng-sta_4f922f'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/li_New Shift'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/button_Set up Recurrence'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/fw-select_Does not Repeat'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/div_Daily'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_day(s)_everyWeekday'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_occurrences_endBy'))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_End By_endByDate'), 
    Recurrence_endBydate)

WebUI.sendKeys(findTestObject('Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/input_End By_endByDate'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/button_Save'))

WebUI.rightClick(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-03_AddAndPostShift/Page_IBEX Payroll - Schedules/button_Post'))

