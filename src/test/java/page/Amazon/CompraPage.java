package page.Amazon;

import control.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

public class CompraPage {
    public Button addToCart = new Button(By.id("add-to-cart-button"));


    static String str ="";
    public void checkCompra(){
        WebElement e = Session.getInstance().getBrowser().findElement(By.id("productTitle"));

        str = e.getText().toString();
        //System.out.println(str);

    }
}
