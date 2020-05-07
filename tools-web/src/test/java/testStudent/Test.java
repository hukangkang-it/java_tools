package testStudent;

import javafx.application.Application;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class,
        properties = "logging.config=classpath:logback-spring-console.xml")
@EnableTransactionManagement
public abstract class Test  {

}
