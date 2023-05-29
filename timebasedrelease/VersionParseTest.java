package timebasedrelease;

public class VersionParseTest {
  public static void main(String[] args) {
    Runtime.Version version = Runtime.Version.parse("10.0.1");
    printVersionInfo(version);
  }

  private static void printVersionInfo(Runtime.Version version) {
    int feature = version.feature();
    int interim = version.interim();
    int update = version.update();
    int patch = version.patch();
    System.out.printf(" feature: %s%n interim: %s%n update: %s%n patch: %s%n",
            feature, interim, update, patch);
  }
}
