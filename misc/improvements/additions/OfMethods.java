package improvements.additions;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMethods {
  public static void useList(List<Integer> list) {
    System.out.println("-------");
    System.out.println(list);
    System.out.println(list.getClass());
  }

  public static void useSet(Set<Integer> set) {
    System.out.println("-------");
    System.out.println(set);
    System.out.println(set.getClass());
  }

  public static void main(String[] args) {
    useList(List.of(1, 2, 3, 4));
    useList(List.of(1, 2, 3));
    useList(List.of(1, 2));
    useList(List.of(1));
    useList(List.of());

    useSet(Set.of(1, 2, 3, 4));
    useSet(Set.of(1, 2, 3));
    useSet(Set.of(1, 2));
    useSet(Set.of(1));
    useSet(Set.of());

    System.out.println("-------");
    Map<String, Integer> map = Map.of("a", 1, "b", 2);
    System.out.println(map);
    System.out.println(map.getClass());
  }
}

