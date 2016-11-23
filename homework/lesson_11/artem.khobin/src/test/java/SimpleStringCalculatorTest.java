import calculator.SimpleStringCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class SimpleStringCalculatorTest {
  SimpleStringCalculator calc;
  @Before
  public void init() {
    calc = new SimpleStringCalculator();
  }
  @Test
  public void testEmptyString() {
    assertThat(calc.add(""), is(0));
  }

  @Test
  public void testSimpleAdd() {
    assertThat(calc.add("15+4,3"), is(22));
  }

  @Test
  public void testAddWithAdditionalDelimiter() {
    assertThat(calc.add("#15+84#1,10"), is(110));
  }

  @Test
  public void testAddWithAdditionalDelimiter2() {
    assertThat(calc.add(".15+84.1,10"), is(110));
  }

  @Test
  public void testAddWithOneOperand() {
    assertThat(calc.add("45"), is(45));
  }

  @Test
  public void testAddWithOneOperandAndDelimiter() {
    assertThat(calc.add("@45"), is(45));
  }

  @Test
  public void testAddWithNegativeNumber() {
    assertThat(calc.add("5,-5,3"), is(-1));
  }

  @Test
  public void testAddWithNumberOverLimit() {
    assertThat(calc.add("5,1001+3"), is(8));
  }

  @Test
  public void testAddWithNumberEqualsLimit() {
    assertThat(calc.add("5,1000+3"), is(1008));
  }

  @Test
  public void testAddWithNumberNearLimit() {
    assertThat(calc.add("7+999,5"), is(1011));
  }
}
