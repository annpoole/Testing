import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement

// Step 1: Navigate
WebUI.callTestCase(findTestCase('Everest_Regression_Tests/Home/TC-Home-01'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-PR-01_Create_and_Import_payroll/Page_IBEX Payroll - Home/a_Payroll'))

WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-PR-01_Create_and_Import_payroll/Page_IBEX Payroll - Payroll/a_Process Payroll  Review Payroll History_1'))

// Step 2: Setup
def driver = DriverFactory.getWebDriver()

String targetPayPeriod = pay_Period

boolean periodFound = false

boolean isProcessed = false

// Step 3: Loop through rows
List<WebElement> rows = driver.findElements(By.xpath('//table//tbody/tr'))

WebUI.comment("Total rows found: $rows.size()")

for (int i = 0; i < rows.size(); i++) {
    WebElement row = rows[i]

    List<WebElement> cells = row.findElements(By.tagName('td'))

    // Skip empty or header rows
    if (cells.size() < 4) {
        continue
    }
    
    String payPeriodText = (cells[2]).getText().trim( // 3rd column = Pay Period
        )

    String statusText = (cells[3]).getText().trim( // 4th column = Status
        )



    if (payPeriodText.equalsIgnoreCase(targetPayPeriod)) {
        periodFound = true

        if (statusText.equalsIgnoreCase('Processed')) {
            isProcessed = true

            break
        }
    }
}

// Step 4: Outcome
if (periodFound && isProcessed) {
    WebUI.comment("❌ Pay period '$targetPayPeriod' is already processed. Test stopped.")

    WebUI.verifyEqual(false, true, FailureHandling.STOP_ON_FAILURE)
} else if (periodFound) {
    WebUI.comment("✅ Pay period '$targetPayPeriod' found and not processed. Proceeding normally.")
} else {
    WebUI.comment("⚠️ Pay period '$targetPayPeriod' not found. Clicking Create Next Regular Payroll.")

    WebUI.click(findTestObject('Object Repository/Everest_Regression_Tests/TC-PR-01_Create_and_Import_payroll/Page_IBEX Payroll - Process Payroll  Review_740d76/a_Create Next Regular Payroll for Previous _ef8b34'))
}

