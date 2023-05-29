package timebasedrelease;

public class VersionSystemProperties {
  public static void main(String[] args) {
    String versionDate = System.getProperty("java.version.date");
    System.out.println("java.version.date: " + versionDate);

    String vendorVersion = System.getProperty("java.vendor.version");
    System.out.println("java.vendor.version: " + vendorVersion);
  }
}
