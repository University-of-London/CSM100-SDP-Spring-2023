package examples;

import java.util.Arrays;

public class ListExample {
  public static void main(String[] args) {
    var list2 = Arrays.asList(10);
    System.out.println(list2);
    //following needs no casting, which shows compiler has inferred correct element type int
    int i = list2.get(0);//equivalent to: var i = list2.get(0);
    System.out.println(i);
  }
}
