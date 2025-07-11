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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sit.ibexpayroll.com:8443/edge8/identityserver/Account/Login?ReturnUrl=%2Fedge8%2Fidentityserver%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3Deveresthybrid%26redirect_uri%3Dhttps%253A%252F%252Fsit.ibexpayroll.com%253A8443%252Fedge8%252Feverest%252FLogin%252FAuthenticate.mr%26response_mode%3Dform_post%26response_type%3Dcode%2520id_token%2520token%26scope%3Deverest%2520openid%2520user_name%26state%3DOpenIdConnect.AuthenticationProperties%253DftRZpO0_ORLesUbmwBaOGPlBBRovtQoUoY7B-bpf4N-rSfTYc5OgSUnBqHG4PIfSIn5Sm4uUtru_WyR4yYL0haj80ZOYqBH_tXXF9wUPLvy8j0j5uME5PChMptCvfG-5etD1Vk8tq9MnvkhGdkm6lBXX0dpfLprq_WAnE1A6HtDHdGZroFdS-4c7j73um2mOoAWzNiil2btpFje-4urSQcF9ZvorGyO8J_PTueVLv7fwmz6-DvRD6qhFfCYZHLDk9n02CEl_nTDC1VcKh_UqPlvn7zGQcBUChQPBBJujnjNKSDw3tjXFlegRBh4z-9iF%26nonce%3D638877690251120556.NDBkYzcwMTEtMTMxMS00M2ZhLWFlMjMtNzM2NGU1M2E5ZjFmZDk5YjU4MjktZDgyNy00NmFkLWIyNTItYzNlMjMxNThjNmM1&timestamp=2025-07-10T18%3A30%3A55.3207520Z')

WebUI.setText(findTestObject('Object Repository/Login/Page_IBEX Payroll - Login/input_Username_Input.Username'), 'uat.dstewart')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_IBEX Payroll - Login/input_Show Password_Input.Password'), 
    'p4y+y39Ir5Oy1MY8jPt0uQ==')

WebUI.click(findTestObject('Object Repository/Login/Page_IBEX Payroll - Login/input_Remember me_Input.Button'))

