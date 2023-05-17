package examples;

public class AnonymousClass {
  public static void main(String[] args) {
    var message = "running...";//effectively final
    var runner = new Runnable() {
      @Override
      public void run() {
        System.out.println(message);
      }
    };
    runner.run();
  }
}
