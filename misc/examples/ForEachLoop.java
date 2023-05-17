package examples;

import java.util.Arrays;

public class ForEachLoop {
  public static void main(String[] args) {
    var list = Arrays.asList(1, 2, 3);
    for (var integer : list) {
      var z = integer * 3;//equivalent to: int z= integer * 3;
      System.out.println(z);
    }
  }
}
