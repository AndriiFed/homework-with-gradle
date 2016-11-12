package firm.stuff;

import firm.Employee;

public class Volunteer extends Employee {
  public Volunteer(String name) {
    super(name);  
  }

  public float calculatePayment() {
    return 0;  
  }  
}