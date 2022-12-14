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

'Get status of button ????ng Nh???p'
'if true -> button is disable, else -> button is enabled'
boolean status = WebUI.getAttribute(findTestObject('Object Repository/1.Basic/Topic_08_Handle_User_Action/01.Textbox_TextArea/btn_Login'), "disabled");
 
'Verify status of button ????ng Nh???p'
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


'?????nh ngh??a s???n 1 danh s??ch checkbox c???n check'
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
'Get number of total option: Count s??? l?????ng item hi???n di???n trong dropdown list'
int totalOptions = WebUI.getNumberOfTotalOption(findTestObject('Default_DropDown/Single_Dropdown'))
println "Total items is: " + totalOptions

'Verify Options Present: Ki???m tra danh s??ch items c?? hi???n di???n trong dropdown list hay kh??ng?'
'Verify these text: ['Day', '1', '2', '3'] present in Date Of Birth dropdown'
WebUI.verifyOptionsPresent(findTestObject('Default_DropDown/Single_Dropdown'), ['Day', '1', '2', '3'])

'Verify Option Present By Label: Ki???m tra label (displayed text) c?? hi???n di???n trong dropdown list hay kh??ng?'
'Verify option present by label: <option value="0">Day</option>'
WebUI.verifyOptionPresentByLabel(findTestObject('Default_DropDown/Single_Dropdown'), 'Day', false, 30)

'Verify Option Present By Value: Ki???m tra attribute value (c???a th??? option) c?? hi???n di???n trong dropdown list hay kh??ng?'
'Verify option present by value: <option value="1">1</option>'
WebUI.verifyOptionPresentByValue(findTestObject('Default_DropDown/Single_Dropdown'), '1', false, 30)

'Verify Option Not Present By Label: Ki???m tra label (displayed text) c?? KH??NG hi???n di???n trong dropdown list hay kh??ng?'
'Verify option not present by label: eg <option value="4">Four</option>'
WebUI.verifyOptionNotPresentByLabel(findTestObject('Default_DropDown/Single_Dropdown'), 'Four', false, 30)

'Verify Option Not Present By Value: Ki???m tra attribute value (c???a th??? option) c?? KH??NG hi???n di???n trong dropdown list hay kh??ng?'
'Verify option not present by value: eg <option value="35">4</option>'
WebUI.verifyOptionNotPresentByValue(findTestObject('Default_DropDown/Single_Dropdown'), '35', false, 30)

'Select Option By Index: Select item ???????c ch??? ?????nh b???i index. Trong dropdown, index b???t ?????u = 0'
'Select value on dropdown by index 31: ngay 31'
WebUI.selectOptionByIndex(findTestObject('Default_DropDown/Single_Dropdown'), 31)

'Verify Option Selected By Index: Ki???m tra item index c?? ??ang ???????c select hay kh??ng?'
'Verify index 31 (ngay 31) is selected'
WebUI.verifyOptionSelectedByIndex(findTestObject('Default_DropDown/Single_Dropdown'), 31, 30)

'Verify Option Not Selected By Index: Ki???m tra item index c?? ??ang KH??NG select hay kh??ng?'
'Verify option not selected by index 2: eg <option value="2">2</option>'
WebUI.verifyOptionNotSelectedByIndex(findTestObject('Default_DropDown/Single_Dropdown'), 2, 30)

'Select Option By Label: Select item ???????c ch??? ?????nh b???i label (displayed text)'
'Select value on dropdown by label: Day 10'
WebUI.selectOptionByLabel(findTestObject('Default_DropDown/Single_Dropdown'), '10', false)

'Verify Option Selected By Label: Ki???m tra label (displayed text) c?? ??ang ???????c select hay kh??ng?'
'Verify option Day 10 is selected'
WebUI.verifyOptionSelectedByLabel(findTestObject('Default_DropDown/Single_Dropdown'), '10', false, 30)

'Verify Option Not Selected By Label: Ki???m tra label (displayed text) c?? ??ang KH??NG select hay kh??ng?'
'Verify option not selected by label 20: eg <option value="20">20</option>'
WebUI.verifyOptionNotSelectedByLabel(findTestObject('Default_DropDown/Single_Dropdown'), '20', false, 30)

