package timebasedrelease;

public class VersionSystemPropertiesTwo {
  public static void main(String[] args) {
    System.out.println("java.version: " + System.getProperty("java.version"));
    System.out.println("java.runtime.version: " + System.getProperty("java.runtime.version"));
    System.out.println("java.vm.version: " + System.getProperty("java.vm.version"));
    System.out.println("java.specification.version: " + System.getProperty("java.specification.version"));
    System.out.println("java.vm.specification.version: " + System.getProperty("java.vm.specification.version"));
  }
}
