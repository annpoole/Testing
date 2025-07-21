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

WebUI.click(findTestObject('Object Repository/Departments/TC10a_VerifyColumnsAfterBothFieldsEnabled/Page_IBEX Payroll - Organization Payroll De_204c37/a_Manage Department Fields (1)'))

WebUI.click(findTestObject('Object Repository/Departments/TC10a_VerifyColumnsAfterBothFieldsEnabled/Page_IBEX Payroll - Manage Department Field/input_Custom Department Field 1_field02Enabled'))

WebUI.click(findTestObject('Object Repository/Departments/TC10a_VerifyColumnsAfterBothFieldsEnabled/Page_IBEX Payroll - Manage Department Field/button_Save'))

WebUI.click(findTestObject('Object Repository/Departments/TC10a_VerifyColumnsAfterBothFieldsEnabled/Page_IBEX Payroll - Manage Department Field/a_Back to PAYROLL DEPARTMENTS_1'))

WebUI.callTestCase(findTestCase('Shared/SH_VerifyCustomField_Header_In_Table'), [:], FailureHandling.STOP_ON_FAILURE)

