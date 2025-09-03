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

WebUI.click(findTestObject('TOR/TOR Manager Approval/TOR-005_Confirm View Filter/Page_IBEX Payroll - Time Off Review/fw-select_Days Requested'))

WebUI.click(findTestObject('TOR/TOR Manager Approval/TOR-005_Confirm View Filter/Page_IBEX Payroll - Time Off Review/div_Submitted Date'))

// Inform tester about the upcoming manual interaction
WebUI.comment('highlighting the next dropdown ')

// Optional: visually highlight the dropdown for the tester
WebUI.executeJavaScript('\n    const el = document.querySelector(\'input_From_historyStart\');\n    if (el) { el.style.border = \'2px solid red\'; el.scrollIntoView({behavior: \'smooth\', block: \'center\'}); }\n', 
    null)

TestObject dateField = findTestObject('Object Repository/TOR/TOR Manager Approval/TOC-006_Validate Submitted date filter/Page_IBEX Payroll - Time Off Review/input_From_historyStart')

// Click to focus
WebUI.click(dateField)

// Clear any existing value
WebUI.sendKeys(dateField, Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(dateField, Keys.chord(Keys.BACK_SPACE))

// Type the date
WebUI.sendKeys(dateField, SubmittedDateFrom)

// Confirm with Enter
WebUI.sendKeys(dateField, Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Object Repository/TOR/TOR Manager Approval/TOC-006_Validate Submitted date filter/Page_IBEX Payroll - Time Off Review/input_From_historyStart'), 
    Keys.chord(Keys.ENTER, Keys.ESCAPE))

WebUI.click(findTestObject('Object Repository/TOR/TOR Manager Approval/TOC-006_Validate Submitted date filter/Page_IBEX Payroll - Time Off Review/button_Find'))

WebUI.verifyElementText(findTestObject('Object Repository/TOR/TOR Manager Approval/TOC-006_Validate Submitted date filter/Page_IBEX Payroll - Time Off Review/td_Knott, Daisy'), 
    EE_Name)

WebUI.verifyElementText(findTestObject('Object Repository/TOR/TOR Manager Approval/TOC-006_Validate Submitted date filter/Page_IBEX Payroll - Time Off Review/td_Duration8h 0m'), 
    DurationTOR)

WebUI.click(findTestObject('Object Repository/TOR/TOR Manager Approval/TOC-006_Validate Submitted date filter/Page_IBEX Payroll - Time Off Review/i_expand_more'))

WebUI.verifyElementText(findTestObject('Object Repository/TOR/TOR Manager Approval/TOC-006_Validate Submitted date filter/Page_IBEX Payroll - Time Off Review/div_0300 PM - 1100 PM (8h 0m)'), 
    TotalHoursRequested)

