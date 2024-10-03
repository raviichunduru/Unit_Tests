import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

  @Test
  public void studentWithValidName() {
    Student student = new Student("abc","123");

    Assertions.assertThat(student.toString()).isEqualTo("Student{name='abc', id='123'}");
  }

  @Test
  public void assertIfErrorThrownForStudentWithNullName() {

    assertThrows(IllegalArgumentException.class,()->new Student(null,"123"));
  }
}
