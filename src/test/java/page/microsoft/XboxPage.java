package page.microsoft;

import control.Button;
import org.openqa.selenium.By;

public class XboxPage {
    public Button btcomprar = new Button(By.xpath("(//a[contains(text(),'Comprar')])[2]"));
}
