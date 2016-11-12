package firm.stuff;

import firm.Employee;
import firm.PaymentPeriod;

public class Manager extends FixedRateEmployee {
  private float bonus;
  
  public Manager(String name, float dailyRate, PaymentPeriod period) {
    super(name, dailyRate, period);
  }   

  public void setBonus(float bonus) {
    this.bonus = bonus;  
  } 
  
  public float calculatePayment() {
    return super.calculatePayment() + bonus;  
  }  
}