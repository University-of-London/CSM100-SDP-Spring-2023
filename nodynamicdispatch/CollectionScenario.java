package nodynamicdispatch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionScenario {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    System.out.println(list);

    list.remove(0); //should remove element at index 0, i.e. 10 ??
    System.out.println(list);

    Collection<Integer> c = list;
    c.remove(0); //should remove element at index 0, i.e. 20 ??
    System.out.println(list);
  }
}
