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

WebUI.click(findTestObject('Object Repository/Departments/TC11_VerifyFieldsInEditScreen/Page_IBEX Payroll - Organization Payroll De_204c37/a_Edit'))

WebUI.verifyElementText(findTestObject('Object Repository/Departments/TC11_VerifyFieldsInEditScreen/Page_IBEX Payroll - Department Details/label_Valid Input Value 1'), 
    'Field Header 1:')

WebUI.verifyElementText(findTestObject('Object Repository/Departments/TC11_VerifyFieldsInEditScreen/Page_IBEX Payroll - Department Details/label_valid Input value 2'), 
    'Field Header 2:')

WebUI.verifyElementClickable(findTestObject('Object Repository/Departments/TC11_VerifyFieldsInEditScreen/Page_IBEX Payroll - Department Details/input_Valid Input Value 1_department.Custom_fcb433'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Departments/TC11_VerifyFieldsInEditScreen/Page_IBEX Payroll - Department Details/input_valid Input value 2_department.Custom_848525'))

WebUI.click(findTestObject('Object Repository/Departments/TC11_VerifyFieldsInEditScreen/Page_IBEX Payroll - Department Details/a_Return to Organization Payroll Departments'))

