import org.junit.Test;
import org.junit.Before;
import java.lang.Math;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.core.IsEqual.equalTo;

import firm.stuff.FixedRateEmployee;
import firm.stuff.Volunteer;
import firm.stuff.Manager;
import firm.Payable;
import firm.PaymentPeriod;

public class TestForEmployee {
  private FixedRateEmployee worker1;
  private FixedRateEmployee worker2;
  private Volunteer volunteer1;
  private Manager manager;

  private static final int WORKING_DAYS_PER_WEEK = 5;
  private static final int WORKING_DAYS_PER_TWO_WEEKS = 5 * 2;
  private static final int WORKING_DAYS_PER_MONTH = 5 * 4;

  @Before
  public void setUp() {
    worker1 = new FixedRateEmployee("James Gosling", 10.00f, PaymentPeriod.MONTHLY);
    worker2 = new FixedRateEmployee("Herbert Schildt", 20.00f, PaymentPeriod.WEEKLY );
    volunteer1 = new Volunteer("Linus Tovalds");
    manager = new Manager("Sale Guru", 100.00f, PaymentPeriod.BIWEEKLY);
  }

  @Test
  public void simpleFixedPriceTest_whenWorkedSeveralWholePaymentPeriod_shouldReceivePaymentForAll() {
    worker1.setWorkingHours(Payable.WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_MONTH * 2);
    assertThat((double)worker1.calculatePayment(), is(closeTo(10.00 * WORKING_DAYS_PER_MONTH * 2, 0.01)));

    worker2.setWorkingHours(Payable.WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_WEEK * 10);
    assertThat((double)worker2.calculatePayment(), is(closeTo(20.00 * WORKING_DAYS_PER_WEEK * 10, 0.01)));
  }

  @Test
  public void simpleVolunteer_getNameTest() {
    assertThat(volunteer1.getName(), equalTo("Linus Tovalds"));
  }

  @Test
  public void volunteerPayments_shouldBeZero_regardlessToWorkingHours() {
    volunteer1.setWorkingHours((int) Math.random() * 100);

    assertThat((double)volunteer1.calculatePayment(), is(closeTo(0.00, 0.01)));
  }

  @Test
  public void simpleFixedPriceTest_whenWorkedMoreThanWholePaymentPeriod_shouldReceivePaymentForThePeriodOnly_noExtraPayments() {
    worker1.setWorkingHours(Payable.WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_MONTH + 159);
    worker2.setWorkingHours(Payable.WORKING_HOURS_PER_DAY * WORKING_DAYS_PER_WEEK + 39);

    assertThat((double)worker1.calculatePayment(), is(closeTo(10.00 * WORKING_DAYS_PER_MONTH, 0.01)));
    assertThat((double)worker2.calculatePayment(), is(closeTo(20.00 * WORKING_DAYS_PER_WEEK, 0.01)));
  }

  @Test
  public void testManagerPayments_withBonus_butLessThanPaymentPeriod_mustBeZero() {
    float bonus = 100.00f;
    manager.setWorkingHours(WORKING_DAYS_PER_WEEK * Payable.WORKING_HOURS_PER_DAY + 39);
    manager.setBonus(bonus);
    // NO SALARY - NO BONUS :(

    assertThat((double)manager.calculatePayment(), is(closeTo(0.0, 0.1)));
  }

}