'Select Option By Value: Select item ???????c ch??? ?????nh b???i attribute value (trong th??? option).'
'Select value on dropdown by value 15'
WebUI.selectOptionByValue(findTestObject('Default_DropDown/Single_Dropdown'), '15', false)

'Verify Option Selected By Value: Verify item ???????c ch??? ?????nh b???i attribute value (trong th??? option) c?? ??ang ???????c select hay kh??ng?'
'Verify option Day 15 is selected'
WebUI.verifyOptionSelectedByValue(findTestObject('Default_DropDown/Single_Dropdown'), '15', false, 2)

' Verify Option Not Selected By Value: Verify item ???????c ch??? ?????nh b???i attribute value (trong th??? option) c?? ??ang KH??NG select hay kh??ng?'
'Verify option not selected by value 2'
WebUI.verifyOptionNotSelectedByValue(findTestObject('Default_DropDown/Single_Dropdown'), '2', false, 30)

'Get Number Of Selected Option: Count s??? l?????ng item ???????c select trong dropdown, Keyword n??y ???????c d??ng cho dropdown cho ph??p select nhi???u item'
'Get number of selected option'
int selectedOptions = WebUI.getNumberOfSelectedOption(findTestObject('Default_DropDown/Multiple_Dropdown'))

'Deselect All Option: Deselect t???t c??? c??c items trong dropdown, Keyword n??y ???????c d??ng cho dropdown cho ph??p select nhi???u item'
'Deselect all options'
WebUI.deselectAllOption(findTestObject('Default_DropDown/Multiple_Dropdown'))

'Select All Option: Select t???t c??? c??c items hi???n di???n trong dropdown, Keyword n??y ???????c d??ng cho dropdown cho ph??p select nhi???u item'
'Select all options'
WebUI.selectAllOption(findTestObject('Default_DropDown/Multiple_Dropdown'))

'Deselect Option By Index: Deselect item ???????c ch??? ?????nh b???i index. Trong dropdown, index b???t ?????u = 0.'
'Deselect option by index 1: One'
WebUI.deselectOptionByIndex(findTestObject('Default_DropDown/Multiple_Dropdown'), 1)

'Deselect Option By Label: Deselect item ???????c ch??? ?????nh b???i label (displayed text)'
'Deselect option by label: Two'
WebUI.deselectOptionByLabel(findTestObject('1.Basic/Topic_08_Handle_User_Action/05.DropdownList/Default_DropDown/Multiple_Dropdown'), "Two", false)

'Deselect Option By Value: Deselect item ???????c ch??? ?????nh b???i attribute value (trong th??? option)'
'Deselect option by value: 3 - Three'
WebUI.deselectOptionByValue(findTestObject('1.Basic/Topic_08_Handle_User_Action/05.DropdownList/Default_DropDown/Multiple_Dropdown'), '3', false)


'--------- Dropdown Custom---------'
'Single select: 1. Click v??o dropdown control ????, 2. Select item trong trong dropdown'
'Fist, click on dropdown control'
WebUI.click(findTestObject('Custom_DropDown/Single_DropDown/Single_Dropdown_Parent'))
 
// Because these item in dropdown is hidden. If we don't click on dropdown first, we can not select item under it
'Second, select item on dropdown'
WebUI.click(findTestObject('Custom_DropDown/Single_DropDown/Single_Dropdown_Child_Option1'))

'Multi select: 1. Click v??o dropdown control ????, 2. Select t???t c??? c??c items trong dropdown, Or select random item trong dropdown, Or select item theo 1 danh s??ch b???n mu???n ch???n'
'Step 1: click vao dropdown control'
WebUI.click(findTestObject('Custom_DropDown/Multi_DropDown/Multi_Dropdown_Parent'))
 
// Because these item in dropdown is hidden. If we don't click on dropdown first, we can not select item under it
'Step 2: Chuan bi 1 vai items de select'
List<String> selectedItems = ['One', 'Three', 'Four']
 
'Step 3: Tim tat ca cac item element trong dropdown control'
List<WebElement> listElement = WebUI.findWebElements(findTestObject('Custom_DropDown/Multi_DropDown/Multi_Dropdown_Child'), 2)
 
