package testSuite.Microsoft;

import browser.Chrome;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.microsoft.*;
import session.Session;
import util.GetProperties;

public class TestBase {
    MainPage mainPage = new MainPage();
    WindowsPage windowsPage = new WindowsPage();
    XboxPage xboxPage = new XboxPage();
    XboxComprarPage xboxComprarPage = new XboxComprarPage();
    AplicacionesPage aplicacionesPage = new AplicacionesPage();
    ComprasPage comprasPage = new ComprasPage();

    String search = GetProperties.getInstance().getSearch();

    @BeforeEach
    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }


}
