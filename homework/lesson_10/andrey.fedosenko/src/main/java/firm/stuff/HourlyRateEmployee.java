package firm.stuff;

import firm.Employee;

public class HourlyRateEmployee extends Employee {
  private String name;
  private float hoursalary;

  public HourlyRateEmployee(String name, float hoursalary) {
    super(name);
    this.hoursalary = hoursalary;
  }

  public float calculatePayment() {
    return getWorkingHours() * hoursalary;
  }

}
