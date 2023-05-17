package examples;

public class TernaryOperatorThree {
  public static void main(String[] args) {
    var x = args.length < 5 ? args.length : "More than 5 args not allowed";
    System.out.println(x);
    System.out.println(x.getClass());
  }
}
