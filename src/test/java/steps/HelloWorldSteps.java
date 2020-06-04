package steps;

// Cucumber
import io.cucumber.java.*;
import io.cucumber.java.en.*;

// Serenity
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

// JUnit
import org.junit.Assert;

// Screenplay Model
import model.homepage.OpenHomepage;
import model.homepage.ClickColombia;
import model.colombia.GetColombiaMenu;


public class HelloWorldSteps {

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
}