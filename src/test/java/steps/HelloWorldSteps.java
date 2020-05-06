package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import model.colombia.ColombiaPage;
import model.homepage.Homepage;
import model.homepage.OpenHomepage;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import utils.Driver;
import model.homepage.ClickColombia;
import model.colombia.GetColombiaMenu;

import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class HelloWorldSteps {

    /* Serenity step libraries as action classes to make the tests easier to read
    These classes are declared using the Serenity @Steps annotation
    The @Steps annotation tells Serenity to create a new instance of the class, and inject any other steps or page objects that this instance might need.

    @Steps
    OpenHomepage openHomepage;

    @Steps
    ClickColombia clickColombia;

    @Steps
    GetColombiaMenu getColombiaMenu;
    */

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that {string} visits El Tiempo website")
    public void the_user_visits_the_El_Tiempo_website(String customerName) {
        OnStage.theActorCalled(customerName).attemptsTo(OpenHomepage.goToHomepage());
    }

    @When("he clicks on the Colombia option")
    public void the_user_clicks_on_the_Colombia_option() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickColombia.clickColombia());
    }

    @Then("he should be redirected to the Colombia page")
    public void the_Colombia_page_should_load() {
        Assert.assertEquals("COLOMBIA", GetColombiaMenu.getText(OnStage.theActorInTheSpotlight()));
    }

    /*
    @After
    public void afterScenario() {
        wd.quit();
    }*/
}