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

//Open browser
WebUI.openBrowser('https://opensource-demo.orangehrmlive.com')
WebUI.maximizeWindow()


WebUI.verifyElementPresent(findTestObject('Object Repository/Page_opensource-demo.orangehrmlive.com/title_login'),3)
//Input username
WebUI.setText(findTestObject('Object Repository/Page_opensource-demo.orangehrmlive.com/input_username'),"Admin")


//Input password
WebUI.setText(findTestObject('Object Repository/Page_opensource-demo.orangehrmlive.com/input_password'),"admin123")

// Click Button Login
WebUI.click(findTestObject('Object Repository/Page_opensource-demo.orangehrmlive.com/btn_login'))

//Verify selected menu
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_opensource-demo.orangehrmlive.com/menu_dashboard'), "class", "oxd-main-menu-item active", 0)
