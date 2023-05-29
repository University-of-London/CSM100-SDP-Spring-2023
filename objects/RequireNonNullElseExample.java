package objects;

import java.math.BigDecimal;
import java.util.Objects;

public class RequireNonNullElseExample {
  public static void main(String[] args) {
    System.out.println(twice(BigDecimal.TEN));
    System.out.println(twice(null));
  }

  public static BigDecimal twice(BigDecimal input) {
    BigDecimal bd = Objects.requireNonNullElse(input, BigDecimal.ZERO);
    return bd.add(bd);
  }
}
