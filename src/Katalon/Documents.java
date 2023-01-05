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


'--------- Dropdown Custom---------'
'Single select: 1. Click vào dropdown control đó, 2. Select item trong trong dropdown'
'Fist, click on dropdown control'
WebUI.click(findTestObject('Custom_DropDown/Single_DropDown/Single_Dropdown_Parent'))
 
// Because these item in dropdown is hidden. If we don't click on dropdown first, we can not select item under it
'Second, select item on dropdown'
WebUI.click(findTestObject('Custom_DropDown/Single_DropDown/Single_Dropdown_Child_Option1'))

'Multi select: 1. Click vào dropdown control đó, 2. Select tất cả các items trong dropdown, Or select random item trong dropdown, Or select item theo 1 danh sách bạn muốn chọn'
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
'Wait For Element Visible: Chờ vài giây để element hiển thị trên trang Web'
"Wait for popup to be visible in 10s"
WebUI.waitForElementVisible(findTestObject('Popup/testproject/popup'), 10)

'Wait For Element Not Visible: Chờ vài giây để element không còn hiển thị trên trang Web sau khi thực hiện 1 action nào đó'
"Wait for popup display"
Boolean isDisplayed = WebUI.waitForElementVisible(findTestObject('Popup/shopee/popup'), 10)

"Check if popup displayed -> Close popup"
if(isDisplayed){
WebUI.click(findTestObject('Popup/shopee/btn_Close'))
}

"Wait for popup NOT visible"
WebUI.waitForElementNotVisible(findTestObject('Popup/shopee/popup'), 10)

'Verify Element Visible: Kiểm tra xem element có đang hiển thị trên trang Web hay không?'
"Wait for Popup displayed"
WebUI.waitForElementVisible(findTestObject('Popup/zingpoll/popup_login'), 2)

"Verify popup displayed (existed in DOM and displayed on UI)"
WebUI.verifyElementVisible(findTestObject('Popup/zingpoll/popup_login'))

'erify Element Not Visible: Kiểm tra xem element có đang KHÔNG hiển thị trên trang Web hay không?'
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
'1.Hover vào button Action > 2.Get nội dung của tooltip > 3.Verify tooltip hiển thị có đúng không?'

'Mouse Over: Giả lập hành động của user để di chuyển con trỏ chuột lên đối tượng được chỉ định'
'Mouse hover to button Action to display tooltip'
WebUI.mouseOver(findTestObject('1.Basic/Topic_08_Handle_User_Action/09.ToolTip/tooltip'))

'Get Text: Get nội dung của Tooltip'
'Get Tooltip'
String tooltip = WebUI.getText(findTestObject('1.Basic/Topic_08_Handle_User_Action/09.ToolTip/lbl_ToolTip'))

'Verify Equal: Verify tooltip hiển thị đúng hay không?'
'Verify tooltip displayed correctly'
WebUI.verifyEqual(tooltip, "Info about the action")

'---------------------- Alert ----------------------'

'Wait For Alert: Keyword này dùng để chờ vài giây để cho alert hiển thị trên UI'
'Wait for an alert to present in 5 seconds'
WebUI.waitForAlert(5)

'Verify Alert Present: Kiểm tra xem alert có đang hiển thị trên UI hay không?'
'Verify Alert Present'
WebUI.verifyAlertPresent(2)

'Get Alert Text: Get text đang hiển thị trong alert, Được sử dụng cho basic alert, confirmation alert, prompt alert'
'Get Alert Text to verify'
String alertText = WebUI.getAlertText()

'Accept Alert: Giả lập hành động của user để click vào button “OK” trong Alert, Được sử dụng cho basic alert, confirmation alert, prompt alert'
'Accept Alert'
WebUI.acceptAlert()

'Verify Alert Not Present: Kiểm tra xem alert có đang KHÔNG hiển thị trên UI hay không?'
'Verify Alert closed'
WebUI.verifyAlertNotPresent(2)

