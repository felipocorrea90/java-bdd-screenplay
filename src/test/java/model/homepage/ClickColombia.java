package model.homepage;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

public class ClickColombia {

    public static Performable clickColombia() {
        return Click.on(Homepage.COL_OPTION);
    }
}