'Step 4: Duyet qua tung item trong list'
for(WebElement item in listElement){
	'Get label of child item'
	WebElement eleLabel = item.findElement(By.xpath("./span"))
	String label = eleLabel.getText().trim()
	 
	'Get trang thai cua child item: select/unselect'
	WebElement eleInput = eleLabel.findElement(By.xpath("./input"))
	boolean state = eleInput.isSelected()
	 
	// Check xem child item da duoc check hay chua va label co thuoc danh sach minh da chuan o step 2 khong?
	// Neu chua --> select
	// Neu select roi --> bo qua
	if(selectedItems.contains(label) && !state){
		eleInput.click()
	}
}

'--------- Popup---------'
'Wait For Element Visible: Ch??? v??i gi??y ????? element hi???n th??? tr??n trang Web'
"Wait for popup to be visible in 10s"
WebUI.waitForElementVisible(findTestObject('Popup/testproject/popup'), 10)

'Wait For Element Not Visible: Ch??? v??i gi??y ????? element kh??ng c??n hi???n th??? tr??n trang Web sau khi th???c hi???n 1 action n??o ????'
"Wait for popup display"
Boolean isDisplayed = WebUI.waitForElementVisible(findTestObject('Popup/shopee/popup'), 10)

"Check if popup displayed -> Close popup"
if(isDisplayed){
WebUI.click(findTestObject('Popup/shopee/btn_Close'))
}

"Wait for popup NOT visible"
WebUI.waitForElementNotVisible(findTestObject('Popup/shopee/popup'), 10)

'Verify Element Visible: Ki???m tra xem element c?? ??ang hi???n th??? tr??n trang Web hay kh??ng?'
"Wait for Popup displayed"
WebUI.waitForElementVisible(findTestObject('Popup/zingpoll/popup_login'), 2)

"Verify popup displayed (existed in DOM and displayed on UI)"
WebUI.verifyElementVisible(findTestObject('Popup/zingpoll/popup_login'))

'erify Element Not Visible: Ki???m tra xem element c?? ??ang KH??NG hi???n th??? tr??n trang Web hay kh??ng?'
"Verify popup displayed (existed in DOM and displayed on UI)"
WebUI.verifyElementVisible('Popup/bni/popup')
 
"Close popup"
WebUI.click(findTestObject('Popup/bni/btn_Close'))
 
"Wait for popup closed. If not wait, this test case will be failed"
WebUI.waitForElementNotVisible(findTestObject('Popup/bni/popup'), 3)
 
"Verify popup closed"
WebUI.verifyElementNotVisible(findTestObject('Popup/bni/popup'))


'---------------------- Handle Dynamic Test Object ----------------------'
'Katalon Studio - Web Testing - Handling Dynamic Objects: https://www.youtube.com/watch?v=H2KToYkjbnI, https://www.youtube.com/watch?v=7l8738hmrtc'


'---------------------- ToolTip ----------------------'
'1.Hover v??o button Action > 2.Get n???i dung c???a tooltip > 3.Verify tooltip hi???n th??? c?? ????ng kh??ng?'

'Mouse Over: Gi??? l???p h??nh ?????ng c???a user ????? di chuy???n con tr??? chu???t l??n ?????i t?????ng ???????c ch??? ?????nh'
'Mouse hover to button Action to display tooltip'
WebUI.mouseOver(findTestObject('1.Basic/Topic_08_Handle_User_Action/09.ToolTip/tooltip'))

'Get Text: Get n???i dung c???a Tooltip'
'Get Tooltip'
String tooltip = WebUI.getText(findTestObject('1.Basic/Topic_08_Handle_User_Action/09.ToolTip/lbl_ToolTip'))

'Verify Equal: Verify tooltip hi???n th??? ????ng hay kh??ng?'
'Verify tooltip displayed correctly'
WebUI.verifyEqual(tooltip, "Info about the action")

'---------------------- Alert ----------------------'

'Wait For Alert: Keyword n??y d??ng ????? ch??? v??i gi??y ????? cho alert hi???n th??? tr??n UI'
'Wait for an alert to present in 5 seconds'
WebUI.waitForAlert(5)

'Verify Alert Present: Ki???m tra xem alert c?? ??ang hi???n th??? tr??n UI hay kh??ng?'
'Verify Alert Present'
WebUI.verifyAlertPresent(2)

