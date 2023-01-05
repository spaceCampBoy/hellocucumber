package hellocucumber;

import calculator.SimpleCalculator;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefinitions {
    private SimpleCalculator simpleCalculator;
    private int a;
    private int b;
    @Given("an instance of SimpleCalculator")
    public void anInstanceOfSimpleCalculator() {
        simpleCalculator = new SimpleCalculator();
        assertTrue(simpleCalculator instanceof SimpleCalculator);
    }

    @When("the input a is {int} and b is {int}")
    public void theInputAIsAndBIs(int arg0, int arg1) {
        a = arg0;
        b = arg1;
    }

    @Then("the output is {int}")
    public void theOutputIs(int arg0) {
        assertTrue(simpleCalculator.add(a,b) == arg0);
    }
}
