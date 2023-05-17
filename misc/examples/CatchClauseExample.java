package examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CatchClauseExample {
  public static void main(String[] args) {
    try {
      Files.readAllBytes(Paths.get("c:\temp\temp.txt"));
    } catch (IOException e) {
    }
  }
}
