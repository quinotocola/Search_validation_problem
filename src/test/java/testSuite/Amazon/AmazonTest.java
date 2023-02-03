package testSuite.Amazon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AmazonTest extends TestBase{
    @Test
    public void verifyTest() {

        System.out.println("press button search");
        mainPageA.btbuscar.click();
        //Assertions.assertTrue();
        System.out.println("introduce text xbox");
        mainPageA.buscar.setText(search);
        System.out.println("press button search");
        mainPageA.btbuscar1.click();
        Assertions.assertTrue(dealsPage.comprar.isControlDisplayed(),"ERROR! the elements list is not displayed");

        System.out.println("press in first element");
        dealsPage.comprar.click();
        Assertions.assertTrue(compraPage.addToCart.isControlDisplayed(),"ERROR! the element page is not displayed");

        System.out.println("save de name of the element to buy");
        compraPage.checkCompra();
        System.out.println("press button to add to cart");
        compraPage.addToCart.click();
        Assertions.assertTrue(checkPage.goToCart.isControlDisplayed(),"ERROR! the element wasn't added to cart");

        System.out.println("press button to go to cart");
        checkPage.goToCart.click();
        Assertions.assertTrue(cartPage.delete.isControlDisplayed(),"ERROR the element isn't in the cart");

        System.out.println("check if the elements is the same in the cart");
        cartPage.getcheckprod();
        System.out.println("delete the element from the cart");
        cartPage.delete.click();
        System.out.println("check if the element was deleted");
        cartPage.checkdelete();
        Assertions.assertFalse(cartPage.delete.isControlDisplayed(),"ERROR! the element wasn't deleted");
    }
}
