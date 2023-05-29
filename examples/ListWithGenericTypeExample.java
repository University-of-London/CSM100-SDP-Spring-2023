package examples;

import java.util.ArrayList;

public class ListWithGenericTypeExample {
  public static void main(String[] args) {
    var list = new ArrayList<Integer>();
    list.add(10);
    System.out.println(list);
    //no need to cast
    int i = list.get(0);
    System.out.println(i);
  }

}
