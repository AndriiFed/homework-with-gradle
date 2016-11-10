package firm.stuff;

import firm.Employee;
import firm.PaymentPeriod;

public class FixedRateEmployee extends Employee {
  private float daysalary;
  private PaymentPeriod period;
  private String name;
  private int salaryfactor = 1;
  private static final int WORKING_DAYS_PER_WEEK = 5;
  private static final int WORKING_DAYS_PER_TWO_WEEKS = 5 * 2;
  private static final int WORKING_DAYS_PER_MONTH = 5 * 4;

  public float salary;

  public FixedRateEmployee(String name, float daysalary, PaymentPeriod period) {
    super(name);
    this.daysalary = daysalary;
    this.period = period;
  }

  public void setWorkingHours(int workingHours) {
    if (period == PaymentPeriod.WEEKLY) {
      if (workingHours < WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_WEEK) {
        salaryfactor = 0;
        return;
      } else if (workingHours > WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_WEEK) {
        salaryfactor = (int) workingHours / (WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_WEEK);
        return;
      }
    }
    if (period == PaymentPeriod.BIWEEKLY) {
      if (workingHours < WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_TWO_WEEKS) {
        salaryfactor = 0;
        return;
      } else if (workingHours > WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_TWO_WEEKS) {
        salaryfactor = (int) workingHours / (WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_TWO_WEEKS);
        return;
      }
    }
    if (period == PaymentPeriod.MONTHLY) {
      if (workingHours < WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_MONTH) {
        salaryfactor = 0;
        return;
      } else if (workingHours > WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_MONTH) {
        salaryfactor = (int) workingHours / (WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_MONTH);
        return;
      }
    }
  }

  public float calculatePayment() {
    salary = 0;
    switch (period) {
      case WEEKLY: salary += daysalary * WORKING_DAYS_PER_WEEK;
        break;
      case BIWEEKLY: salary += daysalary * WORKING_DAYS_PER_TWO_WEEKS;
        break;
      default: salary += daysalary * WORKING_DAYS_PER_MONTH;
    }
    return salary * salaryfactor;
  }

}
