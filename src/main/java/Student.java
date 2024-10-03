import lombok.Data;

import java.util.Objects;

public class Student {

  public String name;
  public String id;

  public Student(String name, String id) {

    if(Objects.isNull(name)) {
      throw new IllegalArgumentException("name can't be null");
    }
    this.name = name;
    this.id = id;
  }

  @Override
  public String toString() {
    return "Student{" +
      "name='" + name + '\'' +
      ", id='" + id + '\'' +
      '}';
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
