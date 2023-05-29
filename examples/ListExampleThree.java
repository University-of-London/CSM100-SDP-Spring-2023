package examples;

import java.util.ArrayList;
import java.util.Arrays;

public class ListExampleThree {
  public static void main(String[] args) {
    var list = new ArrayList<>(Arrays.asList(10, "two"));
    //Currency is Serializable but not Comparable
    // list.add(Currency.getInstance("USD"));
  }
}
