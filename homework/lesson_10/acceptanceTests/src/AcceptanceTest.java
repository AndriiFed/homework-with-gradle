import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

import firm.stuff.FixedRateEmployee;
import firm.stuff.HourlyRateEmployee;
import firm.stuff.Manager;
import firm.stuff.Volunteer;

import firm.Employee;
import firm.Payable;
import firm.PaymentPeriod;

public class AcceptanceTest {
  private Manager manager;
  private FixedRateEmployee worker1;
  private FixedRateEmployee worker2;
  private HourlyRateEmployee worker3;
  private HourlyRateEmployee worker4;
  private Volunteer worker5;

  private final static int WORKING_DAYS_PER_WEEK = 5;
  private final static int WORKING_DAYS_PER_TWO_WEEKS = 5 * 2;
  private final static int WORKING_DAYS_PER_MONTH = 5 * 4;

  @Before
  public void setUp() {
    manager = new Manager("John Doe", 100.00f, PaymentPeriod.WEEKLY);
    worker1 = new FixedRateEmployee("Tomas Lansky", 10.00f, PaymentPeriod.MONTHLY);
    worker2 = new FixedRateEmployee("Jerry Signfield", 25.00f, PaymentPeriod.BIWEEKLY);
    worker3 = new HourlyRateEmployee("Katy Monks", 5.00f);
    worker4 = new HourlyRateEmployee("Abigail Spolsky", 4.00f);
    worker5 = new Volunteer("Homeless \"Mustard\"");
  }

  @Test
  public void testManagerPaymentsForWeek_withoutBonus() {
    manager.setWorkingHours(WORKING_DAYS_PER_WEEK * Payable.WORKING_HOURS_PER_DAY);

    assertThat((double)manager.calculatePayment(), is(closeTo(100.00 * WORKING_DAYS_PER_WEEK, 0.1)));
  }

  @Test
  public void testManagerPaymentsForWeek_withBonus() {
    float bonus = 100.00f;
    manager.setWorkingHours(WORKING_DAYS_PER_WEEK * Payable.WORKING_HOURS_PER_DAY);
    manager.setBonus(bonus);

    assertThat((double)manager.calculatePayment(), is(closeTo(100.00 * WORKING_DAYS_PER_WEEK + bonus, 0.1)));
  }

  @Test
  public void simpleFixedPriceTest_whenWorkedWholePaymentPeriod_shouldReceivePayment() {
    worker1.setWorkingHours(Payable.WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_MONTH);
    worker2.setWorkingHours(Payable.WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_TWO_WEEKS);

    assertThat((double)worker1.calculatePayment(), is(closeTo(10.00 * WORKING_DAYS_PER_MONTH, 0.01)));
    assertThat((double)worker2.calculatePayment(), is(closeTo(25.00 * WORKING_DAYS_PER_TWO_WEEKS, 0.01)));
  }

  @Test
  public void simpleFixedPriceTest_whenWorkedLessThanWholePaymentPeriod_paymentShouldStayZero() {
    worker1.setWorkingHours(Payable.WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_MONTH - 8);
    worker2.setWorkingHours(Payable.WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_TWO_WEEKS - 8);

    assertThat((double)worker1.calculatePayment(), is(closeTo(0.00, 0.01)));
    assertThat((double)worker2.calculatePayment(), is(closeTo(0.00, 0.01)));
  }

  @Test
  public void simpleFixedPriceTest_whenWorkedMoreThanWholePaymentPeriod_shouldReceivePaymentForThePeriodOnly_noExtraPayments() {
    worker1.setWorkingHours(Payable.WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_MONTH + 8);
    worker2.setWorkingHours(Payable.WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_TWO_WEEKS + 8);

    assertThat((double)worker1.calculatePayment(), is(closeTo(10.00 * WORKING_DAYS_PER_MONTH, 0.01)));
    assertThat((double)worker2.calculatePayment(), is(closeTo(25.00 * WORKING_DAYS_PER_TWO_WEEKS, 0.01)));
  }

  @Test
  public void simpleFixedPriceTest_whenWorkedTwoWholePaymentPeriod_shouldReceivePaymentForBoth() {
    worker1.setWorkingHours(Payable.WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_MONTH * 2);
    worker2.setWorkingHours(Payable.WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_TWO_WEEKS * 2);

    assertThat((double)worker1.calculatePayment(), is(closeTo(10.00 * 2 * WORKING_DAYS_PER_MONTH, 0.01)));
    assertThat((double)worker2.calculatePayment(), is(closeTo(25.00 * 2 * WORKING_DAYS_PER_TWO_WEEKS, 0.01)));
  }

  @Test
  public void hourlyRatedEmployeesShouldReceive_theMultiplicationOf_rateAndHours() {
    worker3.setWorkingHours(Payable.WORKING_HOURS_PER_DAY * 10);
    worker4.setWorkingHours(Payable.WORKING_HOURS_PER_DAY * 2);

    assertThat((double)worker3.calculatePayment(), is(closeTo(5.00 * Payable.WORKING_HOURS_PER_DAY * 10, 0.01)));
    assertThat((double)worker4.calculatePayment(), is(closeTo(4.00 * Payable.WORKING_HOURS_PER_DAY * 2, 0.01)));
  }

  @Test
  public void volunteerPayments_shouldBeZero_regardlessToWorkingHours() {
    worker5.setWorkingHours(Payable.WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_MONTH);

    assertThat((double)worker5.calculatePayment(), is(closeTo(0.00, 0.01)));
  }
}
