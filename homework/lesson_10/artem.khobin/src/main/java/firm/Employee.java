package firm;

public abstract class Employee implements Payable {
  protected String name;
  protected int workingHours;

  public Employee(String employeeName) {
    name = employeeName;
  }

  public void setWorkingHours(int workingHours) {
    this.workingHours = workingHours;
  }
}
