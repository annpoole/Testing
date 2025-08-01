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

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll - Payroll Setup/a_Add New Earning_Benefit'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_Name'), 
    'Test Benefit 1')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_nameFrench'), 
    'Test Benefit 1')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_Description'), 
    'Test Benefit 1')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_descriptionFrench'), 
    'Test Benefit 1')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/fw-select_Instruction Type'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/div_Benefit'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/fw-select_Schedule'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/div_Occasional'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_policyTypeHomeDepartmentOnly'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/fw-select_Input value type'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/div_Hours'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_Default Value'), 
    '0')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_Determined using a formula'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/textarea_defaultFormula'), 
    '(([OpeningAccrualBalance:VACATION_PAY])+([SumAccrualBalanceChange:YTD_AccruedVacEarned_AMT]))/[PayRate]-(([SumAccrualBalanceChange:YTD_VacationHoursTakenPaidHrly_HRS])+([OpeningAccrualBalance:VACATION_TIME]))\n')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_Formula Code'), 
    'TestBenefit1')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/button_Save'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/a__ BACK TO PAYROLL SETUP_ PAYROLL INSTRUCTIONS'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll - Payroll Setup/a_Add New Earning_Benefit'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_Name'), 
    'Test Benefit 2')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_nameFrench'), 
    'Test Benefit 2')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_Description'), 
    'Test Benefit 2')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_descriptionFrench'), 
    'Test Benefit 2')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/fw-select_Instruction Type'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/div_Benefit'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/span_span -Select Schedule'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/div_Occasional'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_policyTypeHomeDepartmentOnly'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/fw-select_Input value type'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/div_Hours'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_Default Value'), 
    '0')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_Old pay rate'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/textarea_defaultFormula'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/textarea_defaultFormula'), 
    GlobalVariable.G_benefits_formula_1_2_3)

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_Formula Code'), 
    'TestBenefit2')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/button_Save'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/a__ BACK TO PAYROLL SETUP_ PAYROLL INSTRUCTIONS'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll - Payroll Setup/a_Add New Earning_Benefit'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_Name'), 
    'Test Benefit 3')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_nameFrench'), 
    'Test Benefit 3')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_Description'), 
    'Test Benefit 3')

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_descriptionFrench'), 
    'Test Benefit 3')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/fw-select_Instruction Type'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/div_Benefit'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/fw-select_Schedule'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/div_Occasional'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_policyTypeHomeDepartmentOnly'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/fw-select_Input value type'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/div_Hours'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_Default Value'), 
    '0')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_New pay rate'))

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/textarea_defaultFormula'), 
    GlobalVariable.G_benefits_formula_1_2_3)

WebUI.setText(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/input_Formula Code'), 
    'TestBenefit3')

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/button_Save'))

WebUI.click(findTestObject('Object Repository/Mid_period_increase/TC12_Add_BenefitPI_Variants/Page_IBEX Payroll/a__ BACK TO PAYROLL SETUP_ PAYROLL INSTRUCTIONS'))

