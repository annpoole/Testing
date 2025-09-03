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

WebUI.click(findTestObject('Object Repository/TOR/TOR Manager Approval/TOR-009_confirm filter/Page_IBEX Payroll - Time Off Review/i_filter_list'))

WebUI.setText(findTestObject('Object Repository/TOR/TOR Manager Approval/TOR-009_confirm filter/Page_IBEX Payroll - Time Off Review/input_Leave_input-text u-m-bottom--half ng-_6f13fa'), 
    'sil')

WebUI.verifyElementText(findTestObject('Object Repository/TOR/TOR Manager Approval/TOR-009_confirm filter/Page_IBEX Payroll - Time Off Review/label_SIL'), 
    'SIL')

WebUI.click(findTestObject('Object Repository/TOR/TOR Manager Approval/TOR-009_confirm filter/Page_IBEX Payroll - Time Off Review/input_Anemone House_HomeDepartmentName1'))

WebUI.click(findTestObject('Object Repository/TOR/TOR Manager Approval/TOR-009_confirm filter/Page_IBEX Payroll - Time Off Review/div_Leave_cdk-overlay-backdrop cdk-transpar_2727b2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TOR/TOR Manager Approval/TOR-009_confirm filter/Page_IBEX Payroll - Time Off Review/td_Home DepartmentSIL'), 
    15)

WebUI.click(findTestObject('Object Repository/TOR/TOR Manager Approval/TOR-009_confirm filter/Page_IBEX Payroll - Time Off Review/th_Home Department filter_list'))

