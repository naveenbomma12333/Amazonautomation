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

WebUI.callTestCase(findTestCase('TC_01 Verify the Login Functionality'), [('UserPhonenumber') : "9177580572", ('Password') : "Nations@123"], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Searchitempage/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_field-keywords'), 
    'lenovo tab m12')

WebUI.click(findTestObject('Searchitempage/Page_Amazon.in  lenovo tab m12/entersearch'))

WebUI.click(findTestObject('Object Repository/Searchitempage/Page_Amazon.in  lenovo tab m12/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Searchitempage/Page_Amazon.in  lenovo tab m12/button_Add to cart_1'))

WebUI.click(findTestObject('Object Repository/Searchitempage/Page_Amazon.in  lenovo tab m12/span_Cart'))

WebUI.click(findTestObject('Object Repository/Searchitempage/Page_Amazon.in Shopping Cart/input_This order contains a gift_proceedToR_057b5e'))

WebUI.click(findTestObject('Object Repository/Searchitempage/Page_Place Your Order - Amazon Checkout/input_Full content visible, double tap to r_8271ab'))

WebUI.click(findTestObject('Object Repository/Searchitempage/Page_Place Your Order - Amazon Checkout/a_in'))

//WebUI.click(findTestObject('Object Repository/Searchitempage/Page_Online Shopping site in India Shop Onl_10c5f3/a_Buy Again'))

//WebUI.click(findTestObject('Object Repository/Searchitempage/Page_Buy Again/input_Removed_submit.addToCart'))

WebUI.closeBrowser()


