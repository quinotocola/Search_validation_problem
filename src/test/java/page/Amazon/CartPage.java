package page.Amazon;

import control.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.microsoft.AplicacionesPage;
import session.Session;

public class CartPage {
    public Button delete = new Button(By.xpath("(//input[@class='a-color-link'])[1]"));

    public void getcheckprod(){
        WebElement e1 = Session.getInstance().getBrowser().findElement(By.xpath("(//span[@class='a-truncate-full a-offscreen'])[1]"));
        e1.getText().toString();
        if (e1.equals(CompraPage.checkCompra())) {
            System.out.println("Tu producto se encuentra en la lista");
        }
    }

    public void checkdelete(){
        WebElement ck = Session.getInstance().getBrowser().findElement(By.xpath("//span[contains(text(),'Subtotal (0')]"));

    }
}
