package examples;

import java.io.Serializable;

public class TernaryOperatorFour {
  public static void main(String[] args) {
    Serializable x = args.length > 0 ? args.length : "no args";
    System.out.println(x);
    System.out.println(x.getClass());
  }
}
