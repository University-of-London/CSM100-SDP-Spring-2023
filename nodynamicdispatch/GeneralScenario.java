package nodynamicdispatch;

public class GeneralScenario {
  public static void main(String[] args) {
    B b = new B();
    b.doSomething(1);

    A a = b;
    a.doSomething(1);
  }

  public static class A {
    public void doSomething(Object obj) {
      System.out.println("A#doSomething(Object) " + obj);
    }
  }

  public static class B extends A {
    public void doSomething(int i) {
      System.out.println("B#doSomething(int) " + i);
    }
  }
}
