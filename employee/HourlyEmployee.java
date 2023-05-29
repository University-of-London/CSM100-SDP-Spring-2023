package employee;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

  public static String YAY = "yay!";

  private double hourlyWage;
  private double monthlyHours;

  /**
   * Constructs an HourlyEmployee with hourly wage of 20 and
   * monthly hours of 160.
   */
  public HourlyEmployee(String aname, LocalDate ahiredate) {
    this(aname, ahiredate, 20.00, 160.0);
  }

  public HourlyEmployee(String aname, LocalDate ahiredate,
                        double anhourlywage, double amonthlyhours) {
    super(aname, ahiredate);
    ValidationUtils.disallowZeroesAndNegatives(anhourlywage,
            amonthlyhours);
    hourlyWage = anhourlywage;
    monthlyHours = amonthlyhours;
  }

  public static void main(String[] args) throws Exception {
    System.out.println(YAY);
    HourlyEmployee eva = new HourlyEmployee("Eva Luator",
            LocalDate.of(2013, 6, 10));

    System.out.println("eva's name: " + eva.getName());

  }

  @Override
  public String getName() {
    return "Hourly: " + super.getName();
  }

  public double getHourlyWage() {
    return hourlyWage;
  }

  public void setHourlyWage(double newWage) {
    hourlyWage = newWage;
  }

  public double getMonthlyHours() {
    return monthlyHours;
  }

  @Override
  public double monthlyPay() {
    return hourlyWage * monthlyHours;
  }

  @Override
  public String toString() {
    return getName() + "; Hire Date: " + getHireDate() + "; Hourly Wage: "
            + hourlyWage + "; Monthly Hours: " + monthlyHours;
  }
}
