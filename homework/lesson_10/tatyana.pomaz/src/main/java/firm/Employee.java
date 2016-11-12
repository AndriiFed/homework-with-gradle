package firm;

public abstract class Employee implements Payable {
  private String name;
  protected int workingHours;
    
  protected Employee(String name) {
    this.name = name;
  }
  
  public void setWorkingHours(int workingHours) {
    this.workingHours = workingHours;
  }
}
