package firm.stuff;

import firm.Employee;

public class HourlyRateEmployee extends Employee {
  private String name;
  private float hoursalary;
  private int workingHours = 0;

  public HourlyRateEmployee(String name, float hoursalary) {
    super(name);
    this.hoursalary = hoursalary;
  }

  public void setWorkingHours(int workingHours) {
    this.workingHours = workingHours;
  }

  public float calculatePayment() {
    return workingHours * hoursalary;
  }

}
