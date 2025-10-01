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

WebUI.callTestCase(findTestCase('Shared/SH_Login'), [('Username') : 'uat.dstewart', ('Password') : 'Password1'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Shared/SH_Navigate(Switch Org)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/UI improvement/WI-8073/Page_IBEX Payroll - Home/a_Schedules'))

WebUI.click(findTestObject('Object Repository/UI improvement/WI-8073/Page_IBEX Payroll - Schedules/fw-select_Select a department'))

WebUI.setText(findTestObject('Object Repository/UI improvement/WI-8073/Page_IBEX Payroll - Schedules/input_Leave_search-icon ng-untouched ng-pri_11e1f5'), 
    'Administration')

WebUI.click(findTestObject('Object Repository/UI improvement/WI-8073/Page_IBEX Payroll - Schedules/div_Administration'))

WebUI.click(findTestObject('Object Repository/UI improvement/WI-8073/Page_IBEX Payroll - Schedules/button_Cancel'))

WebUI.click(findTestObject('Object Repository/UI improvement/WI-8073/Page_IBEX Payroll - Schedules/input_navigate_before_date-toolbar__input i_9a347a'))

WebUI.setText(findTestObject('Object Repository/UI improvement/WI-8073/Page_IBEX Payroll - Schedules/input_navigate_before_date-toolbar__input i_9a347a'), 
    '2025-10-10')

WebUI.sendKeys(findTestObject('Object Repository/UI improvement/WI-8073/Page_IBEX Payroll - Schedules/input_navigate_before_date-toolbar__input i_9a347a'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/UI improvement/WI-8073/Page_IBEX Payroll - Schedules/div_warning The schedule period(s) for the _33b420'))

WebUI.click(findTestObject('Object Repository/UI improvement/WI-8073/Page_IBEX Payroll - Schedules/button_Cancel'))