'Dismiss Alert: Giả lập hành động của user để click vào button “Cancel” trong Alert, Được sử dụng cho confirmation alert, prompt alert'
'Click Cancel'
WebUI.dismissAlert()

'Set Alert Text: Giả lập hành động của user để input text vào textbox trong Alert, Được sử dụng cho Prompt Alert'
'Input text to Alert'
WebUI.setAlertText("This is Alert text.")

'Authenticate: Keyword này dùng để input username and password vào Basic Authen, Lưu ý: chỉ support cho Windows.'
'Navigate to site: http://the-internet.herokuapp.com/basic_auth'
WebUI.authenticate("http://the-internet.herokuapp.com/basic_auth", username, password, 5)


'---------------------- Upload File ----------------------'
'Upload File: Keyword này chỉ làm việc được khi thẻ html là input và type = “file”'

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
'Take Area Screenshot: Take screenshot ở vị trí tọa độ được chỉ định.'
'Bạn muốn take screenshot tại x: 50, y: 25, width: 100, height: 150 và lưu thành file ‘advertisements.png’ trong project của bạn:'
WebUI.takeAreaScreenshot(RunConfiguration.getReportFolder() + '/advertisements.png', new Rectangle(50, 25, 100, 150))

'Bạn muốn take screenshot tại x: 50, y: 25, width: 100, height: 1200 nhưng bạn muốn ẩn đi 1 vài đối tượng như button, link, text … và lưu thành file ‘advertisements.png’ trong project của bạn:'
WebUI.takeAreaScreenshot(RunConfiguration.getProjectDir() + '/advertisements_hide.png', new Rectangle(50, 25, 500, 1200), [findTestObject('1.Basic/Topic_07_WebBrowser_Command/link_Checkboxes')])

'Take Element Screenshot: Take screenshot đối tượng được chỉ định.'
'Take a screenshot of a specific web element'
WebUI.takeElementScreenshot(RunConfiguration.getProjectDir() + '/checkboxes.png', findTestObject('1.Basic/Topic_07_WebBrowser_Command/link_Checkboxes'))

'Take Full Page Screenshot: Take screenshot toàn bộ trang web đang hiển thị. Nó bao gồm việc scroll xuống cuối page nếu chiều cao của web hiện tại lớn hơn đô phân giải của màn hình.'
"Take entire-page screenshot included scroll"
WebUI.takeFullPageScreenshot(RunConfiguration.getProjectDir() + '/full_view_no_elements.png')

"Take entire-page screenshot but exclude element link_Checkboxes"
WebUI.takeFullPageScreenshot(RunConfiguration.getProjectDir() + '/full_view_no_elements_hide.png', [findTestObject('1.Basic/Topic_07_WebBrowser_Command/link_Checkboxes')])

'Take Screenshot: Take screenshot trang web đang hiển thị'
'Take screenshot of current screen'
WebUI.takeScreenshot(RunConfiguration.getProjectDir() + '/Demo.png')

'---------------------- Web Element Command ----------------------'
'Get Attribute: Get giá trị của thuộc tính (attribute) của web element'
"Get attibute of element"
String attValue = WebUI.getAttribute(findTestObject('1.Basic/Topic_09_Web_Element_Command/checkbox'), "value")
println "Value = " + attValue

'Get CSS Value: Get giá trị CSS của web element.'
"Get margin right"
String cssmarginright = WebUI.getCSSValue(findTestObject('1.Basic/Topic_09_Web_Element_Command/checkbox'), "margin-right")
println "margin-right = " + cssmarginright

'Get Text: Get Text của web element'
"Get text of element"
String text = WebUI.getText(findTestObject('1.Basic/Topic_09_Web_Element_Command/button'))
println "text: " + text

'Verify Element Text: Verify Element Text có hiển thị trên page UI hay không?'
"Verify element has text"
WebUI.verifyElementText(findTestObject('1.Basic/Topic_09_Web_Element_Command/button'), "Submit")

