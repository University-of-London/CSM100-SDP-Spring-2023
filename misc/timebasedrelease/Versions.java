package timebasedrelease;

public class Versions {
  public static void main(String[] args) {
    Runtime.Version version = Runtime.version();
    System.out.println(version.feature());
    System.out.println(version.interim());
    System.out.println(version.patch());
  }
}
