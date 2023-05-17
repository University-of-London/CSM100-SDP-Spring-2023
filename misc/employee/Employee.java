package employee;

import java.time.LocalDate;

public abstract class Employee {

  private String name;
  private LocalDate hireDate;

  public Employee(String aname, LocalDate ahiredate) {
    ValidationUtils.disallowNullArguments(aname, ahiredate);
    name = aname;
    hireDate = ahiredate;
  }

  public abstract double monthlyPay();

  public String getName() {
    return name;
  }

  public LocalDate getHireDate() {
    return hireDate;
  }

  @Override
  public String toString() {
    return name + "; " + hireDate;
  }

  @Override
  public boolean equals(Object other) {
    if (other == null) {
      return false;
    }
    if (this == other) {
      return true;
    }
    if (!(other instanceof Employee)) {
      return false;
    }
    Employee that = (Employee) other;
    return name.equals(that.name) && hireDate.equals(that.hireDate);
  }
}
