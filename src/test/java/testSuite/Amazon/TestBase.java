package testSuite.Amazon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.Amazon.*;
import page.microsoft.ComprasPage;
import session.Session;
import util.GetProperties;

public class TestBase {
    MainPage mainPageA = new MainPage();
    DealsPage dealsPage = new DealsPage();
    CompraPage compraPage = new CompraPage();
    CheckPage checkPage = new CheckPage();
    CartPage cartPage = new CartPage();

    String search = GetProperties.getInstance().getSearch();

    @BeforeEach
    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost2());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}
