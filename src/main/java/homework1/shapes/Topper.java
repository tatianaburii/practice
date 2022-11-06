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
public class Topper implements Shape{
  double h;
  double r;
  @Override
  public double getVolume() {
    return Math.PI * r * r * h;
  }
}
