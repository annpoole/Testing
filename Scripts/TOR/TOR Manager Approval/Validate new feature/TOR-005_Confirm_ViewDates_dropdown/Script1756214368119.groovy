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

WebUI.navigateToUrl('https://sit.ibexpayroll.com:8443/edge2/everestspa/tasks/timeoff')

WebUI.click(findTestObject('Object Repository/TOR/TOR Manager Approval/TOR-005_Confirm View Filter/Page_IBEX Payroll - Time Off Review/fw-select_Days Requested'))

WebUI.verifyElementText(findTestObject('Object Repository/TOR/TOR Manager Approval/TOR-005_Confirm View Filter/Page_IBEX Payroll - Time Off Review/div_Days Requested'), 
    'Days Requested')

WebUI.verifyElementText(findTestObject('Object Repository/TOR/TOR Manager Approval/TOR-005_Confirm View Filter/Page_IBEX Payroll - Time Off Review/div_Submitted Date'), 
    'Submitted Date')

WebUI.click(findTestObject('Object Repository/TOR/TOR Manager Approval/TOR-005_Confirm View Filter/Page_IBEX Payroll - Time Off Review/div_Submitted Date'))

WebUI.verifyElementText(findTestObject('Object Repository/TOR/TOR Manager Approval/TOR-005_Confirm View Filter/Page_IBEX Payroll - Time Off Review/button_Find'), 
    'Find')

WebUI.click(findTestObject('Object Repository/TOR/TOR Manager Approval/TOR-005_Confirm View Filter/Page_IBEX Payroll - Time Off Review/button_Find'))

