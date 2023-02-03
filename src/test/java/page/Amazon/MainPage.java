package page.Amazon;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class MainPage {
    public Button btbuscar = new Button(By.id("twotabsearchtextbox"));
    public TextBox buscar = new TextBox(By.id("twotabsearchtextbox"));
    public Button btbuscar1 = new Button(By.id("nav-search-submit-button"));


}
