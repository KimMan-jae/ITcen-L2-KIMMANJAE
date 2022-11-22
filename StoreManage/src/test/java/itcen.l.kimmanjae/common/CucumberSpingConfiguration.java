package itcen.l.kimmanjae.common;


import itcen.l.kimmanjae.StoreManageApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { StoreManageApplication.class })
public class CucumberSpingConfiguration {
    
}
