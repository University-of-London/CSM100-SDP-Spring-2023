package examples;

import java.util.Arrays;

public class JavaStream {
  public static void main(String[] args) {
    var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    var stream = list.stream();
    stream.filter(i -> i % 2 == 0)
            .forEach(System.out::println);
  }
}
