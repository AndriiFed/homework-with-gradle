package firm.stuff;

import firm.PaymentPeriod;
import firm.stuff.FixedRateEmployee;

import java.lang.Float;

public class Manager extends FixedRateEmployee {
  private float bonus;

  public Manager(String name, float daysalary, PaymentPeriod period) {
    super(name, daysalary, period);
  }

  public void setBonus(float bonus) {
    this.bonus = bonus;
  }

  public float calculatePayment() {
    float salary = super.calculatePayment();
    if (Float.compare(salary, 0f) == 0) {
      return 0f;
    } else {
      return salary + bonus;
    }
  }

}
