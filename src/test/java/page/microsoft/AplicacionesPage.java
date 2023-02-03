package page.microsoft;

import control.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

import java.util.List;


public class AplicacionesPage {
    public Button btnext = new Button(By.xpath("//span[contains(text(),'Siguiente')]"));
    public Button firstpg = new Button(By.xpath("(//a[@class='page-link']/*)[2]"));
    public Button noGratis = new Button(By.xpath("(//span[contains(text(),'MXN$')])[1]"));
    int cont = 0;
    String str ="";
    public void getElements(){
        List<WebElement> listobj = Session.getInstance().getBrowser().findElements(By.xpath("//div[@class='card h-100 material-card depth-4 depth-8-hover pb-4']"));

        for (int i = 0; i < listobj.size(); i++){
            cont ++;
            //System.out.println(cont);
        }



    }

    public void getName(){
        List<WebElement> listonm = Session.getInstance().getBrowser().findElements(By.xpath("//h3[@class='base mb-2 h6']/*"));
        for (int i = 0; i < listonm.size(); i++){
            System.out.println(listonm.get(i).getText());

        }System.out.println("La suma de aplicaciones es de "+cont);



    }

    public static Object getNonFree(){
        WebElement e = Session.getInstance().getBrowser().findElement(By.xpath("(//span[contains(text(),'MXN$')])[1]"));
        //System.out.println(e.getText());
        return e;
    }
}
