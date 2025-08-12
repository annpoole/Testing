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

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC09_Verify_EarnPI_NewRate_Setting/Page_IBEX Payroll/a__ BACK TO PAYROLL SETUP_ PAYROLL INSTRUCTIONS'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll - Payroll Setup/a_Add New Earning_Benefit'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Name'), 
    'Test Earning 4')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_nameFrench'), 
    'Test Earning 4')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Description'), 
    'Test Earning 4')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_descriptionFrench'), 
    'Test Earning 4')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/fw-select_Instruction Type'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/div_Earning'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/fw-select_Schedule'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/div_Occasional'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Applies to'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_All Departments'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/fw-select_Input value type'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/div_Units'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Default Value'), 
    '0')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Determined using a formula'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/textarea_defaultFormula'), 
    GlobalVariable.G_TestEarn4_5_6_Formula)

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Formula Code'), 
    'TestEarning4')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/button_Save'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/a__ BACK TO PAYROLL SETUP_ PAYROLL INSTRUCTIONS'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll - Payroll Setup/a_Add New Earning_Benefit'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Name'), 
    'Test Earning 5')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Name'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_nameFrench'), 
    'Test Earning 5')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Description'), 
    'Test Earning 5')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_descriptionFrench'), 
    'Test Earning 5')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/fw-select_Instruction Type'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/div_Earning'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/span_span -Select Schedule'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/div_Occasional'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Applies to'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_All Departments'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/fw-select_Input value type'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/div_Units'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Default Value'), 
    '0')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Determined using a formula'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Old pay rate'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/textarea_defaultFormula'), 
    GlobalVariable.G_TestEarn4_5_6_Formula)

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Formula Code'), 
    'TestEarning5')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/button_Save'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/a__ BACK TO PAYROLL SETUP_ PAYROLL INSTRUCTIONS'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll - Payroll Setup/a_Add New Earning_Benefit'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Name'), 
    'Test Earning 6')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_nameFrench'), 
    'Test Earning 6')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Description'), 
    'Test Earning 6')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_descriptionFrench'), 
    'Test Earning 6')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/span_Benefit'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/div_Earning'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/fw-select_Schedule'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/div_Occasional'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Applies to'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_All Departments'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/fw-select_Input value type'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/div_Units'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Default Value'), 
    '0')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Determined using a formula'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_New pay rate'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/textarea_defaultFormula'), 
    GlobalVariable.G_TestEarn4_5_6_Formula)

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/input_Formula Code'), 
    'TestEarning6')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC10_Add_TEST_EarnPI_Variants/Page_IBEX Payroll/button_Save'))

