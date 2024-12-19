import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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

// Reusable function to wait for and verify element
def verifyElement(TestObject testObject, String expectedValue, String attributeName = 'text') {
	WebUI.waitForElementVisible(testObject, 20)
	String actualValue = WebUI.getAttribute(testObject, attributeName)
	WebUI.verifyMatch(actualValue, expectedValue, false)
}

// Step 1: Call the Login Test Case
WebUI.callTestCase(findTestCase('TC_01 Verify the Login Functionality'),
	[('UserPhonenumber') : "9177580572", ('Password') : "Nations@123"],
	FailureHandling.STOP_ON_FAILURE)

// Step 2: Search for the product
WebUI.comment("Step 2: Searching for the product")
WebUI.setText(findTestObject('Object Repository/Searchitempage/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_field-keywords'),
	'lenovo tab m11')
WebUI.click(findTestObject('Object Repository/Productdetails/Enterpress'))

// Step 3: Click on the product
WebUI.comment("Step 3: Clicking on the product")
WebUI.click(findTestObject('Object Repository/Productdetails/Product'))

// Step 4: Verify the product title (optional since the title might vary)
WebUI.comment("Step 4: Verifying product details")
verifyElement(findTestObject('Object Repository/Productdetails/Producttitle'), 'Lenovo Tab M11 with Pen')

// Step 5: Verify product price
verifyElement(findTestObject('Object Repository/Productdetails/actualprice'), '19,999')

// Step 6: Verify additional product details
verifyElement(findTestObject('Object Repository/Productdetails/Brand'), 'Lenovo')
verifyElement(findTestObject('Object Repository/Productdetails/Memory'), '128GB')
verifyElement(findTestObject('Object Repository/Productdetails/Screensize'), '11 Inches')

// Step 7: Add the product to cart
WebUI.comment("Step 7: Adding product to cart")
WebUI.waitForElementVisible(findTestObject('Object Repository/Productdetails/Addtocart'), 20)
WebUI.click(findTestObject('Object Repository/Productdetails/Addtocart'))

// Final Step: Close the browser
WebUI.comment("Closing the browser")
WebUI.closeBrowser()

