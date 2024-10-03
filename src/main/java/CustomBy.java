import groovy.transform.ASTTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public final class CustomBy {
    private CustomBy() {}

  public static By testID(String testId) {
    return By.xpath(String.format("//*[@testId = '%s1']", testId));
  }

  public static By testID(String attributeName, String testId) {
    return By.xpath(String.format("//*[@'%s1' = '%s2']", attributeName, testId));
  }
}