'Get Alert Text: Get text ??ang hi???n th??? trong alert, ???????c s??? d???ng cho basic alert, confirmation alert, prompt alert'
'Get Alert Text to verify'
String alertText = WebUI.getAlertText()

'Accept Alert: Gi??? l???p h??nh ?????ng c???a user ????? click v??o button ???OK??? trong Alert, ???????c s??? d???ng cho basic alert, confirmation alert, prompt alert'
'Accept Alert'
WebUI.acceptAlert()

'Verify Alert Not Present: Ki???m tra xem alert c?? ??ang KH??NG hi???n th??? tr??n UI hay kh??ng?'
'Verify Alert closed'
WebUI.verifyAlertNotPresent(2)

'Dismiss Alert: Gi??? l???p h??nh ?????ng c???a user ????? click v??o button ???Cancel??? trong Alert, ???????c s??? d???ng cho confirmation alert, prompt alert'
'Click Cancel'
WebUI.dismissAlert()

'Set Alert Text: Gi??? l???p h??nh ?????ng c???a user ????? input text v??o textbox trong Alert, ???????c s??? d???ng cho Prompt Alert'
'Input text to Alert'
WebUI.setAlertText("This is Alert text.")

'Authenticate: Keyword n??y d??ng ????? input username and password v??o Basic Authen, L??u ??: ch??? support cho Windows.'
'Navigate to site: http://the-internet.herokuapp.com/basic_auth'
WebUI.authenticate("http://the-internet.herokuapp.com/basic_auth", username, password, 5)


'---------------------- Upload File ----------------------'
'Upload File: Keyword n??y ch??? l??m vi???c ???????c khi th??? html l?? input v?? type = ???file???'

'Open browser'
WebUI.openBrowser('')

'Navigate to site: https://mdbootstrap.com/docs/standard/forms/file/'
WebUI.navigateToUrl('https://mdbootstrap.com/docs/standard/forms/file/')

'Maximize browser'
WebUI.maximizeWindow()

'Upload file'
WebUI.uploadFile(findTestObject('UploadFile/uploadFile'), 'D:\\Katalon Project\\KatalonStudioA1\\Data Files\\test.txt')

'Get Attribute'
FilePath = WebUI.getAttribute(findTestObject('UploadFile/uploadFile'), 'value')

'Verify Match FilePath and actual File'
WebUI.verifyMatch(FilePath, 'C:\\fakepath\\test.txt', false)

'Close browser'
WebUI.closeBrowser()

'---------------------- Take screenshot ----------------------'
'Take Area Screenshot: Take screenshot ??? v??? tr?? t???a ????? ???????c ch??? ?????nh.'
'B???n mu???n take screenshot t???i x: 50, y: 25, width: 100, height: 150 v?? l??u th??nh file ???advertisements.png??? trong project c???a b???n:'
WebUI.takeAreaScreenshot(RunConfiguration.getReportFolder() + '/advertisements.png', new Rectangle(50, 25, 100, 150))

'B???n mu???n take screenshot t???i x: 50, y: 25, width: 100, height: 1200 nh??ng b???n mu???n ???n ??i 1 v??i ?????i t?????ng nh?? button, link, text ??? v?? l??u th??nh file ???advertisements.png??? trong project c???a b???n:'
WebUI.takeAreaScreenshot(RunConfiguration.getProjectDir() + '/advertisements_hide.png', new Rectangle(50, 25, 500, 1200), [findTestObject('1.Basic/Topic_07_WebBrowser_Command/link_Checkboxes')])

'Take Element Screenshot: Take screenshot ?????i t?????ng ???????c ch??? ?????nh.'
'Take a screenshot of a specific web element'
WebUI.takeElementScreenshot(RunConfiguration.getProjectDir() + '/checkboxes.png', findTestObject('1.Basic/Topic_07_WebBrowser_Command/link_Checkboxes'))

'Take Full Page Screenshot: Take screenshot to??n b??? trang web ??ang hi???n th???. N?? bao g???m vi???c scroll xu???ng cu???i page n???u chi???u cao c???a web hi???n t???i l???n h??n ???? ph??n gi???i c???a m??n h??nh.'
"Take entire-page screenshot included scroll"
WebUI.takeFullPageScreenshot(RunConfiguration.getProjectDir() + '/full_view_no_elements.png')

