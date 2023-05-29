package examples;

public class StringExample {
  public static void main(String[] args) {
    var str = "a test string";
    var substring = str.substring(2);
    System.out.println(substring);
    System.out.println(substring.getClass().getTypeName());
  }
}
