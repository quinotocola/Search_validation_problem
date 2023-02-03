package page.microsoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

import static page.microsoft.AplicacionesPage.st;

public class ComprasPage {
    public void getPrice(){
        WebElement e1 = Session.getInstance().getBrowser().findElement(By.xpath("(//span[contains(text(),'MXN$')])[1]"));
        String s = e1.getText();
        if (s.equals(st)) {
            System.out.println("el precio es el mismo y es de " + e1.getText());
        }
    }
}
