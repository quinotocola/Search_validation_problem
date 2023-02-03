package testSuite.Microsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MicrosoftTest extends TestBase {
    @Test
    public void verifyTest() {
        System.out.println("press button Windows");
        mainPage.btwindows.click();
        Assertions.assertTrue(windowsPage.btsearch.isControlDisplayed(),"ERROR! Button Search is not displayed");

        System.out.println("press button search");
        windowsPage.btsearch.click();
        System.out.println("write xbox in textbox");
        windowsPage.buscar.setText(search);
        System.out.println("press button search again");
        windowsPage.btsearch.click();
        Assertions.assertTrue(xboxPage.btcomprar.isControlDisplayed(),"ERROR! Button Comprar is not displayed");

        System.out.println("press button Comprar");
        xboxPage.btcomprar.click();
        Assertions.assertTrue(xboxComprarPage.btaplicaciones.isControlDisplayed(),"ERROR! Button Aplicaciones is not displayed");

        System.out.println("press button Aplicaciones");
        xboxComprarPage.btaplicaciones.click();
        Assertions.assertTrue(aplicacionesPage.btnext.isControlDisplayed(),"ERROR! Button Siguiente is not displayed");

        System.out.println("get the number of elements");
        aplicacionesPage.getElements();
        System.out.println("get the name of the elements");
        aplicacionesPage.getName();
        System.out.println("press button siguiente");
        aplicacionesPage.btnext.click();
        Assertions.assertTrue(aplicacionesPage.btnext.isControlDisplayed(),"ERROR! Button Siguiente is not displayed");

        System.out.println("continuing with the number of elements");
        aplicacionesPage.getElements();
        System.out.println("continuing with the name of the elements");
        aplicacionesPage.getName();
        System.out.println("press button siguiente");
        aplicacionesPage.btnext.click();
        Assertions.assertTrue(aplicacionesPage.btnext.isControlDisplayed(),"ERROR! Button Siguiente is not displayed");

        System.out.println("continuing with the number of elements");
        aplicacionesPage.getElements();
        System.out.println("continuing with the name of the elements");
        aplicacionesPage.getName();
        System.out.println("go to the first page of Aplicaciones");
        aplicacionesPage.firstpg.click();
        Assertions.assertTrue(aplicacionesPage.btnext.isControlDisplayed(),"ERROR! Button Siguiente is not displayed");

        System.out.println("take element price");
        aplicacionesPage.getNonFree();
        System.out.println("enter element with price");
        aplicacionesPage.noGratis.click();
        System.out.println("compare the price of this page with the previous page");
        comprasPage.getPrice();



    }


}
