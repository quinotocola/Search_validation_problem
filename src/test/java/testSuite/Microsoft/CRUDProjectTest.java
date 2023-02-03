package testSuite.Microsoft;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import session.Session;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class CRUDProjectTest extends TestBase {
    @Test
    public void verifyTest() throws InterruptedException {
        mainPage.btwindows.click();
        windowsPage.btsearch.click();
        windowsPage.buscar.setText(search);
        windowsPage.btsearch.click();
        xboxPage.btcomprar.click();
        xboxComprarPage.btaplicaciones.click();
        aplicacionesPage.getElements();
        aplicacionesPage.getName();
        aplicacionesPage.btnext.click();
        aplicacionesPage.getElements();
        aplicacionesPage.getName();
        aplicacionesPage.btnext.click();
        aplicacionesPage.getElements();
        aplicacionesPage.getName();
        aplicacionesPage.firstpg.click();
        aplicacionesPage.getNonFree();
        aplicacionesPage.noGratis.click();
        comprasPage.getPrice();


    }


}
