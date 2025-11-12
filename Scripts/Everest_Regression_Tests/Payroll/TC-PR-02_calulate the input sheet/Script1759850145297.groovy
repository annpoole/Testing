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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

// Step 1: Create Regular Payroll
// Step 2: Wait up to 15 min for "In Progress" to appear
TestObject inProgressObj = findTestObject('Object Repository/Everest_Regression_Tests/TC-PR-02_calucate the input sheet/Page_IBEX Payroll - Process Payroll  Review_740d76/div_In Progress')

int maxWaitSeconds = 900 // 15 minutes

int intervalSeconds = 10 // check every 10 seconds

boolean isFound = false

for (int elapsed = 0; elapsed < maxWaitSeconds; elapsed += intervalSeconds) {
    if (WebUI.verifyElementPresent(inProgressObj, intervalSeconds, FailureHandling.OPTIONAL)) {
        WebUI.comment("✅ 'In Progress' element found after $elapsed seconds.")

        isFound = true

        break
    } else {
        WebUI.comment("⏳ Still waiting for 'In Progress'... ($elapsed/$maxWaitSeconds seconds)")
    }
}

if (!(isFound)) {
    WebUI.comment('❌ \'In Progress\' element did not appear within 15 minutes.')

    assert false
}

// Step 3: Click Input Sheet tab
WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-PR-02_calucate the input sheet/Page_IBEX Payroll - Process Payroll  Review_740d76/a_Input Sheet'))

// Step 4: Verify Input Sheet loaded
WebUI.verifyElementText(findTestObject('Object Repository/Everest_Regression_Tests/TC-PR-02_calucate the input sheet/Page_IBEX Payroll - Input Sheet/td_Reg. Hourly Pay'), 
    'Reg. Hourly Pay')

// Step 5: Define and find rate cells
TestObject rateCells = new TestObject('rateCells')

rateCells.addProperty('xpath', ConditionType.EQUALS, '//td[contains(@class,\'rate-column\')]')

List allRates = WebUI.findWebElements(rateCells, 10)

int row = 1

boolean hasZeroRate = false

// Step 6: Verify all Regular Hourly Pay rates > 0
for (def cell : allRates) {
    String text = cell.getText().trim()

    println("Row $row → Value: $text")

    def rateValue = text.replaceAll('[^0-9.]', '')

    double rate = rateValue ? rateValue.toDouble() : 0.0

    if (rate <= 0) {
        WebUI.comment("❌ Row $row: Rate is invalid (0 or missing)")

        hasZeroRate = true
    } else {
        WebUI.comment("✅ Row $row: Valid rate = $rate")
    }
    
    row++
}

// Step 7: Final check
if (hasZeroRate) {
    WebUI.comment('❌ One or more Regular Hourly Pay rates are 0. Test failed.')

    assert false : 'Some Regular Hourly Pay rates are 0. Please verify the input sheet.'
} else {
    WebUI.comment('✅ All Regular Hourly Pay rates are greater than 0.')
}

WebUI.click(findTestObject('Everest_Regression_Tests/TC-PR-02_calucate the input sheet/Page_IBEX Payroll - Process Payroll  Review_740d76/calculate button'))

