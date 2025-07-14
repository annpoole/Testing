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

WebUI.navigateToUrl('https://sit.ibexpayroll.com:8443/edge8/identityserver/Account/Login?ReturnUrl=%2Fedge8%2Fidentityserver%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3Deveresthybrid%26redirect_uri%3Dhttps%253A%252F%252Fsit.ibexpayroll.com%253A8443%252Fedge8%252Feverest%252FLogin%252FAuthenticate.mr%26response_mode%3Dform_post%26response_type%3Dcode%2520id_token%2520token%26scope%3Deverest%2520openid%2520user_name%26state%3DOpenIdConnect.AuthenticationProperties%253DOSaz6Q-2GNcshmC17SO2B_VLdA5dB7HRJZ9VnR_Pcf8Rg8WD_6zFuUC-R2ER9DrmGbfDOkM_2q0s6snNgigPXxFJwIUxrLtkd3YVueGdfhIVCusfSYfzBvSToKsDJHPC9d8uBbc66snrsJ6F600sctYRoPXxMbNcEobbvE3QbBKqnWEuJ8PB9qXb0m8xbXHnhIIxWCEiQUU4Y3wdzqTqB_ofkgzokL_eUHSq0wOdFyR6_5tJmOuPUJIImPkuJveC4E5q472kwbIOcJEyy6Voxd53tUlyk2CRQa9GMPEGLVqBb0D3WClBYoEPGS91mc0r%26nonce%3D638880974604900944.Mzc0NGFjYjYtNmUzZC00ZmQ5LTgxMGEtOGI5ZWYwZTgwYjJhMDNjMWM0NzMtZmI4My00YzU4LTk4NjctMTliZWViZDhiMzVi&timestamp=2025-07-14T13%3A44%3A50.8260317Z')

WebUI.setText(findTestObject('Object Repository/Page_IBEX Payroll - Login/input_Username_Input.Username'), 'uat.dstewart')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_IBEX Payroll - Login/input_Show Password_Input.Password'), 
    'p4y+y39Ir5Oy1MY8jPt0uQ==')

WebUI.click(findTestObject('Object Repository/Page_IBEX Payroll - Login/input_Remember me_Input.Button'))

