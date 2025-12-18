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

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-002_VerifyScgeduleListing By Date filter/Page_IBEX Payroll - Home/a_Schedules'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-002_VerifyScgeduleListing By Date filter/Page_IBEX Payroll - Schedules/div_Lets get startedPlease select a department'), 
    15)

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-002_VerifyScgeduleListing By Date filter/Page_IBEX Payroll - Schedules/fw-select_Select a department'))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-002_VerifyScgeduleListing By Date filter/Page_IBEX Payroll - Schedules/input_Leave_search-icon ng-untouched ng-pri_11e1f5'), 
    Schedule_Department)

WebUI.click(findTestObject('Everest_Regression_Tests/TC-SCH-002_VerifyScgeduleListing By Date filter/Page_IBEX Payroll - Schedules/div_Amber Trail'))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-002_VerifyScgeduleListing By Date filter/Page_IBEX Payroll - Schedules/input_navigate_before_date-toolbar__input i_9a347a'), 
    Schedule_StartDate)

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-002_VerifyScgeduleListing By Date filter/Page_IBEX Payroll - Schedules/input_navigate_before_date-toolbar__input i_9a347a'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

WebUI.setText(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-002_VerifyScgeduleListing By Date filter/Page_IBEX Payroll - Schedules/input_Show employees in other departments_s_fe1fd5'), 
    Employee)

WebUI.sendKeys(findTestObject('Object Repository/Everest_Regression_Tests/TC-SCH-002_VerifyScgeduleListing By Date filter/Page_IBEX Payroll - Schedules/input_Show employees in other departments_s_fe1fd5'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

WebUI.verifyElementText(findTestObject('Everest_Regression_Tests/TC-SCH-002_VerifyScgeduleListing By Date filter/Page_IBEX Payroll - Schedules/div_Jordan, Barrett'), 
    Employee)

