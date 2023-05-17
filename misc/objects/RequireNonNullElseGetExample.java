package objects;

import java.util.Arrays;
import java.util.Objects;

public class RequireNonNullElseGetExample {
  public static void main(String[] args) {
    int numbers[] = getSomeNumbers();
    numbers = Objects.requireNonNullElseGet(numbers, () -> new int[]{});
    int sum = Arrays.stream(numbers).sum();
    System.out.println(sum);
  }

  public static int[] getSomeNumbers() {
    // TODO
    return null;
  }
}
