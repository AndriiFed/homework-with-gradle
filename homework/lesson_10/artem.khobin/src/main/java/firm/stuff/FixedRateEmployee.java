package firm.stuff;

import firm.Employee;
import firm.PaymentPeriod;

public class FixedRateEmployee extends Employee {
  protected int paymentDaysPeriod;
  protected float dailyRate;

  public FixedRateEmployee(String employeeName, float employeeRate, PaymentPeriod employeePaymentPeriod) {
    super(employeeName);
    dailyRate = employeeRate;
    paymentDaysPeriod = employeePaymentPeriod.getDaysNumber();
  }

  public float calculatePayment() {
    int fullWorkingDays = workingHours / WORKING_HOURS_PER_DAY;
    if (fullWorkingDays < paymentDaysPeriod) {
      return 0;
    }
    return (fullWorkingDays - (fullWorkingDays % paymentDaysPeriod)) * dailyRate;
  }

}
