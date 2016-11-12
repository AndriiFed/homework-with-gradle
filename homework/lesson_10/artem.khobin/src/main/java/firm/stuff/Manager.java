package firm.stuff;

import firm.PaymentPeriod;

public class Manager extends FixedRateEmployee {
  private float bonus = 0;

  public Manager(String employeeName, float employeeRate, PaymentPeriod employeePaymentPeriod) {
    super(employeeName, employeeRate, employeePaymentPeriod);
  }

  public float calculatePayment() {
    return super.calculatePayment() + bonus;
  }

  public void setBonus(float employeeBonus) {
    bonus = employeeBonus;
  }
}
