package Katalon;

public class Documents {
	/*
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

'---------------------- Web Browser Command ----------------------'
'Open browser'
WebUI.openBrowser('');

'Navigate to Url'
WebUI.navigateToUrl('');

'Back to previous page'
WebUI.back();

'Forward to next page'
WebUI.forward();

'Refresh the current page'
WebUI.refresh();

'Close window/tab by title'
WebUI.closeWindowTitle('window/tab title');

'Get current page URL'
WebUI.getUrl();

'Close window/tab by Url'
WebUI.closeWindowUrl('window/tab Url');

'Get index of current window'
WebUI.getWindowIndex();

'Close window/tab by Index'
WebUI.closeWindowIndex('window/tab index');

'Get Page Height'
WebUI.getPageHeight();

'Get Page Width'
WebUI.getPageWidth();

'Set View Port Size'
WebUI.setViewPortSize('width', 'height');

'Close browser'
WebUI.closeBrowser();


'---------------------- Handle User Action ----------------------'

'https://docs.katalon.com/docs/legacy/katalon-studio-enterprise/keywords/web-ui-keywords/webui-accept-alert'
' Window -> Katalon Studio References -> Katalon -> Test Case'


'--------- Textbox and TextArea ---------'

'Focus on \'Username\' field'
WebUI.focus(findTestObject('Page_Login/txt_UserName'));

'Input username'
WebUI.setText(findTestObject('Page_Login/txt_UserName'), Username);

'Press Ctrl+A to select all text in txt_UserName'
WebUI.sendKeys(findTestObject('Page_Login/txt_UserName'), Keys.chord(Keys.CONTROL, 'a'));

'Set Encrypted Text : Help > Encrypt Text Ex: abc123 > HwXnxaZD17M='
'Input password'
WebUI.setEncryptedText(findTestObject('Page_Login/txt_Password'), 'HwXnxaZD17M=');


'--------- Button ---------'

'Click on \'Book Appointment\' button'
WebUI.click(findTestObject('Page_CuraHomepage/btn_MakeAppointment'));

"Double click to button 'Double-Click Me To See Alert'"
WebUI.doubleClick(findTestObject('Guru99/btn_DoubleClick'));

"Right click to button 'right click me'"
WebUI.rightClick(findTestObject('Guru99/btn_RightClick'));

'Verify \'Make Appointment\' button is clickable'
WebUI.verifyElementClickable(findTestObject('Page_CuraHomepage/btn_MakeAppointment'));

'Verify \'Make Appointment\' button is NOT clickable'
WebUI.verifyElementNotClickable(findTestObject('Page_CuraHomepage/btn_MakeAppointment'));

'Get status of button Đăng Nhập'
'if true -> button is disable, else -> button is enabled'
boolean status = WebUI.getAttribute(findTestObject('Object Repository/1.Basic/Topic_08_Handle_User_Action/01.Textbox_TextArea/btn_Login'), "disabled");
 
'Verify status of button Đăng Nhập'
WebUI.verifyEqual(status, false);

'Get background color of button Login'
String backgroundColor = WebUI.getCSSValue(findTestObject('Object Repository/1.Basic/Topic_08_Handle_User_Action/02.Button/nopcommerce/btn_Login'), "background-color");

'Convert RGBA to Hex'
backgroundColor = convertRGBAToHex(backgroundColor);
println backgroundColor;

public static String convertRGBAToHex(String backgroundColor) {
	String[] hexValue = backgroundColor.split("[, rgba()]+")
	 
	int hexValue1 = Integer.valueOf(hexValue[1])
	int hexValue2 = Integer.valueOf(hexValue[2])
	int hexValue3 = Integer.valueOf(hexValue[3])
	 
	String result = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3)
	return result
}


'Định nghĩa sẵn 1 danh sách checkbox cần check'
List<String> randomCheckBox = ["Anemia", "Arthritis", "Heart Attack"]
 
'Get list of element of checkbox'
List<WebElement> lstElementCheckbox = WebUI.findWebElements(findTestObject('Checkbox/automationfc/chk_CheckAll_1'), 2)
 
'Check all checkbox'
for(item in lstElementCheckbox){
    String itemText = item.getAttribute("value")
    Boolean isCheck = item.isSelected()
    if(randomCheckBox.contains(itemText) && !isCheck){
        item.click()
    }
}


'--------- Radio Button ---------'
'Select radio button: 2.0 Diesel, 103kW'
WebUI.click(findTestObject('Radio/rad_2.0 Diese'))

"Verify default radio button: 2.0 Diesel, 103kW is unselected"
WebUI.verifyElementNotChecked(findTestObject('Radio/rad_2.0 Diese'), 10)

"Verify radio button: 2.0 Diesel, 103kW is selected"
WebUI.verifyElementChecked(findTestObject('Radio/rad_2.0 Diese'), 2)

*/

}
