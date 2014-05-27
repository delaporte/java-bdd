package yt.alex.automation.bdd.jbehave;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

import yt.alex.automation.bdd.Greets;

public class GreetsStepJBehave extends Steps {
    private Greets greets;
    private String result;
    
    @Given("nothing")
    public void nothing() throws Throwable {
        System.out.println("coucou");
        this.greets = new Greets();
    }
    
    @Given("the name is $name")
    public void the_name_is(String name) throws Throwable {
        greets.setName(name);
    }
    
    @When("calling hello")
    public void calling_hello() throws Throwable {
        result = greets.hello(); 
    }

    @Then("I get $name")
    public void i_get(String name) throws Throwable {
        assertEquals(name, result);
    }
}
