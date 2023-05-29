package stackwalker;

public class StackWalkerTraversalExample {
  public static void main(String[] args) {
    method1();
  }

  private static void method1() {
    method2();
  }

  private static void method2() {
    method3();
  }

  private static void method3() {
    StackWalker stackWalker = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);
    stackWalker.forEach(StackWalkerTraversalExample::print);
  }

  private static void print(StackWalker.StackFrame stackFrame) {
    Class<?> c = stackFrame.getDeclaringClass();
    int lineNumber = stackFrame.getLineNumber();
    String methodName = stackFrame.getMethodName();
    System.out.printf("Class: %s, Method: %-7s, Line: %s%n",
            c.getSimpleName(), methodName, lineNumber);
  }
}
