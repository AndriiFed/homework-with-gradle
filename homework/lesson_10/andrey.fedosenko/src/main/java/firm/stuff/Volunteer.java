package firm.stuff;

import firm.Employee;

public class Volunteer extends Employee {
  private String name;

  public Volunteer(String name) {
    this.name = name;
  }

  public void setWorkingHours(int workingHours) {}

  public float calculatePayment() {
    return 0f;
  }

  public String getName() {
    return name;
  }

}
