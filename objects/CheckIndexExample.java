package objects;

import java.util.Objects;

public class CheckIndexExample {
  public static void main(String[] args) {

    String s = "my string";
    String result = splitTillPos(s, 2);
    System.out.println(result);

    result = splitTillPos(s, 10);
    System.out.println(result);
  }

  private static String splitTillPos(String input, int pos) {
    Objects.checkIndex(pos, input.length());
    return input.substring(0, pos);
  }
}
