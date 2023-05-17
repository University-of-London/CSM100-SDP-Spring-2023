package examples;

public class TernaryOperatorTwo {
  public static void main(String[] args) {
    var x = args.length > 0 ? args.length : "no args";
    System.out.println(x);
    System.out.println(x.getClass());
  }
}