'Verify Text Present: Verify đoạn text có hiển thị trên UI hay không?'
'Lưu ý: Các bạn hạn chế sử dụng keyword này nhé. Lý do là Keyword này sẽ verify Text có hiển thị trên page UI hay không?'
'Nhưng nếu đoạn Text bạn verify nó hiển thị ở nhiều nơi trên cùng 1 page, thì mình sẽ không biết được là keyword này sẽ verify đoạn Text nào. Dẫn đến việc mặc dù kết quả trả về là True, nhưng mình ko make sure được là đoạn Text mình muốn verify có hiển thị không nhé.'
"Verify text present in UI"
WebUI.verifyTextPresent("Patient Medical History", false)

'Verify Text Not Present: Verify Text có đang không hiển thị trên UI hay không?'
"Verify text not present in UI"
WebUI.verifyTextNotPresent("Patient Medical History1", false)

'Verify Element Attribute Value: Verify Web Element có tồn tại giá trị của thuộc tính trong DOM hay không?'
"Verify checkbox element has attribute value: Anemia"
WebUI.verifyElementAttributeValue(findTestObject('1.Basic/Topic_09_Web_Element_Command/checkbox'), "value", "Anemia", 2)

'Verify Element Checked: Verify checkbox có đang được check hay không?'
"Verify checkbox element is checked"
WebUI.verifyElementChecked(findTestObject('1.Basic/Topic_09_Web_Element_Command/checkbox'), 2)

'Verify Element Not Checked: Verify checkbox có đang KHÔNG được check hay không?'
"Verify checkbox element is unchecked"
WebUI.verifyElementNotChecked(findTestObject('1.Basic/Topic_09_Web_Element_Command/checkbox'), 2)

'Verify Element Clickable: Verify Element có thể Click được hay không? Thông thường keyword này sẽ dùng để verify trạng thái của button. Clickable có nghĩa là button đang enable, mà button đang enable thì user mới có thể click được, đúng không 😀'
"Verify button element is clickable"
WebUI.verifyElementClickable(findTestObject('1.Basic/Topic_09_Web_Element_Command/button'))

'Verify Element Not Clickable: Verify Element có thể KHÔNG click được hay không? Keyword này chỉ được sử dụng với Element có tag = input với attribute = disable'
"For button is disabled, verify button element is no clickable"
WebUI.verifyElementNotClickable(findTestObject('1.Basic/Topic_09_Web_Element_Command/button'))

'Verify Element Has Attribute: Verify thuộc tính của Web Element có tồn tại hay không?'
"Verify button element has attribute: data-component"
WebUI.verifyElementHasAttribute(findTestObject('1.Basic/Topic_09_Web_Element_Command/button'), "data-component", 2)

'Verify Element Not Has Attribute: Verify thuộc tính của Web Element có KHÔNG tồn tại hay không?'
"Verify button element not has attribute: test"
WebUI.verifyElementNotHasAttribute(findTestObject('1.Basic/Topic_09_Web_Element_Command/button'), "test", 2)

'Verify Element Not Present: Verify Web Element có KHÔNG tồn tại trong DOM hay không?'
"Verify element not present in DOM"
WebUI.verifyElementNotPresent(findTestObject('1.Basic/Topic_09_Web_Element_Command/notPresent'), 2)

'Verify Element Present: Verify Web Element có tồn tại trong DOM hay không?'
"Verify element present in DOM"
WebUI.verifyElementPresent(findTestObject('1.Basic/Topic_09_Web_Element_Command/helloworld'), 2)

'Verify Element Visible: Verify Web Element có hiển thị trên page UI hay không?'
"Verify element visible: present in DOM and display on UI"
WebUI.verifyElementVisible(findTestObject('1.Basic/Topic_09_Web_Element_Command/button_Start'))

'Verify Element Not Visible: Verify Web Element có đang KHÔNG hiển thị trên page UI hay không?'
"Verify element not visible: present in DOM but not display on UI"
WebUI.verifyElementNotVisible(findTestObject('1.Basic/Topic_09_Web_Element_Command/helloworld'))


*/

}
