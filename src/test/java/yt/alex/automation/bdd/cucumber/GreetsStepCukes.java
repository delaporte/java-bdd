package yt.alex.automation.bdd.cucumber;

import static org.junit.Assert.assertEquals;
import yt.alex.automation.bdd.Greets;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class GreetsStepCukes {
    private Greets greets;
    private String result;
    
    @Given("^nothing$")
    public void nothing() throws Throwable {
        System.out.println("coucou");
        this.greets = new Greets();
    }
    
    @Given("^the name is \"(.*?)\"$")
    public void the_name_is(String arg1) throws Throwable {
        greets.setName(arg1);
    }
    
    @When("^calling hello\\(\\)$")
    public void calling_hello() throws Throwable {
        result = greets.hello(); 
    }

    @Then("^I get \"(.*?)\"$")
    public void i_get(String arg1) throws Throwable {
        assertEquals(arg1, result);
    }
}
