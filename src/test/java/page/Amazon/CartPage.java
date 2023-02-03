package page.Amazon;

import control.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.microsoft.AplicacionesPage;
import session.Session;

import java.util.List;

import static page.Amazon.CompraPage.str;

public class CartPage {
    public Button delete = new Button(By.xpath("(//input[@class='a-color-link'])[1]"));
    String s ="";
    public void getcheckprod(){
        WebElement e1 = Session.getInstance().getBrowser().findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]"));
        s = e1.getText();
        if (s.equals(str)){System.out.println("Tu producto se encuentra en la lista");}
            //

    }

    public void checkdelete(){
        List<WebElement> ck = Session.getInstance().getBrowser().findElements(By.xpath("//span[contains(text(),'Subtotal (0')]"));

        if (ck.size() > 0){
            System.out.println("se elimino el elemento de la tabla");
        }
        //WebElement ck = Session.getInstance().getBrowser().findElement(By.xpath("//span[contains(text(),'Subtotal (0')]"));

    }
}
