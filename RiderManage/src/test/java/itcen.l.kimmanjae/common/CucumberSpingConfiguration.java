package itcen.l.kimmanjae.common;


import itcen.l.kimmanjae.RiderManageApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { RiderManageApplication.class })
public class CucumberSpingConfiguration {
    
}
