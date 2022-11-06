package homework1;

import homework1.shapes.Shape;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;


public class Utils {

  public static int[] sort(int[] numbers) {
    return Arrays.stream(numbers)
        .filter(n -> n >= 0)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .mapToInt(x -> x)
        .toArray();
  }

  public static List<String> findHashtags(List<String> strings) {
    Map<String, Long> map = strings.stream().map(s -> Arrays.stream(s.split(" "))
            .filter(w -> w.startsWith("#"))
            .distinct()
            .collect(Collectors.toList()))
        .flatMap(List::stream).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    List<Long> entries = map.values().stream().sorted(Collections.reverseOrder()).limit(5).toList();
    return map.keySet().stream().filter(k -> entries.contains(map.get(k))).toList();
  }

  public static List<Shape> sortByVolume(List<Shape> shapes) {
    Map<Double, Shape> res = shapes.stream()
        .collect(toMap(Shape::getVolume, Function.identity()));
    return res.keySet().stream()
        .sorted()
        .map(res::get)
        .collect(toList());
  }

}
