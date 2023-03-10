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

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Object Repository/Page_MAL_Project/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_MAL_Project/input'), 'TokiDokor')

WebUI.setText(findTestObject('Object Repository/Page_MAL_Project/input_1'), 'Milk@081')

WebUI.click(findTestObject('Object Repository/Page_MAL_Project/button_submit'))

WebUI.setText(findTestObject('Object Repository/Page_MAL_Project/input_Description_search-field'), 'lycoris')

WebUI.sendKeys(findTestObject('Object Repository/Page_MAL_Project/input_Description_search-field'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Page_MAL_Project/img'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MAL_Project/select_Score012345678910'), '7', true)

WebUI.click(findTestObject('Object Repository/Page_MAL_Project/button_Add to list'))

WebUI.click(findTestObject('Object Repository/Page_MAL_Project/a_Favorite'))

WebUI.click(findTestObject('Object Repository/Page_MAL_Project/button_-'))

WebUI.click(findTestObject('Object Repository/Page_MAL_Project/nav_Anime LookupDiscoveryFavoriteLog out'))

WebUI.waitForElementNotPresent(findTestObject('Page_MAL_Project/button_-'), 3)

WebUI.closeBrowser()

