package examples;

public class TernaryOperator {
  public static void main(String[] args) {
    var x = args.length > 0 ? args.length : -1;
    System.out.println(x);
    //the x is of type int
    int i = x; //no casting
  }
}
