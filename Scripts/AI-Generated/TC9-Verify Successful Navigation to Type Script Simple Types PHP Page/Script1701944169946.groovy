import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page typescript typescript simple types php'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/typescript/typescript_simple_types.php')

'step 2: Add visual checkpoint at Page typescript typescript simple types php'

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Verify Successful Navigation to Type Script Simple Types PHP Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
