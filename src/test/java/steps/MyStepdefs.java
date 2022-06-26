package steps;

import com.admin.application.AdminPages.BasePage;
import com.admin.application.AdminPages.DariLogger;
import com.admin.application.AdminPages.DriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.TimeUnit;


public class MyStepdefs extends BaseTestRunner {

    @Autowired
    public WebDriver driver;

    @Autowired
    public BasePage basePage;

    @Autowired
     public DariLogger logger;

    @Value("${url}")
    private String url;

    @Given("^Admin user logins with valid credentials$")
    public void adminUserLoginWithValidCredentials() throws InterruptedException {

//        driverConfig.getChromeDriver();
        logger.info("Starting Browser : " + "Chrome");
        driver.manage().window().maximize();
        driver.get(url);
        logger.info("Successful login to the Admin : "+ url);
        basePage.getUsername();
        basePage.getPassword();
        basePage.clickButton();
    }

    @Given("Admin Navigates to Dashboard")
    public void adminNavigatesToDashboard() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String title = driver.getTitle();
        logger.info("Title of the admin page : " + title);
        try {
            Assert.assertEquals(title, "Dari admin");
            logger.info("Dashboard: "+ "Successful Navigation");
        }catch (Exception e){
            e.printStackTrace();
            logger.info("Unsuccessful Navigation to dashboard");
        }

    }

    @When("Admin clicks on Assigned to me button")
    public void adminClicksOnAssignedToMeButton() throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        basePage.getAssignedToMeButton();
        Thread.sleep(8000);
    }

    @Then("Admin navigates to my Application page")
    public void adminNavigatesToMyApplicationPage() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement myApplicationKey = basePage.getMyApplicationPage();
        String text = myApplicationKey.getText();
        logger.info(text);
        Assert.assertEquals(text, "My applications");

    }

    @When("Admin clicks on Add person tab")
    public void adminClicksOnAddPersonTab() throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        basePage.getAddPersonTab();}

    @Then("Add Person application gets initiated")
    public void addPersonApplicationGetsInitiated() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertEquals(basePage.getApplicationAddPerson(), "Add person");
//        driver.close();
//        driver.quit();

    }
}
