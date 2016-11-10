import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

import firm.stuff.FixedRateEmployee;
import firm.stuff.Volunteer;
import firm.Payable;
import firm.PaymentPeriod;

public class TestForEmployee {
  private FixedRateEmployee worker1;
  private FixedRateEmployee worker2;
  private Volunteer volunteer1;

  private static final int WORKING_DAYS_PER_WEEK = 5;
  private static final int WORKING_DAYS_PER_TWO_WEEKS = 5 * 2;
  private static final int WORKING_DAYS_PER_MONTH = 5 * 4;

  @Before
  public void setUp() {
    worker1 = new FixedRateEmployee("James Gosling", 10.00f, PaymentPeriod.MONTHLY);
    worker2 = new FixedRateEmployee("Herbert Schildt", 20.00f, PaymentPeriod.WEEKLY );
    volunteer1 = new Volunteer("Linus Tovalds");
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
    assertThat(volunteer1.getName(), is("Linus Tovalds"));
  }


}
