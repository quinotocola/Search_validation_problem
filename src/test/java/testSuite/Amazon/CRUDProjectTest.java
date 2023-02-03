package testSuite.Amazon;

import org.junit.jupiter.api.Test;

public class CRUDProjectTest extends TestBase{
    @Test
    public void verifyTest() throws InterruptedException{

        mainPageA.btbuscar.click();
        mainPageA.buscar.setText(search);
        mainPageA.btbuscar1.click();
        dealsPage.comprar.click();
        compraPage.checkCompra();
        compraPage.addToCart.click();
        checkPage.goToCart.click();
       // cartPage.getcheckprod();
        cartPage.delete.click();
        Thread.sleep(3000);
    }
}
