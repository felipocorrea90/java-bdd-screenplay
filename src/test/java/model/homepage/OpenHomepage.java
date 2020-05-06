package model.homepage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class OpenHomepage {

    public static Performable goToHomepage() {
        return Open.browserOn().the(Homepage.class);
    }
}
