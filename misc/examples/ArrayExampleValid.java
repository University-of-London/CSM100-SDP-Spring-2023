package examples;

public class ArrayExampleValid {
  public static void main(String[] args) {
    var numbers = new int[]{1, 2, 4};
    var number = numbers[1];
    number = number + 3;
    System.out.println(number);
  }
}