"Take entire-page screenshot but exclude element link_Checkboxes"
WebUI.takeFullPageScreenshot(RunConfiguration.getProjectDir() + '/full_view_no_elements_hide.png', [findTestObject('1.Basic/Topic_07_WebBrowser_Command/link_Checkboxes')])

'Take Screenshot: Take screenshot trang web ??ang hi???n th???'
'Take screenshot of current screen'
WebUI.takeScreenshot(RunConfiguration.getProjectDir() + '/Demo.png')

'---------------------- Web Element Command ----------------------'
'Get Attribute: Get gi?? tr??? c???a thu???c t??nh (attribute) c???a web element'
"Get attibute of element"
String attValue = WebUI.getAttribute(findTestObject('1.Basic/Topic_09_Web_Element_Command/checkbox'), "value")
println "Value = " + attValue

'Get CSS Value: Get gi?? tr??? CSS c???a web element.'
"Get margin right"
String cssmarginright = WebUI.getCSSValue(findTestObject('1.Basic/Topic_09_Web_Element_Command/checkbox'), "margin-right")
println "margin-right = " + cssmarginright

'Get Text: Get Text c???a web element'
"Get text of element"
String text = WebUI.getText(findTestObject('1.Basic/Topic_09_Web_Element_Command/button'))
println "text: " + text

'Verify Element Text: Verify Element Text c?? hi???n th??? tr??n page UI hay kh??ng?'
"Verify element has text"
WebUI.verifyElementText(findTestObject('1.Basic/Topic_09_Web_Element_Command/button'), "Submit")

'Verify Text Present: Verify ??o???n text c?? hi???n th??? tr??n UI hay kh??ng?'
'L??u ??: C??c b???n h???n ch??? s??? d???ng keyword n??y nh??. L?? do l?? Keyword n??y s??? verify Text c?? hi???n th??? tr??n page UI hay kh??ng?'
'Nh??ng n???u ??o???n Text b???n verify n?? hi???n th??? ??? nhi???u n??i tr??n c??ng 1 page, th?? m??nh s??? kh??ng bi???t ???????c l?? keyword n??y s??? verify ??o???n Text n??o. D???n ?????n vi???c m???c d?? k???t qu??? tr??? v??? l?? True, nh??ng m??nh ko make sure ???????c l?? ??o???n Text m??nh mu???n verify c?? hi???n th??? kh??ng nh??.'
"Verify text present in UI"
WebUI.verifyTextPresent("Patient Medical History", false)

'Verify Text Not Present: Verify Text c?? ??ang kh??ng hi???n th??? tr??n UI hay kh??ng?'
"Verify text not present in UI"
WebUI.verifyTextNotPresent("Patient Medical History1", false)

'Verify Element Attribute Value: Verify Web Element c?? t???n t???i gi?? tr??? c???a thu???c t??nh trong DOM hay kh??ng?'
"Verify checkbox element has attribute value: Anemia"
WebUI.verifyElementAttributeValue(findTestObject('1.Basic/Topic_09_Web_Element_Command/checkbox'), "value", "Anemia", 2)

'Verify Element Checked: Verify checkbox c?? ??ang ???????c check hay kh??ng?'
"Verify checkbox element is checked"
WebUI.verifyElementChecked(findTestObject('1.Basic/Topic_09_Web_Element_Command/checkbox'), 2)

'Verify Element Not Checked: Verify checkbox c?? ??ang KH??NG ???????c check hay kh??ng?'
"Verify checkbox element is unchecked"
WebUI.verifyElementNotChecked(findTestObject('1.Basic/Topic_09_Web_Element_Command/checkbox'), 2)

'Verify Element Clickable: Verify Element c?? th??? Click ???????c hay kh??ng? Th??ng th?????ng keyword n??y s??? d??ng ????? verify tr???ng th??i c???a button. Clickable c?? ngh??a l?? button ??ang enable, m?? button ??ang enable th?? user m???i c?? th??? click ???????c, ????ng kh??ng ????'
"Verify button element is clickable"
WebUI.verifyElementClickable(findTestObject('1.Basic/Topic_09_Web_Element_Command/button'))

