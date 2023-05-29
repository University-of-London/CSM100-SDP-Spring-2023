package timebasedrelease;

import javax.lang.model.SourceVersion;

public class SourceVersionTest {
  public static void main(String[] args) {
    SourceVersion latest = SourceVersion.latest();
    System.out.println(latest);
  }
}
