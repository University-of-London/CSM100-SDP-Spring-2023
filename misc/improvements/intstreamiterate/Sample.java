package improvements.intstreamiterate;

import java.util.stream.IntStream;

public class Sample {
  public static void main(String[] args) {
    //Java 8
    for (int i = 0; i < 3; i++) {
      System.out.println(i);
    } //if <=
    System.out.println("-----");

    IntStream.range(0, 3).forEach(System.out::println); //then use rangeClosed
    System.out.println("-----");

    //Java 9
    for (int i = 0; i < 10; i = i + 2) {
      System.out.println(i);
    }
    System.out.println("-----");

    IntStream.iterate(0, i -> i < 10, i -> i + 2)
            .forEach(System.out::println);

    System.out.println("-----");
    IntStream.iterate(0, i -> i + 2)
            .limit(5)
            .forEach(System.out::println);
  }
}

