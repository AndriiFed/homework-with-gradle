package firm.stuff;

import firm.Employee;

public class Volunteer extends Employee {
  private String name;

  public Volunteer(String name) {
    super(name);
  }

  public void setWorkingHours(int workingHours) {}

  public float calculatePayment() {
    return 0f;
  }

}
