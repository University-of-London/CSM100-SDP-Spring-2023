package objects;

import java.util.Objects;

public class CheckFromToIndexExample {
  public static void main(String[] args) {
    String s = "my string";
    String result = getPart(s, 3, 9);
    System.out.println(result);

    result = getPart(s, 3, 10);
    System.out.println(result);
  }

  private static String getPart(String input, int from, int to) {
    Objects.checkFromToIndex(from, to, input.length());
    return input.substring(from, to);
  }
}
