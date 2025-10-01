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

'Ann\'s test org'
WebUI.callTestCase(findTestCase('Shared/SH_Navigate(Switch Org)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Payroll Setup/a_PAYROLL'))

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Payroll/a_Payroll Setup'))

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Payroll Setup/button_Edit'))

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll/a_Accrual Instructions'))

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Payroll Instruction Acc_85f223/select_-- Select Accrual --Accrued Banked T_fd4ec2'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Payroll Instruction Acc_85f223/select_-- Select Accrual --Accrued Banked T_fd4ec2'), 
    'Accrued Max - Provincial Tax', true)

WebUI.doubleClick(findTestObject('Broken_test/Page_IBEX Payroll - Payroll Instruction Acc_85f223/select_-- Select Accrual --Accrued Banked T_fd4ec2'))

WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Payroll Instruction Acc_85f223/select_-- Select Accrual --Accrued Banked T_fd4ec2'), 
    'Accrued Max - Provincial Tax', false, 15)

WebUI.sendKeys(findTestObject('Broken_test/Page_IBEX Payroll - Payroll Instruction Acc_85f223/select_-- Select Accrual --Accrued Banked T_fd4ec2'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

