package page.Amazon;

import control.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

public class CompraPage {
    public Button addToCart = new Button(By.id("add-to-cart-button"));


    public static Object checkCompra(){
        WebElement e = Session.getInstance().getBrowser().findElement(By.id("productTitle"));

        String nom = e.getText().toString();
        //System.out.println(nom);
        return nom;
    }
}