'Verify Element Not Clickable: Verify Element c?? th??? KH??NG click ???????c hay kh??ng? Keyword n??y ch??? ???????c s??? d???ng v???i Element c?? tag = input v???i attribute = disable'
"For button is disabled, verify button element is no clickable"
WebUI.verifyElementNotClickable(findTestObject('1.Basic/Topic_09_Web_Element_Command/button'))

'Verify Element Has Attribute: Verify thu???c t??nh c???a Web Element c?? t???n t???i hay kh??ng?'
"Verify button element has attribute: data-component"
WebUI.verifyElementHasAttribute(findTestObject('1.Basic/Topic_09_Web_Element_Command/button'), "data-component", 2)

'Verify Element Not Has Attribute: Verify thu???c t??nh c???a Web Element c?? KH??NG t???n t???i hay kh??ng?'
"Verify button element not has attribute: test"
WebUI.verifyElementNotHasAttribute(findTestObject('1.Basic/Topic_09_Web_Element_Command/button'), "test", 2)

'Verify Element Not Present: Verify Web Element c?? KH??NG t???n t???i trong DOM hay kh??ng?'
"Verify element not present in DOM"
WebUI.verifyElementNotPresent(findTestObject('1.Basic/Topic_09_Web_Element_Command/notPresent'), 2)

'Verify Element Present: Verify Web Element c?? t???n t???i trong DOM hay kh??ng?'
"Verify element present in DOM"
WebUI.verifyElementPresent(findTestObject('1.Basic/Topic_09_Web_Element_Command/helloworld'), 2)

'Verify Element Visible: Verify Web Element c?? hi???n th??? tr??n page UI hay kh??ng?'
"Verify element visible: present in DOM and display on UI"
WebUI.verifyElementVisible(findTestObject('1.Basic/Topic_09_Web_Element_Command/button_Start'))

'Verify Element Not Visible: Verify Web Element c?? ??ang KH??NG hi???n th??? tr??n page UI hay kh??ng?'
"Verify element not visible: present in DOM but not display on UI"
WebUI.verifyElementNotVisible(findTestObject('1.Basic/Topic_09_Web_Element_Command/helloworld'))


'---------------------- Scroll ----------------------'
'Scroll To Element: Keywork n??y d??ng ????? scroll to element ???????c ch??? ?????nh:'
'Scroll to \'Book Appointment\' button'
WebUI.scrollToElement(findTestObject('Page_CuraHomepage/btn_MakeAppointment'), 3)

'Using javascript to scroll'

'Scroll to Element'
"Get Test Object"
TestObject testObject = findTestObject('Object Repository/Buoi9/Default_DropDown/ddl_MultiSelect')

"Convert testobject to element"
WebElement element = WebUiCommonHelper.findWebElement(testObject, 30)

"Scroll to element"
WebUI.executeJavaScript("arguments[0].scrollIntoView(true);", Arrays.asList(element))


'Scroll to Element ????? cho element ???? n???m ??? ch??nh gi???a m??n h??nh'
"Get Test Object"
TestObject testObject = findTestObject('Object Repository/Buoi9/Default_DropDown/ddl_MultiSelect')

"Convert testobject to element"
WebElement element = WebUiCommonHelper.findWebElement(testObject, 30)

"Scroll to element to middle page"
WebUI.executeJavaScript("arguments[0].scrollIntoView({block: 'center'});", Arrays.asList(element))


'Scroll to bottom of page'
"Get Test Object"
TestObject testObject = findTestObject('Object Repository/Buoi9/Default_DropDown/ddl_MultiSelect')

"Convert testobject to element"
WebElement element = WebUiCommonHelper.findWebElement(testObject, 30)

"Scroll to bottom of page"
WebUI.executeJavaScript("window.scrollBy(0,document.body.scrollHeight)", null)


'Scroll to top of page'
"Get Test Object"
TestObject testObject = findTestObject('Object Repository/Buoi9/Default_DropDown/ddl_MultiSelect')

"Convert testobject to element"
WebElement element = WebUiCommonHelper.findWebElement(testObject, 30)

"Scroll to top of page"
WebUI.executeJavaScript("window.scrollBy(0, -document.body.scrollHeight)", null)



*/

}
