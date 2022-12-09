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

WebUI.navigateToUrl(GlobalVariable.urlSariTest)

WebUI.verifyElementPresent(findTestObject('Page_Sistema Administracin de Renta de Inmuebles/input_Usuario_nom_usuario'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Sistema Administracin de Renta de Inmuebles/input_Usuario_nom_usuario'), 
    usuario)

WebUI.verifyElementPresent(findTestObject('Page_Sistema Administracin de Renta de Inmuebles/input_Contrasea_des_password'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Sistema Administracin de Renta de Inmuebles/input_Contrasea_des_password'), 
    contrasena)

WebUI.verifyElementClickable(findTestObject('Page_Sistema Administracin de Renta de Inmuebles/input_Contrasea_btn_login'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Sistema Administracin de Renta de Inmuebles/input_Contrasea_btn_login'))

WebUI.verifyTextNotPresent('Error al iniciar sesión!', false)

