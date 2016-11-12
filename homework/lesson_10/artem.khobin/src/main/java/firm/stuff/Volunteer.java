package firm.stuff;

import firm.Employee;

public class Volunteer extends Employee {
  public Volunteer(String employeeName) {
    super(employeeName);
  }

  public float calculatePayment() {
    return 0;
  }
}
