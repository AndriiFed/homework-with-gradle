package firm.stuff;

import firm.Employee;

public class HourlyRateEmployee extends Employee {
  private String name;
  private float hourSalary;

  public HourlyRateEmployee(String name, float hourSalary) {
    super(name);
    this.hourSalary = hourSalary;
  }

  public float calculatePayment() {
    return getWorkingHours() * hourSalary;
  }

}
