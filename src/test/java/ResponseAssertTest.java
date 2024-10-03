import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;

class ResponseAssertTest {
  @Test
  void validatingAssertThatMethod() {
    Response mockResponse = mock(Response.class);

    Assertions.assertThat(ResponseAssert.assertThat(mockResponse))
              .isInstanceOf(ResponseAssert.class);
  }
}
