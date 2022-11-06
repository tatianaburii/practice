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
public class Ball implements Shape{

  double r;

  @Override
  public double getVolume() {
    return (double) 4/3 * Math.PI * r * r * r;
  }
}
