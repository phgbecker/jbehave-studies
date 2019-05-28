package stories;

import org.assertj.core.api.Assertions;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.util.Random;

public class IncreaseCounterSteps {
    private int counter;
    private int previousCounterValue;

    @Given("a counter")
    public void givenACounter() {

    }

    @Given("the counter has any integer value")
    public void givenTheCounterHasAnyIntegerValue() {
        counter = new Random().nextInt();
        previousCounterValue = counter;
    }

    @When("the user increases the counter")
    public void whenTheUserIncreasesTheCounter() {
        counter++;
    }

    @Then("the value of the counter must be 1 greater than the previous value")
    public void thenTheValueOfTheCounterMustBe1GreaterThanThePreviousValue() {
        Assertions.assertThat(counter).isGreaterThan(previousCounterValue);
    }

}