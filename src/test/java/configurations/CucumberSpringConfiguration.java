package configurations;
import com.admin.application.DemoApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = {
        DemoApplication.class
})
public class CucumberSpringConfiguration {
}
