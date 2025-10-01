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

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Home/a_Anns Test Org'))

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Home/a_Payroll'))

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Payroll/a_Payroll Setup'))

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Payroll Setup/a_Accrual Policies'))

WebUI.rightClick(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Payroll Setup/a_SCHEDULES'))

WebUI.switchToWindowTitle('IBEX Payroll - Schedules')

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Schedules/fw-select_Select a department'))

WebUI.verifyElementText(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Schedules/div_Anemone House'), 
    'Anemone House')

WebUI.switchToWindowTitle('Meet - mdq-oovx-jmj')

WebUI.click(findTestObject('Object Repository/Broken_test/Page_Meet - mdq-oovx-jmj/span_Join now'))

WebUI.switchToWindowTitle('IBEX Payroll - Schedules')

WebUI.switchToWindowTitle('Meet - mdq-oovx-jmj')

WebUI.click(findTestObject('Object Repository/Broken_test/Page_Meet - mdq-oovx-jmj/div_VYBDae-Bz112c-RLmnJb'))

