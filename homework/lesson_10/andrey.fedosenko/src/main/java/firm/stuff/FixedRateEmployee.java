package firm.stuff;

import firm.Employee;
import firm.PaymentPeriod;

public class FixedRateEmployee extends Employee {
  private float daysalary;
  private PaymentPeriod period;
  private String name;
  private int salaryflag = 1;
  private static final int WORKING_DAYS_PER_WEEK = 5;
  private static final int WORKING_DAYS_PER_TWO_WEEKS = 5 * 2;
  private static final int WORKING_DAYS_PER_MONTH = 5 * 4;

  public float salary = 0;

  public FixedRateEmployee(String name, float daysalary, PaymentPeriod period) {
    this.name = name;
    this.daysalary = daysalary;
    this.period = period;
  }

  public void setWorkingHours(int workingHours) {
    if (period == PaymentPeriod.WEEKLY && workingHours < WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_WEEK) {
      salaryflag = 0;
      return;
    }
    if (period == PaymentPeriod.BIWEEKLY && workingHours < WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_TWO_WEEKS) {
      salaryflag = 0;
      return;
    }
    if (period == PaymentPeriod.MONTHLY && workingHours < WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_MONTH) {
      salaryflag = 0;
    }
  }

  public float calculatePayment() {
    switch (period) {
      case WEEKLY: salary += daysalary * WORKING_DAYS_PER_WEEK;
        break;
      case BIWEEKLY: salary += daysalary * WORKING_DAYS_PER_TWO_WEEKS;
        break;
      default: salary += daysalary * WORKING_DAYS_PER_MONTH;
    }
    return salary * salaryflag;
  }

  public String getName() {
    return name;
  }

}
