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


'--------- Dropdown ---------'
'Get number of total option: Count số lượng item hiện diện trong dropdown list'
int totalOptions = WebUI.getNumberOfTotalOption(findTestObject('Default_DropDown/Single_Dropdown'))
println "Total items is: " + totalOptions

'Verify Options Present: Kiểm tra danh sách items có hiện diện trong dropdown list hay không?'
'Verify these text: ['Day', '1', '2', '3'] present in Date Of Birth dropdown'
WebUI.verifyOptionsPresent(findTestObject('Default_DropDown/Single_Dropdown'), ['Day', '1', '2', '3'])

'Verify Option Present By Label: Kiểm tra label (displayed text) có hiện diện trong dropdown list hay không?'
'Verify option present by label: <option value="0">Day</option>'
WebUI.verifyOptionPresentByLabel(findTestObject('Default_DropDown/Single_Dropdown'), 'Day', false, 30)

'Verify Option Present By Value: Kiểm tra attribute value (của thẻ option) có hiện diện trong dropdown list hay không?'
'Verify option present by value: <option value="1">1</option>'
WebUI.verifyOptionPresentByValue(findTestObject('Default_DropDown/Single_Dropdown'), '1', false, 30)

'Verify Option Not Present By Label: Kiểm tra label (displayed text) có KHÔNG hiện diện trong dropdown list hay không?'
'Verify option not present by label: eg <option value="4">Four</option>'
WebUI.verifyOptionNotPresentByLabel(findTestObject('Default_DropDown/Single_Dropdown'), 'Four', false, 30)

'Verify Option Not Present By Value: Kiểm tra attribute value (của thẻ option) có KHÔNG hiện diện trong dropdown list hay không?'
'Verify option not present by value: eg <option value="35">4</option>'
WebUI.verifyOptionNotPresentByValue(findTestObject('Default_DropDown/Single_Dropdown'), '35', false, 30)

'Select Option By Index: Select item được chỉ định bởi index. Trong dropdown, index bắt đầu = 0'
'Select value on dropdown by index 31: ngay 31'
WebUI.selectOptionByIndex(findTestObject('Default_DropDown/Single_Dropdown'), 31)

'Verify Option Selected By Index: Kiểm tra item index có đang được select hay không?'
'Verify index 31 (ngay 31) is selected'
WebUI.verifyOptionSelectedByIndex(findTestObject('Default_DropDown/Single_Dropdown'), 31, 30)

'Verify Option Not Selected By Index: Kiểm tra item index có đang KHÔNG select hay không?'
'Verify option not selected by index 2: eg <option value="2">2</option>'
WebUI.verifyOptionNotSelectedByIndex(findTestObject('Default_DropDown/Single_Dropdown'), 2, 30)

'Select Option By Label: Select item được chỉ định bởi label (displayed text)'
'Select value on dropdown by label: Day 10'
WebUI.selectOptionByLabel(findTestObject('Default_DropDown/Single_Dropdown'), '10', false)

'Verify Option Selected By Label: Kiểm tra label (displayed text) có đang được select hay không?'
'Verify option Day 10 is selected'
WebUI.verifyOptionSelectedByLabel(findTestObject('Default_DropDown/Single_Dropdown'), '10', false, 30)

'Verify Option Not Selected By Label: Kiểm tra label (displayed text) có đang KHÔNG select hay không?'
'Verify option not selected by label 20: eg <option value="20">20</option>'
WebUI.verifyOptionNotSelectedByLabel(findTestObject('Default_DropDown/Single_Dropdown'), '20', false, 30)

'Select Option By Value: Select item được chỉ định bởi attribute value (trong thẻ option).'
'Select value on dropdown by value 15'
WebUI.selectOptionByValue(findTestObject('Default_DropDown/Single_Dropdown'), '15', false)

'Verify Option Selected By Value: Verify item được chỉ định bởi attribute value (trong thẻ option) có đang được select hay không?'
'Verify option Day 15 is selected'
WebUI.verifyOptionSelectedByValue(findTestObject('Default_DropDown/Single_Dropdown'), '15', false, 2)

' Verify Option Not Selected By Value: Verify item được chỉ định bởi attribute value (trong thẻ option) có đang KHÔNG select hay không?'
'Verify option not selected by value 2'
WebUI.verifyOptionNotSelectedByValue(findTestObject('Default_DropDown/Single_Dropdown'), '2', false, 30)

'Get Number Of Selected Option: Count số lượng item được select trong dropdown, Keyword này được dùng cho dropdown cho phép select nhiều item'
'Get number of selected option'
int selectedOptions = WebUI.getNumberOfSelectedOption(findTestObject('Default_DropDown/Multiple_Dropdown'))

'Deselect All Option: Deselect tất cả các items trong dropdown, Keyword này được dùng cho dropdown cho phép select nhiều item'
'Deselect all options'
WebUI.deselectAllOption(findTestObject('Default_DropDown/Multiple_Dropdown'))

'Select All Option: Select tất cả các items hiện diện trong dropdown, Keyword này được dùng cho dropdown cho phép select nhiều item'
'Select all options'
WebUI.selectAllOption(findTestObject('Default_DropDown/Multiple_Dropdown'))

'Deselect Option By Index: Deselect item được chỉ định bởi index. Trong dropdown, index bắt đầu = 0.'
'Deselect option by index 1: One'
WebUI.deselectOptionByIndex(findTestObject('Default_DropDown/Multiple_Dropdown'), 1)

'Deselect Option By Label: Deselect item được chỉ định bởi label (displayed text)'
'Deselect option by label: Two'
WebUI.deselectOptionByLabel(findTestObject('1.Basic/Topic_08_Handle_User_Action/05.DropdownList/Default_DropDown/Multiple_Dropdown'), "Two", false)

'Deselect Option By Value: Deselect item được chỉ định bởi attribute value (trong thẻ option)'
'Deselect option by value: 3 - Three'
WebUI.deselectOptionByValue(findTestObject('1.Basic/Topic_08_Handle_User_Action/05.DropdownList/Default_DropDown/Multiple_Dropdown'), '3', false)

*/

}
