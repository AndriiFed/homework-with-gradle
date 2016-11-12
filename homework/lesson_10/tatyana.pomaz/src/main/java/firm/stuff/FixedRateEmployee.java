package firm.stuff;

import firm.Employee;
import firm.Payable;
import firm.PaymentPeriod;

public class FixedRateEmployee extends Employee {
  private float dailyRate;
  private int paymentDays;
    
  public FixedRateEmployee(String name, float dailyRate, PaymentPeriod period) {
    super(name);
    this.dailyRate = dailyRate;
    this.paymentDays = getPaymentDays(period);
  }
    
  public float calculatePayment() {
    int workingDays = getWorkingDays();
    if (workingDays < paymentDays) {
      return 0.0f;
    }
    return paymentDays * dailyRate * (int) Math.floor(workingDays / paymentDays);
  }
  
  private int getWorkingDays() {
    return workingHours / Payable.WORKING_HOURS_PER_DAY;
  }
  
  private int getPaymentDays(PaymentPeriod period) {
    if (period == PaymentPeriod.WEEKLY) {
      return 5;
    } else if (period == PaymentPeriod.BIWEEKLY) {
      return 10;
    } else if (period == PaymentPeriod.MONTHLY) {
      return 20;
    }
    return 0;
  }
}