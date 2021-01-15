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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')


WebUI.navigateToUrl(GlobalVariable.urlMaczfit)

WebUI.click(findTestObject('Object Repository/Page_Catering dietetyczny Warszawa  Dieta p_82e827/div_Zielonki_modal__close icon font-icon fo_a87912'))

WebUI.click(findTestObject('Object Repository/Page_Catering dietetyczny Warszawa  Dieta p_82e827/span_zaloguj'))

WebUI.click(findTestObject('Object Repository/Page_Maczfit - Logowanie i Rejestracja/div_Zielonki_modal__close icon font-icon fo_a87912'))

WebUI.click(findTestObject('Object Repository/Page_Maczfit - Logowanie i Rejestracja/a_Zarejestruj si'))

for (def row = 1; row <= findTestData('Maczfit/Maczfit_dane').getRowNumbers(); row++) {

    WebUI.setText(findTestObject('Object Repository/Page_Maczfit - Logowanie i Rejestracja/input_e-mail_email'), findTestData(
            'Maczfit/Maczfit_dane').geValue('email', row))

    WebUI.setEncryptedText(findTestObject('Object Repository/Page_Maczfit - Logowanie i Rejestracja/input_haso_password'), 
        findTestData('Maczfit/Maczfit_dane').geValue('haslo', row))

    WebUI.setEncryptedText(findTestObject('Object Repository/Page_Maczfit - Logowanie i Rejestracja/input_powtrz haso_password_confirmation'), 
        findTestData('Maczfit/Maczfit_dane').geValue('powhaslo', row))

    WebUI.setText(findTestObject('Object Repository/Page_Maczfit - Logowanie i Rejestracja/input_Imi i nazwisko_name_surname'), 
        findTestData('Maczfit/Maczfit_dane').geValue('imienazwisko', row))

    WebUI.setText(findTestObject('Object Repository/Page_Maczfit - Logowanie i Rejestracja/input_Nr telefonu_phone'), findTestData(
            'Maczfit/Maczfit_dane').geValue('nrtelefonu', row))
}

WebUI.click(findTestObject('Object Repository/Page_Maczfit - Logowanie i Rejestracja/span_zarejestruj'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Maczfit - Logowanie i Rejestracja/div_Wprowad poprawny e-mail'), 
    'Wprowadź poprawny e-mail')

WebUI.click(findTestObject('Object Repository/Page_Maczfit - Logowanie i Rejestracja/button_Nie, dzikuj'))

WebUI.closeBrowser()