package model.colombia;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://www.eltiempo.com/colombia")
public class ColombiaPage extends PageObject {

    static By COL_MENU = By.xpath("//li[@class='colombia first']");
}
