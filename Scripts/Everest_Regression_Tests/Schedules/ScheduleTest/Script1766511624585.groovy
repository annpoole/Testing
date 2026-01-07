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

WebUI.callTestCase(findTestCase('Everest_Regression_Tests/Home/TC-01 Login and Switch Org'), [('Username') : 'uat.dstewart'
        , ('Password') : 'Password1'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Everest_Regression_Tests/Schedules/TC-SCH-01_OpenSchedulesSlider'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/ScheduleTest/Page_IBEX Payroll - Schedules/input_Add Schedule_startDate'), 
    '15-Dec-2024')

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/ScheduleTest/Page_IBEX Payroll - Schedules/input_Add Schedule_startDate'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/ScheduleTest/Page_IBEX Payroll - Schedules/input_Add Schedule_endDate'), 
    '28-Dec-2024')

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/ScheduleTest/Page_IBEX Payroll - Schedules/input_Add Schedule_endDate'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/ScheduleTest/Page_IBEX Payroll - Schedules/input_Add Schedule_ng-untouched ng-valid ng-dirty'), 
    'Amber')

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Object Repository/Everest_Regression_Tests/ScheduleTest/Page_IBEX Payroll - Schedules/div_Department'), 
    'Amber Trail')

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/ScheduleTest/Page_IBEX Payroll - Schedules/i_expand_more'))

WebUI.verifyTextPresent('15-Dec-2024 - 28-Dec-2024', false)

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/ScheduleTest/Page_IBEX Payroll - Schedules/a_SchedulePeriod'))

