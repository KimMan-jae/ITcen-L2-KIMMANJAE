package itcen.l.kimmanjae.common;


import itcen.l.kimmanjae.CouponApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CouponApplication.class })
public class CucumberSpingConfiguration {
    
}
