package homework1;

import homework1.shapes.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UtilsTest {
  @Test
  void findHashtags_ReturnsFiveTheMostPopularWords() {
    String s1 = "#one";
    String s2 = "#one #two #three";
    String s3 = "#one #two #three";
    String s4 = "#one #two #three #four";
    String s5 = "#one #two #three #four #five #five #five";
    String s6 = "#one #two #three #four #five #six";
    String s7 = "#one #two #three #four #five #six #seven #seven #seven #seven #seven #seven #seven";

    List<String> strings = List.of(s1, s2, s3, s4, s5, s6, s7);

    Map<String, Long> result = Utils.findHashtags(strings);
    assertThat(result.get("#one")).isNotNull();
    assertThat(result.get("#two")).isNotNull();
    assertThat(result.get("#three")).isNotNull();
    assertThat(result.get("#four")).isNotNull();
    assertThat(result.get("#five")).isNotNull();
    assertThat(result.get("#six")).isNull();
    assertThat(result.get("#one")).isEqualTo(7);
    assertThat(result.get("#five")).isEqualTo(3);

  }

  @Test
  void sort_ReturnsSortedArray() {
    int[] numbers = {-4, 5, 0, 3, 9, 11, 1};
    int[] expectedNumbers = {11, 9, 5, 3, 1, 0};

    assertThat(Utils.sort(numbers)).isEqualTo(expectedNumbers);
  }

  @Test
  void sortByVolume_ReturnsSortedShapes() {
    Shape cube = new Cube(3);
    Shape topper = new Topper(5, 2);
    Shape ball = new Ball(3);

    assertThat(Utils.sortByVolume(List.of(ball, topper, cube))).isEqualTo(List.of(cube, topper, ball));
  }
}
