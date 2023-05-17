package stackwalker;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StackWalkerWalkExample {
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
    StackWalker stackWalker = StackWalker.getInstance();
    List<String> lines = stackWalker.walk(StackWalkerWalkExample::fetchLines);
    System.out.println(lines);
  }

  private static List<String> fetchLines(Stream<StackWalker.StackFrame> stream) {
    List<String> lines = stream.filter(stackFrame -> stackFrame.getMethodName()
            .startsWith("method"))
            .map(stackFrame -> stackFrame.getMethodName() +
                    ":" + stackFrame.getLineNumber())
            .collect(Collectors.toList());
    return lines;
  }
}
