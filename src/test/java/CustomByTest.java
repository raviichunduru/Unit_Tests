import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class CustomByTest {

  @Test
  void byTestId () {
    By customBy = CustomBy.testID("submit");

    Assertions.assertThat(customBy)
      .isInstanceOf(By.ByXPath.class)
      .isNotNull()
      .hasToString("By.xpath: //*[@testId = 'submit1']");
  }
}
