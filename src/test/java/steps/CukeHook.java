package steps;


import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class CukeHook {
    @Autowired
    public WebDriver driver;

        @After
        public  void quit(){
            System.out.println("closing");
            driver.close();
            driver.quit();
        }

}
