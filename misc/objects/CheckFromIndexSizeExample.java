package objects;

import java.util.Objects;

public class CheckFromIndexSizeExample {
  public static void main(String[] args) {
    String s = "my string";
    String result = getPartByLength(s, 3, 4);
    System.out.println(result);

    result = getPartByLength(s, 3, 8);
    System.out.println(result);
  }

  private static String getPartByLength(String input, int start, int partLength) {
    Objects.checkFromIndexSize(start, partLength, input.length());
    return input.substring(start, start + partLength);
  }
}
