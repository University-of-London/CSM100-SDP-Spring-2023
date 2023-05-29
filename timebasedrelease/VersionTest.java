package timebasedrelease;

public class VersionTest {
  public static void main(String[] args) {
    Runtime.Version version = Runtime.version();
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
