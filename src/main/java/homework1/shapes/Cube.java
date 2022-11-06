package homework1.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@Setter
@Getter
@FieldDefaults(level = PRIVATE)
@AllArgsConstructor
@ToString
public class Cube implements Shape {
  double a;

  @Override
  public double getVolume() {
    return a * a * a;
  }
}
