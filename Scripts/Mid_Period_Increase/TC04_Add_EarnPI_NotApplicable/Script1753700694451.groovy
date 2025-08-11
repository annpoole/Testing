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

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/a__ BACK TO PAYROLL SETUP_ PAYROLL INSTRUCTIONS'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll - Payroll Setup/a_Add New Earning_Benefit'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/input_Name'), 
    PI_Name)

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/input_nameFrench'), 
    PI_Name_french)

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/input_Description'), 
    PI_Description)

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/input_descriptionFrench'), 
    PI_Description_Name)

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/fw-select_Instruction Type'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/div_Earning'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/div_Applies to'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/input_Applies to'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/fw-select_Schedule'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/div_Occasional'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/input_All Departments'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/fw-select_Input value type'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/div_Units'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/input_Determined using a formula'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/textarea_defaultFormula'), 
    PI_Formula)

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/input_Formula Code'), 
    PI_Formula_Code)

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC04_Add_EarnPI_NotApplicable/Page_IBEX Payroll/button_Save'))

