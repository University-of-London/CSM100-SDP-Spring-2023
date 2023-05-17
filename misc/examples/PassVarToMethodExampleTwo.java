package examples;

import java.util.List;
import java.util.stream.Collectors;

public class PassVarToMethodExampleTwo {
  public static void main(String[] args) {
    var numbers = List.of(1.1, 2.2, 3.3);
    System.out.println(numbers);
    var integers = toIntList(numbers);
    System.out.println(integers);
  }

  private static <T extends Number> List<Integer> toIntList(List<T> listOfNumber) {
    var integers = listOfNumber.stream()
            .map(Number::intValue)
            .collect(Collectors.toList());
    return integers;
  }
}
