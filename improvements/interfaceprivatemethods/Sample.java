package improvements.interfaceprivatemethods;


public class Sample implements Util {
  public static void main(String[] args) {
    System.out.println(new TwoCompletableTimeout().getNumberOfCores());

    System.out.println(Util.getCoresCount());
  }
}

