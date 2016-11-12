package firm.stuff;

import firm.Employee;

public class HourlyRateEmployee extends Employee {
  private float hourlyRate;

  public HourlyRateEmployee(String employeeName, float employeeRate) {
    super(employeeName);
    hourlyRate = employeeRate;
  }

  public float calculatePayment() {
    return workingHours * hourlyRate;
  }
}
