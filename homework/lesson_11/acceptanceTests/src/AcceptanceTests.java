import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import calculator.SimpleStringCalculator;

public class AcceptanceTests {
  @Test
  public void testExample() {
    SimpleStringCalculator calc = new SimpleStringCalculator();

    assertThat(calc.add("#2,2,1001+2#2"), is(8));
  }
}
