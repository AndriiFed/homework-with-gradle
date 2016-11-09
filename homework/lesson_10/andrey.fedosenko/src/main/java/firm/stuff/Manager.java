package firm.stuff;

import firm.PaymentPeriod;
import firm.stuff.FixedRateEmployee;

public class Manager extends FixedRateEmployee {
  private float bonus;

  public Manager(String name, float daysalary, PaymentPeriod period) {
    super(name, daysalary, period);
  }

  public void setBonus(float bonus) {
    this.bonus = bonus;
  }

  public float calculatePayment() {
    return super.calculatePayment() + bonus;
  }

}
