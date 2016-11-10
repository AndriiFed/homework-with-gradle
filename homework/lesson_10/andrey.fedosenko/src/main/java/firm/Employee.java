package firm;

public abstract class Employee implements Payable {
  private String name;
  private int workingHours;

  public Employee(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setWorkingHours(int workingHours) {
    this.workingHours = workingHours;
  }

  public int getWorkingHours() {
    return workingHours;
  }

}
