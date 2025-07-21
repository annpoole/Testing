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


// Step 2: Click to Sort Ascending
WebUI.click(findTestObject('Shared/SH_VerifyFieldSortingAndFiltering/Page_IBEX Payroll - Organization Payroll De_204c37/th_Field Header 1'))

WebUI.delay(2 // wait for sort
    )

// Step 3: Capture values for ascending
List<String> valuesAsc = []

for (int i = 1; i <= 5; i++) {
    String xpath = ('//*[@id="departmentsGrid"]/tbody/tr[' + i) + ']/td[6]'

    TestObject cell = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, xpath)

    valuesAsc.add(WebUI.getText(cell).trim())
}

List<String> sortedAsc = new ArrayList(valuesAsc)

sortedAsc.sort()

if (valuesAsc == sortedAsc) {
    WebUI.comment('✅ Ascending sort is correct')
} else {
    WebUI.comment('❌ Ascending sort is NOT correct')

    WebUI.comment('Expected: ' + sortedAsc)

    WebUI.comment('Actual: ' + valuesAsc)

    assert false
}

// Step 4: Click again to sort descending
WebUI.click(findTestObject('Shared/SH_VerifyFieldSortingAndFiltering/Page_IBEX Payroll - Organization Payroll De_204c37/th_Field Header 1'))

WebUI.delay(2 // wait for sort
    )

// Step 5: Capture values for descending
List<String> valuesDesc = []

for (int i = 1; i <= 5; i++) {
    String xpath = ('//*[@id="departmentsGrid"]/tbody/tr[' + i) + ']/td[6]'

    TestObject cell = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, xpath)

    valuesDesc.add(WebUI.getText(cell).trim())
}

List<String> sortedDesc = new ArrayList(valuesDesc)

sortedDesc.sort(Collections.reverseOrder())

if (valuesDesc == sortedDesc) {
    WebUI.comment('✅ Descending sort is correct')
} else {
    WebUI.comment('❌ Descending sort is NOT correct')

    WebUI.comment('Expected: ' + sortedDesc)

    WebUI.comment('Actual: ' + valuesDesc)

    assert false
}

