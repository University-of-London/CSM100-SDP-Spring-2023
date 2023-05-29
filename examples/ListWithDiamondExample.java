package examples;

import java.util.ArrayList;

public class ListWithDiamondExample {
  public static void main(String[] args) {
    var list = new ArrayList<>();
    list.add(10);
    System.out.println(list);
    //need to cast to get int back
    int i = (int) list.get(0);
    System.out.println(i);
  }
}
