package definitions;

import io.cucumber.java8.En;
import org.junit.Assert;

public class MyStepdefs implements En {
    public MyStepdefs() {
        Given("^I do first step$", () -> {
            Thread.sleep(1000);
            Assert.assertTrue(true);
        });
        When("^I do second step$", () -> {
            Thread.sleep(1000);
            Assert.assertTrue(true);
        });
        Then("^I do third step$", () -> {
            Thread.sleep(1000);
            Assert.assertTrue(true);
        });
    }
}
