import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.example.maven_restapi.demo.DemoApplication;
import com.example.maven_restapi.service.UserService;

@SpringBootTest
@ContextConfiguration(classes = DemoApplication.class)
public class test1 {
  @Autowired
  private UserService userService;

  @Test
  public void printTest() {
    System.out.println("Hi");
  }

  @Test
  public void printTest2() {
    assertEquals(2, 1 + 1);
		assertThat(2).isEqualTo(1 + 1);
  }
}
