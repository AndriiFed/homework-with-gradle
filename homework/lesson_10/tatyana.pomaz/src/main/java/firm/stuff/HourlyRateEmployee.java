package firm.stuff;

import firm.Employee;

public class HourlyRateEmployee extends Employee {
  private float hourlyRate;
  
  public HourlyRateEmployee(String name, float hourlyRate) {
    super(name);
    this.hourlyRate = hourlyRate;  
  }
  
  public float calculatePayment() {
    return workingHours * hourlyRate;  
  }
}