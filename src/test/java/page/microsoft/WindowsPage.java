package page.microsoft;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class WindowsPage {
    public Button btsearch = new Button(By.id("search"));
    public TextBox buscar = new TextBox(By.id("cli_shellHeaderSearchInput"));

}
