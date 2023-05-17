package examples;

import java.math.BigDecimal;

public class PassVarToMethodExample {
  public static void main(String[] args) {
    var number = new BigDecimal("1.6");
    number = getSquareOf(number);
    System.out.println(number);
  }

  private static BigDecimal getSquareOf(BigDecimal number) {
    var result = number.multiply(number);
    return result;
  }
}
