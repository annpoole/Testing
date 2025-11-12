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

WebUI.callTestCase(findTestCase('Everest_Regression_Tests/Home/TC-Home-01'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Home/a_Payroll'))

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Payroll/a_Process Payroll  Review Payroll History'))

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Process Payroll  Review_740d76/a_Input Sheet'))

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Input Sheet/td_Reg. Hourly Pay'))

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Input Sheet/td_0.00_1_2'))

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Input Sheet/td_Abbie, Nawroz'))

