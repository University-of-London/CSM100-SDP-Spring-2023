package employee;

import java.time.LocalDate;

public class Employee2 {

  private String name;
  private LocalDate hireLocalDate;

  public Employee2(String aname, LocalDate ahirelocaldate) {
    disallowNullArguments(aname, ahirelocaldate);
    name = aname;
    hireLocalDate = ahirelocaldate;
  }

  public String getName() {
    return name;
  }

  public LocalDate getHireDate() {
    return hireLocalDate;
  }

  @Override
  public String toString() {
    return name + "; " + hireLocalDate;
  }

  private void disallowNullArguments(Object... args) {
    for (Object arg : args) {
      if (arg == null) {
        String msg = "Null arguments not allowed.";
        throw new IllegalArgumentException(msg);
      }
    }
  }
}
