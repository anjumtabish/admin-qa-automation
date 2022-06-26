package steps;

import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;

public class DemoStep extends BaseTestRunner {

    @Given("^Admin user logins with valid credentials$")
    public void adminUserLoginWithValidCredentials() {
//        System.out.println("Login works");
        Assertions.fail("Login failed");
    }

    @Given("^Admin user logouts with valid credentials$")
    public void adminUserLogoutWithValidCredentials() {
//        System.out.println("Logouts works");
    }
}
