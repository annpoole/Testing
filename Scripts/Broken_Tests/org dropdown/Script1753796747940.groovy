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

WebUI.callTestCase(findTestCase('Shared/SH_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Home/div_Darryl Stewart'))

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Home/a_exit_to_app'))

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Login/input_Input.Button'))

WebUI.setText(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Login/input_Username'), 'uat.dstewart')

WebUI.setEncryptedText(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Login/input_Password'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Home/div_headerUserFullName'))

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Home/a_settings'))

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Provider Settings/div_headerOrganizationName'))

WebUI.click(findTestObject('Object Repository/Broken_test/Page_IBEX Payroll - Provider Settings/a_changePassword'))

