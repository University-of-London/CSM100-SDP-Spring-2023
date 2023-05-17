package improvements.interfaceprivatemethods;

interface Util {
  static int getCoresCount() {
    return getRuntime().availableProcessors();
  }

  //may be called from static methods
  private static Runtime getRuntime() {
    return Runtime.getRuntime();
  }

  default int getNumberOfCores() {
    return getNumberOfCoresFromRuntime();
  }

  //may be called from default methods
  private int getNumberOfCoresFromRuntime() {
    return Runtime.getRuntime().availableProcessors();
  }
}
