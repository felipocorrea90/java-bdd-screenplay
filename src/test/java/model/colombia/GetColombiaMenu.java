package model.colombia;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class GetColombiaMenu extends UIInteractionSteps {

    public static String getText(Actor actor) {
        return Text.of(ColombiaPage.COL_MENU).viewedBy(actor).asString();
    }
}
