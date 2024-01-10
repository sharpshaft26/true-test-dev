import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: At Page home, click on hyperlink object --> navigate to Page react/default.asp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_object'))

'Step 2: At Page react/default.asp, click on hyperlink object --> navigate to Page react/react intro.asp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_react_default_asp/hyperlink_object'))

'Step 3: At Page react/react intro.asp, click on hyperlink object --> navigate to Page react/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_react_react_intro_asp/hyperlink_object'))

'Step 4: At Page react/*, click on hyperlink object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_react/hyperlink_object'))

'Step 5: At Page react/*, click on hyperlink object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_react/hyperlink_object_1'))

'Step 6: At Page react/*, click on hyperlink object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_react/hyperlink_object_2'))

'Step 7: At Page react/*, click on hyperlink object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_react/hyperlink_object_3'))

'Step 8: At Page react/*, click on hyperlink object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_react/hyperlink_object_4'))

'Step 9: At Page react/*, click on hyperlink object --> navigate to Page react/react render.asp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_react/hyperlink_object_5'))

'Step 10: At Page react/react render.asp, click on hyperlink object --> navigate to Page react/react customhooks.asp'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_react_react_render_asp/hyperlink_object'))

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
