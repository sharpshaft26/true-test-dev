import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page nodejs default asp'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/nodejs/default.asp')

'step 2: Add visual checkpoint at Page nodejs default asp'

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Successful Navigation to Node js Default ASP Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
