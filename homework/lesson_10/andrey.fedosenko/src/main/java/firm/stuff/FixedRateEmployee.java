package firm.stuff;

import firm.Employee;
import firm.Payable;
import firm.PaymentPeriod;

public class FixedRateEmployee extends Employee {
  private float daySalary;
  private PaymentPeriod period;
  private static final int WORKING_DAYS_PER_WEEK = 5;
  private static final int WORKING_DAYS_PER_TWO_WEEKS = 5 * 2;
  private static final int WORKING_DAYS_PER_MONTH = 5 * 4;

  public FixedRateEmployee(String name, float daySalary, PaymentPeriod period) {
    super(name);
    this.daySalary = daySalary;
    this.period = period;
  }

  public float calculatePayment() {

    if (getWorkingHours() / WORKING_HOURS_PER_DAY  < period.getDaysNumber()) {
      return 0f;
    }

    return
      daySalary * period.getDaysNumber() * (int) (getWorkingHours() / WORKING_HOURS_PER_DAY / period.getDaysNumber());
  }

}
